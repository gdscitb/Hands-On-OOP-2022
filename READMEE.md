Deskripsi program: 
Program ini adalah program sederhana yang mengimplementasikan konsep-konsep OOP seperti Inheritance, Interface, Polimorfisme dan Design Pattern (Template Method). Program ini menggunakan kelas Rectangle dan Circle yang mewarisi dari kelas abstrak Shape2D yang mengimplementasikan interface Shape. Kemudian program ini menggunakan objek rectangle, circle, dan cylinder yang semuanya merupakan objek dari kelas yang mewarisi dari kelas Shape2D dan digunakan sebagai argument pada kelas Shape3D. Pada kelas Shape3D menggunakan method getVolume yang menggunakan method getArea pada kelas Shape2D.

Design pattern yang dipilih adalah Template Method Design Pattern. Design pattern ini digunakan untuk mengatur alur kerja dari sebuah method yang dapat digunakan oleh subkelas. Alur kerja dari sebuah method dapat digunakan oleh subkelas tanpa harus mengubah implementasinya. Dalam program ini, method getVolume pada kelas Shape3D menggunakan method getArea pada kelas Shape2D sebagai template untuk menghitung volume.

Letak implementasi design pattern tersebut adalah pada kelas Shape3D, yaitu pada method getVolume.

Alasan pemilihan design pattern tersebut adalah karena design pattern ini dapat digunakan untuk mengatur alur kerja dari sebuah method yang dapat digunakan oleh subkelas tanpa harus mengubah implementasinya, sehingga dapat meningkatkan fleksibilitas dari program.

Cara menjalankan program:

- Copy dan paste kode program ke dalam editor yang digunakan (misal Eclipse, IntelliJ, dll)
- Save file dengan ekstensi .java
- Klik kanan pada file yang sudah disave, lalu pilih "Run as" -> "Java Application"
- Versi bahasa dan dependency yang digunakan: Program ini ditulis menggunakan bahasa Java versi 8, tidak ada dependency yang dibutuhkan.

Konsep-konsep lain yang digunakan adalah Inheritance, Interface, dan Polimorfisme. Program ini unik karena menggabungkan beberapa konsep OOP yang berbeda dalam satu program yang sederhana.
