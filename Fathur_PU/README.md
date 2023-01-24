# Hands On OOP: Lottery Simulator

## Deskripsi Program

Program ini merupakan simulator lotere. Pemain akan menebak 3 angka dengan range 1-9 dan jika benar akan mendapat hadiah.

Terdapat 3 kategori kemenangan:
1. Ketiga angka dan urutan tepat memenangkan $10,000
2. Ketiga angka tepat tetapi urutan salah memenangkan $3,000
3. Hanya salah satu angka yang tepat memenangkan $1,000

Setelah pemain menebak, akan keluar angka kemenangan dan dapat terlihat apa saja angka yang tepat.

## Design Pattern

Design Pattern yang digunakan adalah Strategy Pattern. Dengan menggunakan design pattern, kita dapat membuat beberapa strategy untuk menyelesaikan masalah yang berbeda dengan cara fleksibel dan modifikasi yang mudah. Penggunaan strategy pattern juga membuat blok kode lebih rapi, structural dan mudah dibaca.

## Cara menjalankan program

Jalankan index.exe untuk compile di VSCode menggunakan terminal: jalankan dari directory tempat file disimpan. Ex.F:\GDSC\Tugas\Hands-On-OOP-2022\Fathur_PU>./index.exe

```
-------------------------------------------------------
                RULES OF THE GAME
-------------------------------------------------------
Pemain akan  menebak 2 angka yang terdiri dari 1-9
Format input diberi spasi antara angka pertama dan kedua
Contoh: 8 _spasi _ 2
Contoh: 8  2
Ada 3 kategori pemenang
1. Kedua angka dan urutan tepat
2. Kedua angka tepat tetapi urutan salah
3. Hanya salah satu angka yang tepat
-------------------------------------------------------
Guess number:
0 2 3
You only matches 1 digit, the award is $1,000.
Today's winning number is: 2 5 9
```

## Versi Bahasa

C++ dan MinGW (GCC) 11.2.0
*Untuk run di VSCode butuh extension C/C++ dan C/C++ Extension Pack 

## Implementasi SOLID Principle

prinsip SOLID yang digunakan pada kode diatas adalah Single Responsibility Principle (SRP). Single Responsibility Principle (SRP) menyatakan bahwa setiap class hanya boleh memiliki satu tanggung jawab saja. Pada kode diatas, class lottery hanya memiliki 2 fungsi yaitu generate_numbers() dan guess_numbers(). Hal ini sesuai dengan konsep SRP karena class tersebut hanya memiliki 1 tanggung jawab yaitu membuat dan menebak angka.

Konsep polimorfisme dapat dilihat di dalam fungsi main(), di mana class InheritLottery diwariskan dari class SolidLottery. Fungsi ini menggunakan polimorfisme untuk mengakses kedua fungsi set dan get dari class SolidLottery dan InheritLottery.

Konsep inheritance pada kode diatas terjadi ketika Class InheritLottery meng-inheritance dari Class SolidLottery. Class InheritLottery mewarisi semua metode dan atribut dari Class SolidLottery. Metode dan atribut yang diwariskan antara lain setGenerateNumber(), setGuessNumber(), getGenerateNumber(), getGuessNumber(), dan num1, num2. Selain itu, Class InheritLottery juga memiliki metode dan atribut sendiri, yang terdiri dari setAdditionNumber(), getAdditionNumber(), dan num3.

## Tambahan

Program merupakan Interactive program yang memanfaatkan input dari user.
