Deskripsi program 

PT. Gojek Indonesia hendak merekrut programmer system mereka, contoh kasus yang digunakan dalam proses tes tersebut adalah mengembangkan sebuah system 
baru yang digunakan untuk melakukan pengelolaan Member dan Transaksi. Member terdiri dari 2 (dua) jenis, yaitu Driver dan Customer.
Fitur dari aplikasi tersebut adalah
a. Tambah Driver: menambahkan driver baru
b. Tambah Customer: menambahkan customer baru
c. Top Up Saldo: menambahkan data saldo Driver dan Customer. Diasumsikan bahwa saldo inputan method telah lebih dari nilai 
minimal.
d. View Customer: menampilkan data customer
e. View Driver: menampilkan data driver
f. Transaksi: Melakukan transaksi order pengantaran. Diasumsikan bahwa tarif merupakan sebuah tarif yang valid, sehingga pada 
method tersebut hanya melakukan proses pengecekan ID dan perubahan saldo. Pastikan ID Customer dan ID Driver jangan sampai 
terbalik
g. Menampilkan 5 driver dengan saldo terbanyak



Design pattern yang dipilih

inheritance
kelas driver, customer meng inherit kelas member

cara menjalankan program = kelas main terletak pada kelas gojek

