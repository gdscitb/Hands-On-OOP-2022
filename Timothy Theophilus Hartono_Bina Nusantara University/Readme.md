# Hands On OOP

## Deskripsi Program

Program ini merupakan sebuah simulasi atau permainan lomba lari antara kelinci dan kura-kura.

User dapat melakukan beberapa kegiatan:

- Add Runner: Untuk melakukan pendaftaran pelari.
- Join Runner: Untuk melakukan simulasi lomba.
- View Standing: Untuk melihat history perlombaan.
- Close Program: Untuk exit dari program.

## Penjelasan Design Pattern

Program ini menggunakan Behavioral Pattern (Pola perilaku) yaitu Template Methode. Dimana dalam class `Runner` menjadi Template atau base class dari subclass `Hare` dan `Turtle`. Dan pada subclass `Hare` dan `Turtle` dilakukan definisi kembali langkah-langkah tertentu (override) pada beberapa function.

## Cara Menjalankan Program

User dapat menjalankan `App.java`. Kemudian user dapat melihat menu awal dari program ini.

## Versi Bahasa dan Depedency

Program ini menggunakan JavaSE-1.8
