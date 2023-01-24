<h1>----- GYM MANAGEMENT -----</h1>

<h2>PENJELASAN PROGRAM</h2>

- Program dibuat sebagai simulasi penggunaan gym bagi user baik yang sudah menjadi member maupun belum.
- Program ini masih berupa prototype, yang berarti masih terdapat kekurangan dan room for improvement.
- Alur program adalah sebagai berikut:
  1. User dapat memilih akan melakukan login atau register.
     a. User yang memilih login diminta untuk memasukkan nama dan passwordnya, kemudian akan dicek apakah terdaftar dalam sample database atau tidak. Jika terdaftar program akan berlanjut, jika tidak program akan berhenti.
     b. User yang memilih register diminta untuk memasukkan beberapa daftar seperti nama dan usia untuk pengambilan data, namun sebenarnya tidak berpengaruh pada sample database, karena masih sample.
  2. User kemudian dapat melakukan 3 hal, yaitu melihat peralatan yang ada, menggunakan peralatan, ataupun keluar.
     a. User yang memilih untuk melihat peralatan akan diberikan list peralatan yang ada di gym, beserta keterangan apakah alat tersebut dipakai atau tidak.
     b. User yang memilih untuk menggunakan peralatan akan diminta memasukkan nama peralatan beserta berat beban/kecepatannya, tergantung jenis alat.
     c. User yang memilih keluar membuat program akan berakhir.
- Program menggunakan programming language Java dan Object Oriented Programming dengan keterangan lebih lanjut berada di bawah.

<h2>KONSEP-KONSEP OOP</h2>

- Inheritance
  Inheritance merupakan konsep yang memungkinkan untuk mendefinisikan atau mewariskan sebuah class induk (parent class) ke class anak (child class) sehingga class anak dapat menggunakan dan memanfaatkan data member dari class induknya. Pada program ini, terdapat beberapa penerapan inheritance, salah satunya terdapat pada class RegularMember (child class) yang mewarisi data member dari abstract class Member (parent class).

- Polymorphism
  Polymorphism merupakan konsep kemampuan objek, variabel, atau fungsi yang dapat memiliki berbagai bentuk. Pada program ini, terdapat runtime polymorphism yaitu method status() pada class Member yang di override pada class RegularMember dan class PreimumMember sehingga ketika method di jalankan, hasilnya dapat berbeda tergantung class yang dimiliki objek.

- Interface
  Interface merupakan penghubung/kontrak antara sesuatu yang abstrak dengan sesuatu yang nyata. Salah satu contoh interface yang terdapat pada program ini adalah interface LoggedIn yang mempunyai method loggedin.

- Abstract Class
  Abstract class merupakan class yang terletak di posisi tertinggi dalam hierarki class dan hanya berisi variabel umum dan deklarasi method tanpa detail penggunaannya. Salah satu contoh abstract class pada program ini adalah abstract class GymEquipment.

- Design Pattern
  Design pattern yang digunakan dalam program ini ada factory design pattern, yang terdapat pada interface MemberFactory dan diturunkan kepada class MemberTypeFactory. Penggunaan factory design pattern dipilih untuk memudahkan pembuatan member-member baru dikarenakan data member yang diperlukan sama, sehingga dapat disederhanakan.

- SOLID Principle
  SOLID principle yang digunakan dalam program ini adalah Single Responsibility Principle, di mana setiap class mempunyai tanggung jawab tunggal. Misalnya class Member yang hanya mengatur data member dalam member gym, atau class GymEquipment yang hanya mengatur data member dalam peralatan gym. Penggunaan Single Responsibility Principle dipilih untuk mempermudah pembacaan program sekaligus memahaminya secara garis besar.

<h2>KETERANGAN TAMBAHAN</h2>

- Program dibuat menggunakan bahasa pemrograman Java dengan versi: java version "1.8.0_51".
- Program yang dibuat meminta input dari user dan mengeluarkan output sesuai keinginan dari user.
  Misalnya adalah ketika user meminta untuk menampilkan list peralatan di gym, program akan mengeluarkan output berupa list peralatan di gym beserta keterangan apakah peralatan tersebut digunakan atau tidak.
- Program mengandung multilevel inheritance.
  Beberapa class di program ini memiliki multilevel inheritance, misalnya Treadmill yang merupakan child class dari CardioEquipment yang merupakan child class dari GymEquipment.
