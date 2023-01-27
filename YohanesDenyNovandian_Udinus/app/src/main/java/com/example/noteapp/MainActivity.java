package com.example.noteapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.room.Database;

import com.example.noteapp.Database.RoomDB;
import com.example.noteapp.Models.Notes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.noteapp.Adapters.NotesListAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{
//    deklarasi ambil data ditampilkan di main
    private FirebaseUser user;
    private DatabaseReference reference;
    private String userID;
//    deklarasi firebase logout
    private Button logout;
//    deklarasai note
    RecyclerView recyclerView;
    NotesListAdapter notesListAdapter;


    List<Notes> notes = new ArrayList<>();
    RoomDB database;
    FloatingActionButton fab_add;
    SearchView searchView_home;
    Notes selectedNote;
//    membuat objek untuk recycler view dan adapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        inisialisasi ambil data dari realtime database
        user = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference();
        userID = user.getUid();

        final TextView greetingTextView = (TextView) findViewById(R.id.greeting);

        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userProfile = snapshot.getValue(User.class);

                if(userProfile != null){
                    String fullName = userProfile.fullName;

                    greetingTextView.setText("Selamat Datang, " + fullName + " !");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(MainActivity.this, "Terjadi Kesalahan !", Toast.LENGTH_LONG).show();
            }
        });

//        inisialisasi logout
        logout = (Button) findViewById(R.id.btn_signOut);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

//deklarasi sesuai di activity main layout dari recycvle dan pin
        recyclerView = findViewById(R.id.recycler_home);
        fab_add = findViewById(R.id.fab_add);
        searchView_home = findViewById(R.id.searchView_home);

        database = RoomDB.getInstance(this);
        notes = database.mainDAO().getAll();
//mengedit text
        updateRecycler(notes);
//fungsi ketika diklik masuk ke note taker layout untuk penulisan note baru
        fab_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NotesTakerActivity.class);
//                kenapa 101 karena kana membuat data by pass langsing  jika update code nya 102
                startActivityForResult(intent, 101);
            }
        });

//        fungsi untuk mencari note
        searchView_home.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
//                sebelum menjadi fungsi utuh buat fungsi pendukung yait filter
                filter(newText);
                return true;
            }
        });
    }

    private void filter(String newText) {
        List<Notes> filteredList = new ArrayList<>();
        for (Notes singleNote : notes){
            if (singleNote.getTitle().toLowerCase().contains(newText.toLowerCase())
                    || singleNote.getNotes().toLowerCase().contains(newText.toLowerCase())){
                        filteredList.add(singleNote);
            }
        }
        notesListAdapter.filterList(filteredList);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 101 ){
//            jika data tidak kosong/seperti di notes taker activity maka akan di update
            if(resultCode == RESULT_OK){
                Notes new_notes = (Notes) data.getSerializableExtra("notes");
                database.mainDAO().insert(new_notes);
                notes.clear();
//                data yang diterim dari notes taker activity akan di masukan ke database
                notes.addAll(database.mainDAO().getAll());
//                informasi jika data berubah
                notesListAdapter.notifyDataSetChanged();
            }
        }
//        jika request code yang dikirim 102 lalu memastikan data baru yang di update
        if(requestCode == 102){
            if(resultCode == Activity.RESULT_OK){
                Notes new_notes = (Notes) data.getSerializableExtra("notes");
                database.mainDAO().update(new_notes.getID(), new_notes.getTitle(), new_notes.getNotes());
                notes.clear();
                notes.addAll(database.mainDAO().getAll());
                notesListAdapter.notifyDataSetChanged();
            }
        }
    }

    // membuat tampilan recycler nya berbentuk grid yang kolomnya 2 kebawah
    private void updateRecycler(List<Notes> notes) {
        recyclerView.setHasFixedSize(true);
//        mengatur tampilan cardvie berbentuk grid dengan colom 2 dan vertikal kebaha notenya
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL));
//        parameter ini memanggil fungsi objek nites click listener dibawahnya yaitu on clik dan omnm long click
        notesListAdapter = new NotesListAdapter(MainActivity.this, notes, notesClickListener);
        recyclerView.setAdapter(notesListAdapter);
    }
    //ketika memanggil notes list listener langsung memanggil kedua fungsi
    private final NotesClickListener notesClickListener = new NotesClickListener() {
        @Override
        public void onClick(Notes notes) {
//            fungsi memindahkan ke layout form isi catatn
            Intent intent = new Intent(MainActivity.this, NotesTakerActivity.class);
//            mengirim data sebelumnya ke notes taker activity
            intent.putExtra("old_note", notes);
//            karna jika baru menambahkan data 101 jika sudah ada data 102
            startActivityForResult(intent, 102);
        }
//untuk membuat pin harus tekan lam klik
        @Override
        public void onLongClick(Notes notes, CardView cardView) {
            selectedNote = new Notes();
            selectedNote = notes;
            showPopup(cardView);

        }
    };
//lalu lanjutan untuk membuat pin harus membuat menu pop up pada pojo kana atas
    private void showPopup(CardView cardView) {
        PopupMenu popupMenu = new PopupMenu(this, cardView);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.popup_menu);
        popupMenu.show();
    }
//ini lanjutan juga untuk memilih note apakah akan di pin atau di hapus
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.pin:
               if(selectedNote.isPinned()) {
                   database.mainDAO().pin(selectedNote.getID(), false);
                   Toast.makeText(MainActivity.this, "Unpinned!", Toast.LENGTH_SHORT).show();
               }
               else {
                   database.mainDAO().pin(selectedNote.getID(), true);
                   Toast.makeText(MainActivity.this, "Pinned!", Toast.LENGTH_SHORT).show();
               }
                notes.clear();
               notes.addAll(database.mainDAO().getAll());
               notesListAdapter.notifyDataSetChanged();
               return true;
//               fungsi untuk menghapus note
            case R.id.delete:
                database.mainDAO().delete(selectedNote);
                notes.remove(selectedNote);
                notesListAdapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Note Deleted!", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            moveTaskToBack(true);
        }
        return super.onKeyDown(keyCode, event);
    }

}