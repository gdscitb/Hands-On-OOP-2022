package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;
import com.example.noteapp.Models.Notes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

//untuk mengisi note baru
public class NotesTakerActivity extends AppCompatActivity {
    EditText editText_title, editText_notes;
    ImageView imageView_save;
    Notes notes;
    boolean isOldNote= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_taker);

        imageView_save = findViewById(R.id.imageView_save);
        editText_title = findViewById(R.id.editText_title);
        editText_notes = findViewById(R.id.editText_notes);

        notes = new Notes();
//        kondisi untuk menghindari ketika edut malah jadi xrash
        try {
//ketika di klik akan masuk ke note taker acticity adalah get seriazeble extra atau mengambil data
//        yang di kirim dari main activity(old note)
            notes = (Notes) getIntent().getSerializableExtra("old_note");
//            merubah note jadi edit tekxt
            editText_title.setText(notes.getTitle());
            editText_notes.setText(notes.getNotes());
//            membuat old note yang sebekumnya di deklarasikan false menjadi true
            isOldNote = true;
        }catch (Exception e){
            e.printStackTrace();
        }


// kertika tombol save diklik akan mengirim data dan mengembalikan ke main acgtivity
        imageView_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = editText_title.getText().toString();
                String description = editText_notes.getText().toString();
//                jika tidak ada catatan maka akan muncul toast bahwa catatan tidak boleh kosong
                if (description.isEmpty()){
                    Toast.makeText(NotesTakerActivity.this, "Please add some notes", Toast.LENGTH_SHORT).show();
//                    maka akan tetapd dihalaman yang sama
                    return;
                }
//                membuat format data  dari teks , haru bulan tahun jam menit dan a untuk am dan pm
                SimpleDateFormat formatter = new SimpleDateFormat("EEE, d MMM yyyy HH:mm a");
                Date date = new Date();
//                memastika data yang diambil data lama
                if(!isOldNote){
                    // mengambil data dari edit text
                    notes = new Notes();
                }

//                mengisi data yang akan di kirim
                notes.setTitle(title);
                notes.setNotes(description);
                notes.setDate(formatter.format(date));
//                mengirim data ke main activity
                Intent intent = new Intent();
                intent.putExtra("notes", notes);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}