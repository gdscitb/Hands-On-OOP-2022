# Penjelasan Program Hands On OOP
Nama    : Evelyn Yosiana 
ID GDSC : 220020117
Kampus  : ITB

# Bahasa 
- Bahasa yang digunakan adalah C++
- Versi compiler: C++ 17

## Deskripsi Singkat Tugas
- Program ini saya beri judul "Sewa warnet".
- Pembuatan program ini dimulai dengan class jam.
- Ada class komputer yang merupakan turunan dari class ruangankomputer.
- Pertama, buat array berisi dengan ruangan komputer yang didefault ketersediaan dan dipakai = false.
- Kemudian user dapat merakit komputer dalam ruangan komputer. Selain itu, user juga dapat check in untuk menyewa komputer dan check out ketika komputer sudah selesai disewa. Setelah check out, akan ditampilkan biaya sewa komputer. Komputer yang sedang disewa tidak dapat disewa oleh orang lain. 
- Untuk sistem check in, check out, dan buat komputer dilakukan looping hingga user memilih opsi out. 

### showAll
- showAll digunakan untuk mengecek ruangan komputer, apakah komputer tersedia, tidak tersedia, atau disewa. 

### getAvailable
- getAvailable digunakan untuk mengecek apakah komputer tersedia atau tidak. 

### getDipakai
- getDipakai digunakan untuk mengecek apakah komputer sedang disewa atau tidak. 

## Cara Menjalankan Program
- Pertma-tama, semua ruangan komputer didefault belum memiliki komputer. User harus merakit komputer agar dapat digunakan dan disewa. 
- Jika ingin menyewa komputer, user dapat memilih opsi check in dan mengisi jam check in.
- Ketika sudah selesai digunakan, user dapat memilih opsi check out dan mengisi jam check out. Kemudian akan ditampilkan biaya sewa dengan harga 3000 perjam.
- Ketika sudah selesai, user dapat memilih opsi out untuk keluar dari program. 

## Design Pattern yang Digunakan 
- Decorator (Structural Pattern)

## Decorator 
- Penjelasan: decorator memungkinkan kita untuk memasangkan fungsi secara dinamis tanpa mengubah strukturnya. 
- Letak Implementasi: method setAvailable() dan method setDipakai (line 55 dan 59)
- Alasan Pemilihan: agar dapat mengecek apakah komputer tersedia, tidak tersedia, atau disewa.

## Konsep-konsep Lainnya 
- (Multilevel) Inheritance: class ruangankomputer -> komputer
