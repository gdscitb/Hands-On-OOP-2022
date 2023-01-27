Program PCBuilder merupakan program yang memudahkan pengguna untuk merencanakan bagian-bagian yang akan dirakit menjadi sebuah PC. Program PC Builder memungkinkan pengguna untuk memilih komponen Processor, Memory, dan Graphics Card sesuai dengan yang diinginkan. Program masih berupa purwarupa, sehingga masih terdapat kekurangan seperti keterbatasan fitur dan kurangnya pilihan kustomisasi.

Program ini menerapkan beberapa prinsip OOP, di antaranya:
1. Inheritance: Class Processor, Memory, dan GraphicsCard mewarisi properti dan metode dari class Component sebagai parent-nya
2. Interface: Class PC mengimplemenasikan interface Buildable dan mewarisi properti dan metode dari class Component sebagai parent-nya
3. Poliformisme: Metode display() pada class Processor, Memory, GraphicsCard, dan PC memiliki implementasi yang berbeda-beda.
4. Design pattern: Class PC mengimplementasikan konsep composition dengan menyimpan objek Processor, Memory, dan Graphics Card sebagai bagian-bagian dari PC. Design pattern ini dipilih karena pengorganisasian kelasnya yang dinilai lebih cocok untuk program seperti ini.
5. SOLID principles: Class PC hanya memiliki satu responsibilitas yaitu sebagai container dari objek Processor, Memory, dan GraphicsCard, sehingga memenuhi prinsip Single Responsibility Principle.

Program ini juga meminta input dari pengguna untuk nama, harga, kecepatan, kapasitas, dan memori dari processor, memory, dan graphics card.

Program ini dibuat menggunakan bahasa pemrograman Java dengan versi 1.8.0_51.