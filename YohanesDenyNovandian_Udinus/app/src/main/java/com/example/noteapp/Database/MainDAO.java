package com.example.noteapp.Database;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.noteapp.Models.Notes;

import java.util.List;

//membuat anotation untuk Databse Akses Objek dan auto import library DAO
@Dao
public interface MainDAO {
    //menggambil data dari database models objek nya notes
//on conflik strategi replace untuk mengganti data yang sudah ada
    @Insert(onConflict = REPLACE)
    void insert(Notes notes);
    //mengambil semua data dari database- dan menggunakan urutan descending karna menampilkan noete dari yang terbaru
    @Query("SELECT * FROM notes ORDER BY ID DESC")
    List<Notes> getAll();
    //mengambil data dari database berdasarkan id title(dari database), =:title (dari parameter)
    @Query("UPDATE notes SET title = :title, notes = :notes WHERE ID = :id")
    void update(int id, String title, String notes);
    //    delete
    @Delete
    void delete(Notes notes);

    @Query("UPDATE notes SET pinned = :pin WHERE ID = :id")
    void pin(int id, boolean pin);
}
