package com.example.noteapp.Adapters;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.noteapp.Models.Notes;
import com.example.noteapp.NotesClickListener;
import com.example.noteapp.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//supaya Note list adapter merujuk ke recycler view Notes View Holder
public class NotesListAdapter extends RecyclerView.Adapter<NotesViewHolder>{
    Context context;
    List<Notes> list;
    //    mendefinisikan objek yangsudah didefinisikan pada interface notesclick listener
    NotesClickListener listener;

    //  membuat konstruktor onclik listener
    public NotesListAdapter(Context context, List<Notes> list, NotesClickListener listener) {
        this.context = context;
        this.list = list;
        this.listener = listener;
    }
    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NotesViewHolder(LayoutInflater.from(context).inflate(R.layout.note_list, parent, false));
    }


    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {
        holder.textView_title.setText(list.get(position).getTitle());
        //fungsi untuk membuat title berjalan seacara horizontal
        holder.textView_title.setSelected(true);
        holder.textView_notes.setText(list.get(position).getNotes());
        holder.textView_date.setText(list.get(position).getDate());
        //fungsi untuk membuat tanggal berjalan seacar  horizontal
        holder.textView_date.setSelected(true);
        //kondidi untuk pin jika benar pin akan dipasang ke dalam cardview/note nya
        if (list.get(position).isPinned()){
            holder.imageView_pin.setImageResource(R.drawable.ic_pin);
        }else {
//            jika salah maka tidak di pin tidak ada objek yang di pin
            holder.imageView_pin.setImageResource(0);
        }
//
//
//        membuat fungsi untuk memberi warna acak ketika ditambahkan note baru dibuat  warna cardview
        int color_code = getRandomColor();
        holder.notes_container.setCardBackgroundColor(holder.itemView.getResources().getColor(color_code, null));
//        menambhakan fungsi in clik dan on long click yang sudag dibuat pada interface
//        fungsi ketika diklik sekali akan masuk ke catatan
        holder.notes_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(list.get(holder.getAdapterPosition()));
            }
        });
//       membuat fungsi ketika ditekan lama menunya beda
        holder.notes_container.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                listener.onLongClick(list.get(holder.getAdapterPosition()), holder.notes_container);
                return true;
            }
        });

    }
    //  merubah warna ketika di klik pin
//    membuat array yang berisi 5 warna
    private int getRandomColor(){
        List<Integer> colorCode = new ArrayList<>();
//        menambahkan array dinamis menggunakan add
        colorCode.add(R.color.color1);
        colorCode.add(R.color.color2);
        colorCode.add(R.color.color3);
        colorCode.add(R.color.color4);
        colorCode.add(R.color.color5);

        Random random = new Random();
        int random_color = random.nextInt(colorCode.size());
        return colorCode.get(random_color);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void filterList(List<Notes> filteredList){
        list = filteredList;
        notifyDataSetChanged();
    }
}
class NotesViewHolder extends RecyclerView.ViewHolder {


    CardView notes_container;
    TextView textView_title, textView_notes, textView_date;
    ImageView imageView_pin;

    public NotesViewHolder(@NonNull View itemView) {
        super(itemView);
        notes_container = itemView.findViewById(R.id.notes_container);
        textView_title = itemView.findViewById(R.id.textView_title);
        textView_notes = itemView.findViewById(R.id.textView_notes);
        textView_date = itemView.findViewById(R.id.textView_date);
        imageView_pin = itemView.findViewById(R.id.imageView_pin);
    }
}
