# Hands On OOP

## Deskripsi Tugas
Buatlah suatu program berbasis command-line. Program ini perlu mengimplementasikan konsep-konsep OOP, seminimalnya
- Inheritance
- Interface dan/atau abstract class
- Polimorfisme
- Mengimplementasikan (minimal 1) design pattern
- Mengimplementasikan (minimal 1) prinsip SOLID

Tugas ini sangat membebaskan kalian untuk berkreasi. Konsep-konsep lain yang kalian gunakan dan keunikan program akan sangat dihargai dan dihitung sebagai bonus nilai (jangan lupa tulis di penjelasan program). Silakan berkreasi! :D

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

### Bahasa yang tidak dapat digunakan
Karena keterbatasan di bahasa-bahasa berikut, bahasa di bawah ini tidak digunakan di tugas ini
- Python
- PHP
- C

## Deliverable
- Kumpulkan link github fork repository dan link pull request kalian ke gform yang dibagikan

## Deadline
- Jumat, 27 Januari 2023, pukul 23.59


Deskripsi program:
Program ini adalah contoh sederhana dari implementasi konsep-konsep OOP di Java, yaitu Inheritance, Interface dan/atau abstract class, Polimorfisme,  dan Design Pattern. 

Inheritance: Kelas Rectangle dan Circle diwarisi dari kelas abstrak Shape. Kelas Square juga diwarisi dari kelas Rectangle.

Polimorfisme: Kelas Shape, Rectangle, Circle, dan Square memiliki metode area() dan perimeter() yang memiliki implementasi yang berbeda-beda.

Prinsip SOLID: Prinsip SOLID yang diterapkan dalam program tersebut adalah Single Responsibility Principle (SRP). Kelas SOLIDShapes hanya bertanggung jawab untuk menghitung luas dan keliling dari berbagai bentuk yang diberikan kepadanya.

Design pattern : Kelas SOLIDShapes menggunakan design pattern "Composite" yang digunakan untuk mengelompokkan beberapa objek dalam satu objek agar dapat diperlakukan secara sama.

Dalam program ini, terdapat 4 kelas yang digunakan, yaitu kelas Shape, Rectangle, Circle, dan Square. Kelas Shape adalah kelas abstrak yang mengimplementasikan interface dengan menggunakan keyword abstract dan digunakan sebagai parent class dari kelas Rectangle dan Circle. Kelas Rectangle dan Circle mewarisi semua properti dan method dari kelas Shape dan mengimplementasikan method abstrak yang ditentukan oleh kelas Shape. Selain itu, Kelas Square mewarisi dari kelas Rectangle. Kemudian di main class terdapat class SOLIDShapes yang digunakan untuk menampung list dari objek Shape dan menghitung total area dan perimeter nya.



Letak implementasi design pattern tersebut:
Implementasinya terletak pada class SOLIDShapes.
Class SOLIDShapes hanya memiliki 1 fungsi yaitu menghitung total area dan perimeter dari objek-objek yang di tampung di list nya.

Alasan pemilihan design pattern tersebut:
Design pattern "Composite" dipilih karena sesuai dengan tujuan dari program tersebut yaitu untuk mengelompokkan berbagai bentuk dalam sebuah objek agar dapat dihitung luas dan kelilingnya secara bersama-sama. Kelas SOLIDShapes mengumpulkan beberapa objek Shape dalam sebuah ArrayList dan menyediakan metode areaOfShapes() dan perimeterOfShapes() untuk menghitung luas dan keliling dari semua bentuk yang ada di dalam ArrayList tersebut.

"Composite" pattern memungkinkan untuk mengolah sekumpulan objek dalam satu objek agar diperlakukan secara sama. Hal ini sesuai dengan tujuan dari program ini yaitu mengelompokkan berbagai bentuk dalam sebuah objek agar dapat dihitung luas dan kelilingnya secara bersama-sama.

Cara menjalankan program:
Untuk menjalankan program ini, Anda dapat menyimpan kode di atas ke dalam file dengan ekstensi .java, kemudian mengcompile dan menjalankannya menggunakan command line atau IDE seperti Eclipse atau IntelliJ IDEA.

Versi bahasa dan dependency yang digunakan:
Program ini ditulis dalam bahasa Java versi 8, dan tidak memerlukan dependency eksternal apapun.

Konsep-konsep lain yang digunakan dalam program ini adalah Collection. Collection digunakan untuk menyimpan objek-objek yang dibuat dari kelas Rectangle, Circle, dan Square. Collection yang digunakan adalah ArrayList, yang digunakan untuk menyimpan objek-objek tersebut dan menghitung total area dan perimeter nya. ArrayList digunakan karena memiliki kemampuan untuk menambah dan menghapus objek secara dinamis.

Keunikan program ini adalah implementasi konsep-konsep OOP yang digabungkan dalam satu program, termasuk implementasi interface dan abstract class, inheritance, polimorfisme, dan design pattern, SOLID, serta penggunaan Collection untuk menyimpan objek dan menghitung total area dan perimeter. 
