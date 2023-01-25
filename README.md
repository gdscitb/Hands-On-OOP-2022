# Hands On OOP

## Penjelasan Program

### Deskripsi Program
Program ini adalah program Battle RPG yang sangat sederhana, hanya dengan pemilihan karakter yaitu ada mage dan swordsman.
Masing masing karakter punya basic attack, skill dan ulti, dan ada beberapa memiliki cost mana dan ada yang tidak
ketika memulai program, user disuruh memilih salah satu karakter antara mage dan swordsman, lalu battle pun dimulai dengan monster.
Kondisi menang ketika HP monster mencapai nilai 0, sebaliknya kondisi kalah ketika HP karakter kita mencapai nilai 0

### Penjelasan Design Pattern
Design pattern yang dipilih adalah design pattern factory.
Design pattern factory adalah design pattern yang membuat sebuah object dari superclass, dengan class dibawahnya dapat mengubah object yang ingin dibuat.

### Alasan Pemilihan Design Pattern
Alasan saya memilih design pattern tersebut karena banyak yang dapat digunakan dengan hal tersebut pada program ini. Pembuatan karakter mage dan swordsman, lalu pembuatan monster semuanya dengan factory method.

### Cara Menjalankan Program
Cara menjalankan programnya bisa dengan mengompile file Main.cpp yang ada di dalam folder src, atau bisa juga dengan langsung menjalankan file App.exe yang terdapat dalam folder bin.

### Versi bahasa
Saya menggunakan bahasa C++ dengan versi C++ 17

### Keunikan
Program saya menggunakan library memory, yang memiliki "smart pointer", untuk mengurangi resiko terjadinya memory leak dalam pembuatan factory character.