# Penjelasan Program Hands On OOP
## Program Note Sederhana 
> menggunakan Android Studio dengan bahasa Java dengan database lokal room database dan database Firebase
  
  ```
  Nama : Yohanes Deny Novandian 
  Jurusan : Teknik Informatika
  Universitas : Universitas Dian Nuswantoro
  ```


## Deskripsi Program
- Program ini merupakan program untuk membuat catatan sederhana yang dapat di simpan kedalam database lokal dan database firebase
- Program ini juga memiliki fitur yaitu fitur untuk membuat, melihat, mencari, mengedit dan menghapus catatan yang sudah dibuat
- Untuk masuk ke dalam program menggunakan fitur register dan login
- 

## Cara Menjalankan Program
- Android Studio Chipmunk | 2021.2.1 Patch 2
- Android SDK Platform 33.0.3
- Android Emulator 31.3.14
- Android API 33
  ![note.png]()
  ![notes.png]()

*catatan
menggunakan dependency sebagai berikut :
firebase-auth:21.1.0
firebase-database:20.1.0
android-gif-drawable:1.2.19
room_version = "2.4.3"

## Design Patern yang digunakan
Factory Method (Creational Design Pattern)
Decorator (Structural Pattern)
Adapter (Structural Pattern)

### Factory Methods
Penjelasan : Factory Method merupakan Creational Design Pattern yang membutuhkan satu abstract class yang yang akan dibuat method untuk membuat object yang dilakukan oleh subclass dengan variasinya masing-masing.
Letak Implementasi : Pembuatan object hero sesuai dengan jenis hero yang dipilih player (line 111, 221, dan 222).
Alasan Pemilihan : Agar dapat membuat object class sesuai dengan class jenis hero yang dipilih player.

### Decorator 
Penjelasan : Decorator memungkinkan kita untuk memasangkan/menambahkan fungsi secara dinamis tanpa mengubah strukturnya.
Letak Implementasi : Getter dan Setter pada folder model dan file notes
Alasan Pemilihan : untuk membuat fungsi yang sesuai dengan settiap nnama kolom pada tabel notes

### Adapter
Penjelasan : Kegunaan dari pattern ini adalah dapat memanggil kembali method yang sudah digunakan sebelumnya, dan akan kita gunakan pada kelas selanjutnya yang akan kita buat
Letak Implementasi : pada folder adapters dan file notes list adapter
Alasan Pemilihan : menghubungkan data dengan RecyclerView. Adapter menyiapkan data dan cara menampilkan data dalam view holder. Bila data berubah, adapter akan memperbarui materi tampilan item daftar terkait dalam RecyclerView.

## Konsep-Konsep Lainnya.
(Multiple) Inheritance : class recycleview -> class notes list adapter, notes view holder.

Interface dan/atau abstract class : class mainDAO

Polimorfisme : pada class NotesClickListener ketika catatan di tekan sekali maka akan masuk ke deskripsi catatan, namun ketika catatan ditekan lama maja akan muncul pilihan untuk pin/unpin dan delete.

Constructor : contoh pada class user, pada public user(string fullName,string email,string password)

Encapsulation : digunakan pada class note untuk getID dan setID, getTitle dan setTitle, getNotes dan setNotes, getDate dan setDatee.

## SOLID
Single Responsibility -> tiap class dipisah dan memiliki fungsi sendiri. contoh : Note List Adapter Java, Notes, User dll

Open Closed-> mengextend untuk dapat mengambil fungsinya tanpa mempengaruhi seberapa banyak objet yang dibuat. Contoh : pada Note List Adapter Java, seberapa banyak catatan yang dibuat dapat mengambil fungsi dari get color tanpa mengubah apapun.

Liskov Subtitution Principle -> setiap class yang tidak memiliki fungsi yang sama dibedakan. Contoh : Sudah dibuat pada interface class mainDAO yang memiliki update title, notes, dan ID. jadi tidak sembarang objek dibuat dengan mengimplementasikan clas mainDAO. 

Interface Segregation Principle-> memecah clas menjadi lebih spesifik. Contoh : Contoh pada Notes List Adapter Java dibagi menjadi lebih spesifik menjadi Notes List Adapter dan Notes View Holder

Dependency Inversion Principle-> objek memerlukan interface untuk narik data dari database. Contoh : pada objek Notes membutuhkan interface mainDAO untuk mengambil data, mengupdate data
