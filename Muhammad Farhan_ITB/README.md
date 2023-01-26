## Penjelasan Program

### Deskripsi program
Program ini adalah simulasi sistem perpustakaan yang menggunakan konsep OOP (Object-Oriented Programming). Program ini terdiri dari 3 kelas yang saling berhubungan:

Interface LibraryItem: Interface ini memiliki dua method, yaitu checkOut() dan checkIn(). Method checkOut() digunakan untuk meminjam suatu item perpustakaan, sedangkan method checkIn() digunakan untuk mengembalikan suatu item perpustakaan.

Kelas abstrak LibraryMaterial: Kelas ini merupakan kelas dasar dari semua item perpustakaan. Kelas ini memiliki atribut title, author, isCheckedOut, dan itemId. Kelas ini juga memiliki beberapa method getter yang digunakan untuk mengambil nilai dari atribut-atribut tersebut.

Kelas Book: Kelas ini merupakan kelas turunan dari LibraryMaterial dan mengimplementasikan interface LibraryItem. Kelas ini memiliki atribut tambahan yaitu numberOfPages dan juga memiliki method checkOut() dan checkIn() yang di-override dari interface LibraryItem.

### Penjelasan design pattern yang dipilih
Program ini menggunakan design pattern Template Method dan Interface.

Pada program ini, kelas LibraryMaterial digunakan sebagai kelas abstrak yang menyediakan properti dan method dasar yang digunakan oleh kelas turunannya.

Kemudian, kelas Book diwariskan dari kelas LibraryMaterial dan mengimplementasikan interface LibraryItem. Ini menandakan bahwa kelas Book memiliki semua properti dan method yang dimiliki oleh kelas LibraryMaterial dan juga harus memiliki method yang ditentukan oleh interface LibraryItem.

Penggunaan interface di sini bertujuan untuk mengabstraksikan sebuah behavior yang ditentukan oleh method-method yang ada di dalam interface tersebut, yaitu checkOut() dan checkIn().

### Letak implementasi design pattern tersebut

Implementasi dari Interface dapat dilihat dari penggunaan interface LibraryItem yang hanya memiliki 2 method yaitu checkOut() dan checkIn(). Ini memastikan bahwa class yang mengimplementasikan interface tersebut hanya akan mengimplementasikan method yang dibutuhkan, yaitu method untuk check out dan check in suatu library item.

Selain itu, dari class LibraryMaterial menjadi abstract class dan di extend oleh class Book, ini menandakan program ini juga mengimplementasikan "Template Method" design pattern. Template Method digunakan untuk mengatur susunan dari method yang digunakan dalam class, dimana class turunannya dapat meng-override method tersebut.

### Alasan pemilihan design pattern tersebut

Design pattern interface digunakan untuk mendefinisikan sebuah kontrak atau kumpulan method yang harus diimplementasikan oleh kelas yang mengimplementasikan interface tersebut. Hal ini digunakan untuk menjamin bahwa kelas yang mengimplementasikan interface tersebut memiliki method-method yang ditentukan dalam interface tersebut.

Design pattern Template Method digunakan untuk meng-handle alur logika yang sama pada sebuah kelas atau beberapa kelas yang berbeda. Pada design pattern ini, alur logika tersebut ditentukan dalam sebuah method yang disebut template method, dan kelas yang meng-extend kelas yang memiliki template method tersebut dapat meng-override method tersebut untuk meng-handle alur logika yang spesifik untuk kelas tersebut.

Implementasi design pattern ini digunakan karena dapat menjamin bahwa kelas yang mengimplementasikan interface LibraryItem memiliki method checkOut() dan checkIn(). Dan dengan menggunakan Template Method dapat mengatur alur logika yang sama pada seluruh class yang meng-extend class LibraryMaterial.

### Cara menjalankan program
1. Jalankan program di path Muhammad Farhan_ITB\src\Main.java
2. Program akan membuka konsol dan menampilkan menu utama. Anda dapat memilih opsi yang diinginkan dari menu tersebut.
3. Setelah selesai, Anda dapat mengakhiri program dengan memilih opsi "Exit" dari menu utama.

### Bahasa yang dipakai
Bahasa yang dipakai di program ini menggunakan bahasa Java.
