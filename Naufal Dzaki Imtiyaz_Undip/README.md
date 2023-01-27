# Game CLI Based Narto Storm V

## Pejelasan Program
### Deskripsi Program
- Program ini merupakan sebuah game battle sederhana yang berbasi CLI dengan menggunakan bahasa Java.
- User dapat melakukan set player sebagai human ataupun computer.
- Jika player human maka user akan bermain pada game dan melakukan input untuk memberikan aksi pada game.
- Jika player computer maka aksi player tersebut akan dilakukan otomatis oleh sistem.
- Pertarungan yang dapat dilakukan hanya terbatas 2 player saja.
- Dan bisa untuk seluruh player adalah human maupun seluruh player adalah computer.

### Penerapan Konsep OOP
- Inheritance terimplementasikan pada kelas yang memiliki ragam seperti pada kelas Jutsu yang memiliki child class yaitu AttackJutsu dan BuffJutsu.
- Polimorfisme terimplementasikan pada saat membuat instance sebuah Jutsu dan Player.
- Interface terimplementasikan pada interface Player yang nantinya akan diimplemen oleh kelas HumanPlayer dan NonHumanPlayer.

### Penerapan Prinsip SOLID
- Single responsibility Principle
Prinsip ini terimplementasi dimana untuk satu kelas hanya menangani satu tugas saja. Tidak terdapat satu kelas dewa yang menangani semua urusan.
- Open-closed Principle
Prinsip ini terimplementasi dimana untuk menambahkan jenis jutsu yang lain misal UltimateJutsu, kita tidak perlu melakukan modifikasi, cukup lakukan ekstensi dari kelas abstrak Jutsu.
- Dependency Inversion Principle
Prinsip ini terimplementasi dimana untuk kelas yang dependent terhadap kelas lain, ia tidak bergantung pada kelas yang konkrit melainkan sebuah kelas abstrak atau interface.
Seperti pada kelas Shinobi yang dependent terhadap kelas abstrak Jutsu. Serta kelas GameManager yang dependenet terhadap interface Player.

### Penjelasan design pattern yang dipilih
- Disini design pattern yang dipilih adalah **Singleton** dimana terdapat pada class GameManager.
Class tersebut hanya bisa diinstansiasi sebanyak satu kali dan itu berfungsi untuk memulai pertarungan.
Alasan pemilihan design tersebut karena jika terdapat banyak objek dengan kelas tersebut akan sia-sia dan boros resource. Satu saja sudah cukup.
- Kemudian design pattern yang dipilih adalah **Adaptor**
Implementasi tersebut terletak pada kelas StatsEffect dimana merupakan sebuah adaptor untuk kelas Jutsu untuk bisa digunakan oleh kelas Shinobi.
Alasan pemilihan design pattern tersebut adalah agar semua jenis Jutsu hasil turunan dari kelas Jutsu dapat diterima oleh kelas Shinobi
dan tidak memerlukan modifikasi melainkan cukup lakukan ekstensi dari kelas Jutsu.


## Cara Menjalankan Program
1. Clone repository
2. Buka project pada folder yang sudah di clone tadi menggunakan IDE Intellij IDEA (untuk IDE atau text editor lain tidak terjamin aman)
3. Buka file Main.java
4. Lakukan set player 1 dan player 2 ingin sebagai human player atau computer player
5. Pilih karakter dengan memasukkan index list karakter yang sudah disediakan di atas
6. Jalankan program Main.java
7. Selamat bertarung

## Versi Bahasa dan Dependency
Program ditulis menggunakan bahasa Java 19.0.2 dan menggunakan IDE Intellij IDEA.

Kalau dibuka menggunakan VSC entah mengapa terdapat trouble pada saat mengambil inputan dari user.
