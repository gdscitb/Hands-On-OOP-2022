# Hands On OOP: Pembuatan Tiket Pesawat

## Deskripsi Program
Program ini membuat tiket pesawat dengan beberapa kategori: Economy Class, Business Class, dan First Class. ```Pesawat``` menjadi abstract class (kelas induk) yang ditujukan untuk pengguna yang ingin memesan tiket untuk kategori Economy Class. Kategori ```BusinessClass``` dan ```FirstClass``` merupakan derived class dari abstract class Pesawat.

Berikut daftar harga tiket dalam satuan Euro:
- Economy Class: Jumlah orang dewasa * 350 + jumlah orang anak * 300
- Business Class: Jumlah orang dewasa * 1400 + jumlah orang anak * 1300 + jumlah fasilitas * 100
- First Class: Jumlah orang dewasa * 2500 + jumlah orang anak * 2400 + jumlah fasilitas * 500

## Design Pattern

Untuk program ini, saya memilih design pattern berupa Abstract Factory. Dengan men-declare ```Pesawat``` sebagai Abstract Product, class ```BusinessClass``` dan ```FirstClass``` sebagai Concrete Product dapat mengimplementasikan abstract class ```Pesawat```. Lalu, ada konstruktor Abstract Factory berupa ```Pesawat()``` yang berfungsi menciptakan objek ```Pesawat``` baru. Lalu, diciptakan konstruktor-konstruktor lain (Concrete Factory) berdasarkan Abstract Factory yang telah dibuat, seperti ```BusinessClass()``` dan ```FirstClass()```. Untuk kenyamanan, konstruktor dan metode-metode Product disatukan dalam masing-masing class. Adapun Abstract Product termasuk metode ```ticket_cost()``` dan ```print_ticket()```, Concrete Product termasuk ```print_ticket()``` pada masing-masing kelas dan penghitungan fasilitas ekstra tergantung kelasnya. Saya memilih design pattern Abstract Factory karena sebenarnya pembuatan dan penghitungan kategori Business Class dan First Class hanya perlu diwariskan dari abstract class utamanya, sehingga produksi dari abstract class lebih efisien daripada mengetik ulang lagi kode dari abstract class.

### Beberapa Bonus yang Direkomendasikan
- Stream API dan/atau functional programming
- Multilevel inheritance
- Interactive program (Menerima input dan mengeluarkan output sesuai input)

## Penjelasan Program
Selain membuat program, kalian perlu menuliskan penjelasan program kalian, dengan seminimalnya berisikan
- Deskripsi program
- Penjelasan design pattern yang dipilih
- Letak implementasi design pattern tersebut
- Alasan pemilihan design pattern tersebut
- Cara menjalankan program
- Versi bahasa dan dependency (jika ada) yang digunakan
- Konsep-konsep lain yang kalian gunakan dan keunikan program (jika ada)

## Pengumpulan
- Pengumpulan tugas ini mirip dengan tugas sebelumnya. 
- Fork ke repository github kalian masing - masing
- Buka repository pada repo yang telah di fork sebelumnya
- Clone repository tersebut pada vscode / IDE kalian
- Buat program sesuai deskripsi di atas di dalam folder dengan format `Nama_Univ`
- Tulis penjelasan program kalian pada file `README.md` di dalam folder tersebut
- Add folder tersebut ke dalam staging
- Letakkan folder tersebut sejajar dengan file README.md
- Lalu commit dengan pesan "Hands on OOP submission by < Nama kalian >"
- Setelah itu push kembali ke repository kalian
- Pull request kedalam repository GDSC yang sudah anda fork tadi
- Isi judul pull request dengan "Hands on OOP submission by < Nama kalian >"

## Bahasa Pemrograman
Tidak semua bahasa pemrograman dapat mengimplementasikan OOP. Untuk tugas ini, ada bahasa yang dapat digunakan dan tidak dapat digunakan.

### Bahasa yang dapat digunakan
Selain bahasa di bawah ini, kalian dapat me-request bahasa lain, dengan persetujuan tim kurikulum GDSC ITB

- C++
- Java
- Kotlin
- Typescript
- Go (Golang)
- C#

### Bahasa yang tidak dapat digunakan
Karena keterbatasan di bahasa-bahasa berikut, bahasa di bawah ini tidak digunakan di tugas ini
- Python
- PHP
- C

## Deliverable
- Kumpulkan link github fork repository dan link pull request kalian ke gform yang dibagikan

## Deadline
- Jumat, 27 Januari 2023, pukul 23.59

