## Deskripsi Program

Program yang sangat sederhana untuk membuat rekening baru berdasarkan nama dan deposit awal.

## Design Pattern dan Prinsip SOLID

Design pattern yang digunakan pada program ini adalah _Factory_. Penerapannya terletak pada class `Nasabah` . Sedangkan, prinsip yang digunakan adalah _Single Responsibility Principle_ yang di-implementasikan pada class `Nasabah` dan class `Main` dimana class `Nasabah` hanya memiliki satu tanggung jawab, yakni menyimpan data dan operasi terkait rekening nasabah dan class `Main` hanya bertanggung jawab untuk berinteraksi dengan _user_.

## Cara Menjalankan Program

1. Clone repository ini.
2. Masuk ke direktori `Redi Ahmad_Universitas Gunadarma/src/`
3. Compile program terlebih dahulu dengan perintah `javac Main.java` pada terminal.
4. Jalankan program dengan perintah `java Main`

## Versi Bahasa

Bahasa yang digunakan adalah JavaSE 19.0.2
