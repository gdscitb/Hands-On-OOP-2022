## Deskripsi program
Ini adalah program kompetisi balap MotoGP. Program ini dibuat menggunakan bahasa TypeScript. Secara singkat program ini akan mendaftarkan para pemain MotoGP berdasarkan nama, nomor punggung, kecepatan motor dan brand motornya. Kemudian program ini akan menghitung panjang lintasan dan lap yang dapat disesuaikan melalui kodingan. Setelah itu program akan menjalankan kompetisi dan mengkalkulasi kecepatan motor dengan jarak yang ditempuh. Kemudian akan ditampilkan kecepatan setiap motor dan hasil pemenang tercepat.
## Penjelasan design pattern yang dipilih
Program ini menggunakan Decorator Pattern yaitu pola desain struktural yang memungkinkan untuk menerapkan nilai baru ke objek. Decorator pattern digunakan untuk menambahkan sebuah responsibilitas baru dari yang sudah ada sebelumnya.
## Letak implementasi design pattern tersebut
Design pattern yang digunakan pada program ini terletak pada file `./classes/decorator.js`.
## Alasan pemilihan design pattern tersebut
Alasan say amenggunakan design pattern ini adalah agar program dapat menerima jarak tempuh lintasan balap dan jumlah putaran yang berubah sesuai inputan pada kodingan. Dengan begitu jumlah jarak tempuh bisa dinamis.
## Cara menjalankan program
Untuk menjalankan program ini sangatlah mudah.
1. Pertama pastikan NodeJS sudah terinstall.
2. Pastikan file module tidak hilang, jika hilang silahkan mengunduh kembali module TypeScript menggunakan NPM dengan command berikut:
`npm install typescript --save-dev`.
3. Jika NodeJS dan Module ada, silahkan jalankan program dengan menuliskan command berikut:
`tsc main.ts` 
`node main.js`

> Program ini tidak bisa menerima input dari terminal. Sehingga untuk mencoba merubah nilai tertentu harus melakukan hardcode pada file `main.ts`.

## Versi bahasa dan dependency (jika ada) yang digunakan
- TypeScript Compiler - Version 4.8.4

## Konsep-konsep lain yang kalian gunakan dan keunikan program (jika ada)
Program ini sudah menerapkan atau mengimplementasikan konsep-konsep OOP sesuai dengan kriteria submisi diantaranya:
1. Inheritance
2. Interface dan/atau abstract class
3. Polimorfisme
4. Mengimplementasikan design pattern
5. Mengimplementasikan prinsip SOLID
6. Stream API dan/atau functional programming

Untuk lebih jelasnya bisa dilihat langsung pada source code.
**Terima kasih.**

|Identitas Pembuat|
|--|
|Nama: Muhammad Haulul Azkiyaa|
|NIM: 1302223007|
|Kampus Asal: Universitas Telkom|
|Program Studi: S1 Rekayasa Perangkat Lunak|
|ID GDSC ITB: 220020072|