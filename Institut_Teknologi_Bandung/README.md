Deskripsi Program:
Program ini dapat mengecek hubungan tipe pokemon yang anda input, contoh kelemahan dan kekuatan tipe

Pattern yang dipilih:
Program ini menggunakan design pattern abstract factory, yakni pattern yang diimplementasikan dengan interface (atau abstract class)  sebagai base class dan membiarkan derived class / concrete class untuk berperan dalam proses produksi objek.

Letak Implementasi:
Dapat dilihat dari masing-masing  base class sebagai abstract class (Pokemon dan Type), serta derived classnya (Pokemon_A dan Type_A), serta dengan adanya fungsi ClientCode yang mengatur pembuatan object pointer dari class Pokemon dan Type dengan memanggil fungsi CreatePokemon dan SetType dari derived class PokeFact (AbstractFact sebagai base classnya) untuk mengembalikan object dari derived class Pokemon_A dan Type_A dan membuat object pointer tersebut menunjuk ke objek yahg dikembalikan tadi, yang nanti dapat kita gunakan untuk mengakses fungsi-fungsi dari derived class.

Alasan pemilihan pattern:
Abstract factory memudahkan kita untuk berkreasi dengan objek-objek dari class berbeda tanpa mempengaruhi base classnya dalam kata lain tidak tergantung satu sama lain (loose coupling).

Penjalanan Program:
Program dapat dijalankan dengan ide seperti visual studio code, dan lain-lain dengan compiler yang dapat mengompile source code file c++. Untuk menjalankannya cukup dengan mengompile file pokemon_type_relation.cpp

Bahasa yang digunakan:
Program ini menggunakan bahasa c++

Konsep-konsep yang digunakan:
Konsep – konsep lain yang digunakan adalah konsep sederhana seperti looping, passing by reference (fungsi checkInput), condition, dll.
