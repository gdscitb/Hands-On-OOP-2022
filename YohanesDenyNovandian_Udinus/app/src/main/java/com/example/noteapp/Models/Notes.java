package com.example.noteapp.Models;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;


//untuk meminsahkan data dari acktivity ke activity lain menggunakan seriazable


@Entity(tableName = "notes")
public class Notes implements Serializable {
    //    mendeklarasikan objek
    @PrimaryKey(autoGenerate = true)
    int ID=0;

    @ColumnInfo(name = "title")
    String title= "";

    @ColumnInfo(name = "notes")
    String notes= "";

    @ColumnInfo(name = "date")
    String date= "";

    @ColumnInfo(name = "pinned")
    boolean pinned = false;
    //    setelah membuat objek untuk DDL kita buat getter dan setter untuk mengambil dan mengirim data

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }
}

