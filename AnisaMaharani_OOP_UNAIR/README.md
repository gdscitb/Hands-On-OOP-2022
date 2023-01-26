Program Warung Sederhana --> Pencatat Pesanan pelanggan

Buatlah suatu program yang _perlu_ mengimplementasikan konsep-konsep OOP, seminimalnya

- Inheritance --> (Semua class kecuali class Makanan dan MainDecorator)
- Interface dan/atau abstract class --> (abstract class Makanan dan Decorator Makanan)
- Polimorfisme --> (menggunakan metode override)
- Mengimplementasikan (minimal 1) design pattern --> (design pattern Decorator pada class DecoratorMakanan)
  Alasan : Begitu banyaknya pilihan design pattern yang ada dan waktu yang sempit karena banyak kegiatan lain pula, hanya design pattern ini yang bagi saya mudah untuk diaplikasikan dan dipahami meskipun saya juga masih tahap belajar memahami sepenuhnya
- Mengimplementasikan (minimal 1) prinsip SOLID --> (prinsip Dependency Inversion Principle : class Ayam,Telur,Daging, Original bergantung lgsg pd abstract class DecoratorMakanan dan class DecoratorMakanan bergantung pada abstract class Makanan ; Single-Responsibility Principle : class Ayam, Daging, Telur, Original yang dipisah)

Klaim Bonus :

1.  Interactive program (Menerima input pesanan dan menampilkan kembali pesanan sesuai input)
2.  Multilevel inheritance (class Makanan diwariskan pada class DecoratorMakanan dan class DecoratorMakanan diwariskan kepada class Ayam, Telur, dan Daging)

Cara Menjalankan Program : Run pada class MainDecorator dan masukkan input sesuai yang tertera
