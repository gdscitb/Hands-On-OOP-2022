# Deskripsi Program
Program ini adalah simple console app, yaitu Vending Machine. User akan diminta
untuk berinteraksi dengan app sebagaimana menggunakan
Vending Machine seperti di dunia nyata.

# Design Pattern yang Dipilih
Design Pattern yang dipilih adalah Creational Pattern,
yaitu Factory Method. Design pattern ini menitik beratkan
kepada pembuatan object yang tidak terlalu mementingkan
bagaimana object tersebut berinteraksi atau berfungsi nantinya.

# Letak Implementasi Design Pattern
Pada class ItemFactory dibuat beberapa Vending yang berperan
sebagai factory-factory yang akan menambatkan attribut
sekaligus membuat object tersebut. Namun, attribut akan
ditambatkan apabila ada request dari user.

# Alasan Pemilihan Design Pattern Tersebut
Karena ada banyak object makanan, minuman, dan makanan
yang terolah, saya memutuskan untuk fokus terhadap pembuatan
object. Makanan, minuman, dan makanan yang terolah pun
tentunya adalah sebuah kumpulan class yang memerlukan
masing-masing space syntax sehingga diperlukan sebuah kelas abstrak yang
nantinya memiliki subclass-subclass-lainnya. Object-object pun akan banyak
sesuai dengan Vending yang disediakan oleh programmer dan request dari user.

# Cara Menjalankan Program
1. Disarankan program dijalankan di intellij IDEA.
1. User menginput jumlah uang. Akan ada sebuah validasi dari sisi programmer
agar user dapat menjalankan program dengan baik.
2. Pilih vending machine yang menjadi tujuan Anda. User menginput
string yang berupa pilihan vending machine.
3. Pilih barang yang anda inginkan. User menginput nomor barang yang
dipilih (terletak di atas barang).
4. Apabila masih ada barang yang bisa dibeli dan uang masih
tersedia (
Programmer masih belum bisa merealisasikan karena keterbatasan waktu terhadap deadline), program akan tetap 
berjalan. Namun, program akan berhenti jika tidak ada barang yang bisa dibeli.

# Versi Bahasa
Program dibuat dengan JDK 15.0.2 dan gradle 7.4.2
