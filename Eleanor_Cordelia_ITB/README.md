<!-- DESKRIPSI PROGRAM OOP
Oleh : Eleanor Cordelia


Program ini adalah program kasir sederhana yang dapat menampilkan menu makanan dan minuman beserta harga masing-masing barangnya, serta menghitung berapa total pembelian dan berapa banyak duit kembali kepada customer. Bahasa yang saya gunakan dalam program kasir ini adalah C++. Sebelum membaca lebih jauh, saya meminta maaf karena dalam program ini saya tidak mengimplementasikan design pattern dikarenakan saya masih belum paham dan mengerti cara menerapkannya, bahkan setelah menonton video penjelasan..

Program kasir ini memuat beberapa konsep-konsep OOP, diantaranya : 

1. INHERITANCE

Class Menu yang diturunkan menjadi food and beverages.

2. ENCAPSULATION

Semua variabel disimpan dengan protected dan private sehingga tidak ada variabel yang public.

3. ABSTRACT

Dari mesin kasir, saya dekomposisi masalah menjadi kelas menu → food and beverages dan kelas app yang menyimpan program utama

4. POLIMORFISME

Dalam program ini, class menu mempunyai fungsi get_info. Selain itu, class food dan class beverages juga mempunyai fungsi get_info. Namun, ketiga class tersebut memiliki fungsi get_info yang berbeda satu dengan lainnya. Di class Beverage, fungsi get_info() meng - override fungsi get_info dari parent nya

5. SOLID PRINCIPLE : 

a. Single responsibility principles 

Satu class hanya bertanggung jawab untuk 1 tugas. Contohnya class menu hanya bertanggung jawab untuk menampilkan menu, class beverages hanya bertanggung jawab untuk menampilkan beverages, dan lainnya.

b. Open-Closed principle

Setiap class mempunyai kemampuan untuk meng-edit dirinya masing-masing
 -->