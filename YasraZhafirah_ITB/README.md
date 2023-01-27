# LIBRARY MANAGEMENT SYSTEM

## Deskripsi Tugas
- Design Pattern: Program ini menggunakan factory method sebagai design pattern, yang terletak pada class donationGenre yang menambahkan buku baru (yang didonasikan user). Saya memilih design pattern ini untuk menyederhanakan "pembentukan" buku yang memiliki property yang sama dengan buku-buku yang sudah ada.

- SOLID Principle: Singleton Responsibility Principle, di mana setiap class memiliki satu tanggung jawab.

- Inheritance: Salah satu penggunaan Inheritance pada program ini terdapat pada abstract class Book (parent class) yang datanya diturunkan ke class Fiction (child class).

- Polymorphism: Salah satu contoh polymorphism pada program ini yaitu method keterangan() pada class Book yang dipakai oleh class Fiction dan nonFiction sehingga outputnya tergantung objek yang digunakan.

- Interface: Interface yang terdapat pada program ini adalah interface Donation yang memiliki method donateBook().

- Abstract Class: Abstract class pada program ini adalah abstract class Book.

## Bahasa Pemrograman
Bahasa pemrograman yang digunakan adalah Java.

## Penjelasan Program
- Program ini adalah prototype sistem perpustakaan dengan dua jenis/genre buku yaitu fiksi dan non-fiksi.
- Program ini masih jauh dari sempurna dan banyak yang bisa dikembangkan.
- Alur program:
    - User akan ditawarkan menu di mana user memilih apa yang akan dilakukan. Pilihan tersebut berupa meminjam buku, mengembalikan buku, mendonasikan buku, melihat daftar buku, dan keluar.
    - Jika user memilih meminjam buku, user akan diminta input judul buku yang ingin dipinjam. Program akan mencari buku berdasarkan judul tersebut di mana ada tiga kemungkinan: 1) Buku ditemukan dan program menampilkan output bahwa user telah meminjam buku tersebut, 2) Buku tidak ditemukan namun stok sedang kosong, 3) Buku tidak ditemukan.
    - Jika user memilih mengembalikan buku, user akan diminta input judul buku yang ingin dikembalikan. Program akan mencari judul buku yang sama untuk mengecek apakah buku tersebut terdaftar di perpustakaan atau tidak. Ada dua kemungkinan: 1) Buku terdaftar maka buku berhasil dikembalikan dan 2) Buku tidak terdaftar maka judul buku tersebut invalid.
    - Jika user memilih mendonasikan buku, user akan diminta input judul, penulis, genre, dan jumlah buku yang ingin disumbangkan. Akan ada output yang menyatakan user berhasil menyumbang buku.
    - Jika user memilih melihat daftar buku, program akan menampilkan daftar buku yang terdiri dari judul, penulis, dan jumlah buku yang tersedia.
    - Di akhir setiap kegiatan yang dilakukan, program akan menampilkan kembali menu sampai user memutuskan untuk keluar.

## Keterangan Tambahan
Program ini merupakan interactive program (menggunakan input user untuk output yang diinginkan).
