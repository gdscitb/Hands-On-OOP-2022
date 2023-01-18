# Hands On OOP: Pembuatan Tiket Pesawat

## Deskripsi Program

Program ini membuat tiket pesawat dengan beberapa kategori: Economy Class, Business Class, dan First Class. ```Pesawat``` menjadi abstract class (kelas induk) yang ditujukan untuk pengguna yang ingin memesan tiket untuk kategori Economy Class. Kategori ```BusinessClass``` dan ```FirstClass``` merupakan derived class dari abstract class Pesawat.

Berikut daftar harga tiket dalam satuan Euro:
- Economy Class: Jumlah orang dewasa * 350 + jumlah orang anak * 300
- Business Class: Jumlah orang dewasa * 1400 + jumlah orang anak * 1300 + jumlah fasilitas * 100
- First Class: Jumlah orang dewasa * 2500 + jumlah orang anak * 2400 + jumlah fasilitas * 500

## Design Pattern

Untuk program ini, saya memilih design pattern berupa Abstract Factory. Dengan men-declare ```Pesawat``` sebagai Abstract Product, class ```BusinessClass``` dan ```FirstClass``` sebagai Concrete Product dapat mengimplementasikan abstract class ```Pesawat```. Lalu, ada konstruktor Abstract Factory berupa ```Pesawat()``` yang berfungsi menciptakan objek ```Pesawat``` baru. Lalu, diciptakan konstruktor-konstruktor lain (Concrete Factory) berdasarkan Abstract Factory yang telah dibuat, seperti ```BusinessClass()``` dan ```FirstClass()```. Untuk kenyamanan, konstruktor dan metode-metode Product disatukan dalam masing-masing class. Adapun Abstract Product termasuk metode ```ticket_cost()``` dan ```print_ticket()```, Concrete Product termasuk ```print_ticket()``` pada masing-masing kelas dan penghitungan fasilitas ekstra tergantung kelasnya. Saya memilih design pattern Abstract Factory karena sebenarnya pembuatan dan penghitungan kategori Business Class dan First Class hanya perlu diwariskan dari abstract class utamanya, sehingga produksi dari abstract class lebih efisien daripada mengetik ulang lagi kode dari abstract class.

## Cara Menjalankan Program

File ```mainprogram.cpp``` dijalankan. Pengguna memasukkan: a) Nama maskapai, b) Pilihan kabin (harus divalidasi agar menerima Economy Class, Business Class, atau First Class), c) Pilihan kursi, d) Jumlah dewasa (harus divalidasi agar tidak negatif), e) Jumlah anak (harus divalidasi agar tidak negatif), f) Jumlah fasilitas (khusus untuk Business Class atau First Class, harus divalidasi agar tidak negatif). Output berupa info ticket, contohnya ebagai berikut:

```
Here's your ticket!       
Nama pesawat: Garuda      
Pilihan kabin: First Class
Nomor kursi: 5F
Jumlah dewasa: 6
Jumlah anak-anak: 2
Total: 21300
Have a nice flight!
```

## Versi Bahasa dan Dependency

Bahasa menggunakan C++17. Program mungkin memerlukan ```mainprogram.exe``` agar dapat dijalankan.

## Lain-lain

Program ini memanfaatkan input dari pengguna (interactive program)
