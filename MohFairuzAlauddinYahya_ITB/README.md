# Hands On OOP

## Penjelasan Program

Selain membuat program, kalian perlu menuliskan penjelasan program kalian, dengan seminimalnya berisikan

- Deskripsi program
    Program ini berkaitan dengan implementasi penggunaan OOP dalam CLI dengan menggunakan bahasa C++ yang merupakan bagian  dari interactive program dengan user dapat memberikan input dengan angka untuk ketentuan tertentu. Berikut adalah detail program:
    - User akan diminta untuk memilih hero, weapon, dan armor yang memberikan attribut atau spesifikasi power tertentu untuk bertahan dan menyerang bot
    - Untuk menentukan giliran penyerang, maka akan dilakukan permainan batu kertas gunting dengan pemenang sebagai penyerang
    - Penyerang bebas menentukan akan menyerang menggunakan skill apa, semakin kuat skill untuk menyerang maka juga dibutuhkan mana yang semakin banyak pula
    - Jika mana habis, penyerang tidak akan dapat menyerang menggunakan skill tertentu 
    - Ketentuan pengisian mana adalah ketika user diserang oleh bot mana +15 dan ketika hasil batu kertas gunting draw maka mana +5
    - Game akan berakhir jika salah satu pemain tumbang dengan syarat health telah habis
- Penjelasan design pattern yang dipilih
- Letak implementasi design pattern tersebut
- Alasan pemilihan design pattern tersebut
- Cara menjalankan program
- Versi bahasa dan dependency (jika ada) yang digunakan
- Konsep-konsep lain yang kalian gunakan dan keunikan program (jika ada)
  Pada class Hero, terdapat method addJurus yang digunakan untuk menambahkan objek dari class Skill. Hal ini merupakan implementasi dari konsep aggregation dalam OOP, dimana suatu class dapat menyimpan objek dari class lain sebagai bagian dari dirinya.

## Deskripsi Penyelesaian Requirements

Buatlah suatu program yang _perlu_ mengimplementasikan konsep-konsep OOP, seminimalnya

✅ Inheritance :
  Dalam program tersebut, terdapat prinsip inheritance yang diterapkan pada class Player, dimana class Player mewarisi sifat dan perilaku dari class Hero, Weapon, dan Armor. Penerapan inheritance ini dapat dilihat pada constructor Player yang meng-extend class Hero, Weapon, dan Armor.

✅ Interface dan/atau abstract class
  class Hero sudah menerapkan interface dengan menyimpan objek dari class Skill menggunakan vector. Pada class Hero, terdapat method addJurus yang digunakan untuk menambahkan objek dari class Skill selain itu, terdapat interface berupa classInfo yang akan melakukan generate info dan digunakan oleh class Player dan Bot untuk akses info dalam class tersebut

- Polimorfisme

- Mengimplementasikan (minimal 1) design pattern

✅ Mengimplementasikan (minimal 1) prinsip SOLID
  Tidak diterapkan prinsip SOLID yang secara khusus diterapkan, namun dapat dilihat penerapan beberapa prinsip SOLID seperti Single Responsibility Principle (SRP) pada class Skill, Hero, Weapon, Armor yang memiliki tanggung jawab yang spesifik dan tidak saling terkait. juga dapat dilihat penerapan Open-Closed Principle (OCP) pada class Hero dengan memiliki fungsi addJurus untuk menambahkan skill tanpa mengubah class Hero itu sendiri.


### Beberapa Bonus yang Direkomendasikan

- Stream API dan/atau functional programming
✅ Multilevel inheritance
  class GamePlay sudah menerapkan konsep multilevel inheretance yagn mewarisi sifat bot dan player yagn masing-masing juga mewarisi sifat dari hero yang mewarisi sifat skill , armor, dan weapon.
✅ Interactive program (Menerima input dan mengeluarkan output sesuai input)
  Pada program saya menerapkan interactive program agar user dapat melakukan input secara manual dengan memilih angka untuk memilih hero, weapon, dan armor dengan spesifikasi tertentu. Serta melakukan input untuk menentukan giliran penyerang dengan input lagi jika dalam mode menyerang untuk memilih skill yang digunakan untuk menyerang
