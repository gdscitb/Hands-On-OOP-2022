package com.example.noteapp;

import androidx.cardview.widget.CardView;

import com.example.noteapp.Models.Notes;

public interface NotesClickListener {
    //    membuat dua fungsi on tekan sekali
    void onClick(Notes notes);
    //    memebuat fujgsi tekan lama
    void onLongClick(Notes notes, CardView cardView);
}
