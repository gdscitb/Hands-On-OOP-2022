SOLID Principle yang digunakan:
1. Liskov Substitution Principle, Menukar Kelas Child dengan Parent
2. Dependency Inversion Principle, Tidak bergantung kepada class konkrit tapi kepada abstraksi

Deskripsi program:
Program akan membuat character dan menyimpannya dalam arraylist yang depend kepada abstract class dengan nama character yang kemudian akan diberikan opsi untuk memilih character yang ingin digunakan untuk attack dan mengenerate enemy setiap loop dengan menggunakan factory pattern

Penjelasan design pattern yang dipilih:
design pattern yang digunakan adalah factory pattern untuk membuat membuat monster yang ada

Letak implementasi design pattern tersebut:
letak implementasi bisa dilihat di MonsterFactory.java

Alasan pemilihan design pattern tersebut:
Alasan pemilihan design pattern tersebut adalah untuk mempermudah pembuatan object tanpa mengekspos creational logic

Cara menjalankan program:
Menjalankan file Main.java dengan javac Main.java && java Main

