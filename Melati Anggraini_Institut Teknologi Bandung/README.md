Penjelasan Program Hands On OOP
Nama : Melati Anggraini ID GDSC : 220020111 Kampus : ITB

Bahasa
Bahasa yang digunakan adalah C++
Versi compiler: C++ 17
Deskripsi Singkat Tugas
Program ini saya beri judul "Mesin ATM".
Pembuatan program ini dimulai dengan class atm.
Ada class saving yang merupakan turunan dari class atm.

Cara Menjalankan Program
Pertama, user akan memasukkan PIN dan Account Number. Jika sudah sesuai, maka user akan diberi 5 piihan menu yaitu menu Check Balance, Cash Withdraw, Show User Details, Update Mobile No, dan Exit. Jika sudah selesai user akan kembali ke menu awal.

Design Pattern yang Digunakan
Decorator (Structural Pattern)
Decorator
Penjelasan: Dekorator merupakah pola struktural yang memungkinkan menambah perilaku baru yang dapat menempatkan fungsi baru secara dinamis tanpa mengubah strukturnya.
Letak Implementasi: method setMobile() dan method cashWithDraw (pada line 59 - line 83)
Alasan Pemilihan: agar dapat mengupdate mobile number dengan pengecekan nomor sebelumnya(mobileNo)dan bisa menarik uang dengan pengecekan balance yang tersedia sehingga dua proses ini tidak akan mengubah struktur di fungsi utama.