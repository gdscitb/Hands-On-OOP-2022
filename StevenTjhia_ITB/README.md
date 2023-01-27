# Penjelasan Program Hands On OOP
Nama    : Steven Tjhia
ID GDSC : 220030007
Kampus  : ITB

*Disclaimer: Penjelasan di bawah mungkin masih ada yang masih kurang tepat, semisalnya ada kesalahan apapun itu, saya sangat terbuka menerima koreksi dan masukkan, Terimakasih sebelumnya.

## Versi Bahasa
- Bahasa yang digunakan adalah C++
- Versi compiler GCC C++ : g++ 8.1.0.

## Deskripsi Singkat Program
- Program ini saya beri judul "The Duelism", karena program ini adalah game yang dimainkan 2 orang, jadi ada 2 player. Nanti, mereka akan memilih 'potion' dan 'hero' mereka masing masing dan saling menyerang sampai ada yang kalah.
- Pembuatan program ini dimulai dengan class player, disini akan tersimpan nama player. 
- Kemudian ada class potion yang merupakan turunan dari class player karena nanti player akan memilih potion untuk peningkatan pada hero nya.
- Setelah itu ada abstract class hero, yang merupakan turunan dari class potion. Menjadi abstract class karena ada pure virtual function [virtual void desc() = 0;] yang membuatnya tidak dapat digunakan sama sekali, jadi hanya sebagai abstract class untuk class-class hero nanti.
- Selanjutnya ada class cavalry, infantry, dan archer, yang merupakan turunan dari abstract class hero. Pada masing-masing class tersebut terdapat atribut seperti attack, hp, dll. yang berbeda antara 1 dengan yang lainnya.
- Untuk sistem battlenya dilakukan looping hingga salah satu dari mereka kalah (hp <= 0>).

### Stats Hero
- Stats hero berbeda-beda, ada yang cenderung lebih attack (archer), ada yang tebel hp nya (infantry), dan ada yang seimbang (cavalry).
- Masing-masing stats saya coba seimbangkan seimbang mungkin, namun tetap tidak dapat seimbang sempurna.

### Skill Hero
- Terdapat skill hero yang memiliki cooldown yang diitung berdasarkan round (ronde).
- Terdapat peningkatan pada skill hero tergantung dengan potion yang dipilih.

### Battle
- Untuk battle dilakukan looping sampai salah 1 ada yang kalah.

## Cara Bermain / Cara Menjalankan Program
- Diperlukan 2 orang untuk memainkan program ini
- Masing-masing pemain mengisi nama player
- Selanjutnya, setiap pemain akan memilih 1 buah potion, tersedia 2 potion: Attack Potion dan HP Potion. Attack Potion untuk menambah attack dari hero yang nanti akan dipilih, sedangkan HP Potion untuk menambah hp dari hero yang akan dipilih. Stats dari masing-masing potion juga akan memengaruhi stats pada skill hero mereka juga.
- Setiap pemain memilih 1 jenis hero. Terdapat 3 jenis hero: cavalry, infantry, dan archer.
- Setelah semua pemain memilih potion dan hero, maka akan ditampilkan stats dari masing-masing hero dan game pun dimulai.
- Game dimulai dengan pemain 1 melakukan aksi terlebih dahulu. Setiap jenis hero memiliki 3 aksi: Basic Attack, Skill Attack, dan Skill Heal. Untuk Skill Attack dan Skill Heal memiliki cooldown dan dapat berbeda-beda pada setiap hero. Agar lebih menantang, Skill Heal dapat meningkatkan hp tanpa batasan maksimal hp.
- Setelah pemain 1 melakukan aksi, player 2 akan melakukan aksi dan akan bergantian terus sampai salah satu dari mereka ada yang kalah.

## Design Pattern yang Digunakan
- Factory Method (Creational Design Pattern)
- Decorator (Structural Pattern)
- Iterator (Behavioral Pattern)

### Factory Method
- Penjelasan : Factory Method merupakan Creational Design Pattern yang membutuhkan satu abstract class yang yang akan dibuat method untuk membuat object yang dilakukan oleh subclass dengan variasinya masing-masing.
- Letak Implementasi : Pembuatan object hero sesuai dengan jenis hero yang dipilih player (line 111, 221, dan 222).
- Alasan Pemilihan : Agar dapat membuat object class sesuai dengan class jenis hero yang dipilih player.

### Decorator
- Penjelasan : Decorator memungkinkan kita untuk memasangkan/menambahkan fungsi secara dinamis tanpa mengubah strukturnya. 
- Letak Implementasi : method setName() dari class player dan method setBuff() dari class potion yang digunakan pada class cavalry, infantry, dan archer (line 56, 57, 75, 76, 94, dan 95).
- Alasan Pemilihan : Agar pada saat object dibuat, dapat langsung menjalankan method setName() untuk menetapkan name yang diinpun dari pemain dan method setBuff() untuk menetapkan buff dari potion yang dipilih pemain.

## Keunikan Program
- Terdapat cooldown skill pada hero yang tentunya unik.
- Harus dimainkan oleh 2 orang dan memerlukan input pemain, jadi tidak hanya interaktif manusia-komputer saja, tetapi juga bisa interaktif manusia-manusia juga.
- Tampilan didesain semaksimal mungkin pada tampilan terminal agar pemain dapat membaca apa saja yang terjadi.
- Untuk menampilkan stats hero saat bertarung, dibuat fungsi showStats (line 21).

## Konsep-Konsep Lainnya 
- (Multilevel) Inheritance : class player -> class potion -> class hero -> class cavalry, class infantry, class archer.
- (Multiple) Inheritance : class hero -> class cavalry, class infantry, class archer.
- Interface dan/atau abstract class : class hero
- Polimorfisme : method desc() pada class cavalry, infantry, dan archer.
- Constructor : cavalry(string name, int potion) pada line 55, infantry(string name, int potion) pada line 74, dan archer(string name, int potion) pada line 93.
- Encapsulation : digunakan pada class player untuk setName dan getName.

### SOLID:
- Single Responsibility -> class tiap hero dipisah: cavalry, infantry, archer. Class player juga dipisah sendiri.
- Open Closed-> ada potion yang ngasi bonus stat tertentu, itu gaperllu ngubah si stat heronya, tinggal ditambahin aja
- Interface Segregation Principle-> class (cavalry/infantry/archer) dipake hanya jika typer hero tersebut yg digunakan. Jadi object yg dibuat, pake classnya sesuai dengan type hero yang didapatkan dari input user.
- Dependency Inversion Principle-> untuk membuat hero bagi player yang utuh, class player bergantung pada class potion dan class potion bergantung pada class hero. Bisa dibilang player membutuhkan hero agar dapat bermain.