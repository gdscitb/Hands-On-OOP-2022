Deskripsi Program dan cara menjalankan program

program ini merupakan program OOP singkat mengenai "animal sound","introducing animal", dan "print animal".Cara menjalankan program ini cukup simple, langkah pertama yaitu:
-Membuat animalnya dengan cara mengklik angka 1 untuk create animal.
-Mengisi data seperti tipe hewan, nama hewan, umur, dan berat.
-Setelah itu kita bisa mendengar suara hewan dengan meng-klik angka 2.
-Setelah itu kita bisa memilih index yang dimulai dari angka 0.
-Setelah itu sistem meng-print suara hewan.Jika user memilih Dog maka akan muncul kata "Woof woof"
 Jika user memilih Snake akan muncul kata "shh shh", dst.Kata seperti "woof woof" dan "shh shh" 
 dipanggil melalui class main yang disimpan memakai ArrayList dan dipanggil ke dalam method void 
 animal, selain arraylist ada juga kode seperti "animal.sound();" yang digunakan untuk memanggil
 kata yang sudah dibuat pada kelas inheritance Dog, snake, cat, dan cow.
-Setelah itu user dapat memilih menu ketiga yaitu menu introduced animal yang dapat dijalankan 
  dengan meng-klik index yang dimulai dari 0 dan sistem akan meng-print Hello + my name is + nama   yang di-insert tadi.Kata "my name is" didapat dari class inheritance parent class "Animal"
-Setelah itu ada menu print yang akan meng-print nama hewan, umur, dan berat yang berfungsi untuk 
 di-print pada menu ke-2 dan ke-3 untuk bisa dipilih indexnya.


Design Pattern
Design pattern yang dipilih pada project ini merupakan abstract factory pattern yang bisa dilihat pada class "Animal" "public abstract class Animal" abstract disini saya gunakan untuk memanggil method void sound pada main untuk meng-print "my name is" ditambah nama yang di-insert.

Note:Eclipse IDE tidak bisa di push ke dalam repository.
