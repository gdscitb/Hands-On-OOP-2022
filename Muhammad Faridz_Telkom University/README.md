    Deskripsi singkat:
    program ini mengenai penjumlahan laptop

    Penjelasan:
    Inheritance: Class GamingLaptop dan BusinessLaptop mewarisi properti dan method dari class Laptop.

    Interface dan/atau abstract class: Class Product merupakan interface yang digunakan sebagai pembatas antara class yang diperlukan dan yang tidak diperlukan. Class Laptop merupakan abstract class yang digunakan sebagai class induk untuk class GamingLaptop dan BusinessLaptop.

    Polimorfisme: Fungsi printLaptopInfo menerima parameter sebuah objek dari class Laptop atau kelas yang mewarisi dari class Laptop.

    design pattern: Implementasi design pattern yang digunakan adalah Prototype, dimana class GamingLaptop dan BusinessLaptop diinstantiasi dari class Laptop

    prinsip SOLID: Prinsip SOLID yang digunakan adalah Open-Closed Principle, dimana class Laptop dapat dikembangkan untuk tipe-tipe baru tanpa perlu mengubah class yang sudah ada.