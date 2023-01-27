<!-- Deskripsi program -->
Program dibuat untuk melakukan input data karyawan pada perusahaan yang terdiri dari staff dan manager pada suatu perusahaan, lalu data tersebut disimpan dalam arrayList yang berbeda sesuai dengan jabatannya. Selain itu, program dapat digunakan untuk menghitung gaji per-bulan dari karyawan tersebut. Kemudian, program dapat mengoutputkan semua yang telah diinputkan dengan cara mengambil data dari arrayList yang digunakan untuk menyimpan data karyawan sesuai jabatan. Lalu Jika User ingin menghapus data karyawan, program dapat melakukan remove data dari ArrayList sesuai jabatan dengan cara user menginputkan id dari karyawan yang ingin dihapus tersebut.

<!-- Penjelasan design pattern yang dipilih -->
Program ini menggunakan design pattern yaitu Factory Method. Design Pattern Factory Method berguna untuk menentukan Interface atau Abstract Class untuk membuat object. Namun, selanjutnya untuk melakukan instansiasi bergantung pada subclass yang telah implement dari interface atau Abstract Class. 


<!-- Letak implementasi design pattern tersebut -->
Pengimplementasian design pattern Factory Method tersebut terletak pada class EmployeeFactory yang mengimplementasikan pembuatan object dari Interface EmployeeInterface yaitu dengan melakukan override dari function createManager dan createStaff



<!-- Alasan pemilihan design pattern tersebut -->
Alasan mengapa program menggunakan dessing pattern Factory Method adalah supaya ketika melakukan instansiasi kita dapat menentukan Object apa saja yang ingin dibuat dengan memanfaatkan subclass dari Interface atau Abstract Class yang mengimplementasikan design pattern Factory Method tersebut sehingga menjadi lebih efisien ketika melakukan instansiasi dan kerangka sudah jelas pada Interface atau Abstract Kelas.


<!--Pengimplementasian prinsip SOLID -->
Program mengimplementasikan prinsip Single Responsibility Principle yaitu pada setiap class hanya memiliki satu tugas. Prinsip ini diimplementasikan pada program seperti pada class Manager yang bertugas untuk mengelola data Karyawan seperti melakukan perhitungan Gaji perbulan yang sesuai untuk karyawan yang memegang jabatan Manager. Selain itu, pada class Staff yang bertugas untuk mengelola data Karyawan seperti melakukan perhitungan Gaji perbulan yang sesuai untuk karyawan yang memegang jabatan Staff.


<!-- Cara menjalankan program -->
Program dapat dijalankan dengan melakukan run pada file Main.java. Lalu inputkan angka sesuai dengan instruksi yang tertera untuk melanjutkan program. Lalu, jika input dari User tidak tepat maka program akan menampilkan instruksi yang sama sehingga tidak bisa lanjut ke menu berikutnya.



<!-- Versi bahasa dan dependency (jika ada) yang digunakan-->
Versi bahasa : java 19.0.1


<!-- Konsep-konsep lain yang kalian gunakan dan keunikan program (jika ada) -->
1. Merupakan Interactive program (Menerima input Data Karyawan, serta dapat melakukan perhitungan gaji per-bulan sesuai jabatan, lalu menampilkan data yang diinputkan serta perhitungan gaji per-bulan yang diperoleh, User juga dapat menghapus data karyawan sesuai dengan ID karyawan).

2. Menerapkan Multilevel Inheritance

3. (Ide Program) Program berbasis CRUD data karyawan pada perusahaan yang berarti program berguna untuk solving masalah secara nyata meskipun program hanya merupakan basic program.




