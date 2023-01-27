Deskripsi program:
Program ini adalah contoh sederhana dari implementasi konsep-konsep OOP di Java, yaitu Inheritance, Interface dan/atau abstract class, Polimorfisme,  dan Design Pattern. 

Inheritance: Kelas Rectangle dan Circle diwarisi dari kelas abstrak Shape. Kelas Square juga diwarisi dari kelas Rectangle.

Polimorfisme: Kelas Shape, Rectangle, Circle, dan Square memiliki metode area() dan perimeter() yang memiliki implementasi yang berbeda-beda.

Prinsip SOLID: Prinsip SOLID yang diterapkan dalam program tersebut adalah Single Responsibility Principle (SRP). Kelas SOLIDShapes hanya bertanggung jawab untuk menghitung luas dan keliling dari berbagai bentuk yang diberikan kepadanya.

Design pattern : Kelas SOLIDShapes menggunakan design pattern "Composite" yang digunakan untuk mengelompokkan beberapa objek dalam satu objek agar dapat diperlakukan secara sama.

Dalam program ini, terdapat 4 kelas yang digunakan, yaitu kelas Shape, Rectangle, Circle, dan Square. Kelas Shape adalah kelas abstrak yang mengimplementasikan interface dengan menggunakan keyword abstract dan digunakan sebagai parent class dari kelas Rectangle dan Circle. Kelas Rectangle dan Circle mewarisi semua properti dan method dari kelas Shape dan mengimplementasikan method abstrak yang ditentukan oleh kelas Shape. Selain itu, Kelas Square mewarisi dari kelas Rectangle. Kemudian di main class terdapat class SOLIDShapes yang digunakan untuk menampung list dari objek Shape dan menghitung total area dan perimeter nya.



Letak implementasi design pattern tersebut:
Implementasinya terletak pada class SOLIDShapes.
Class SOLIDShapes hanya memiliki 1 fungsi yaitu menghitung total area dan perimeter dari objek-objek yang di tampung di list nya.

Alasan pemilihan design pattern tersebut:
Design pattern "Composite" dipilih karena sesuai dengan tujuan dari program tersebut yaitu untuk mengelompokkan berbagai bentuk dalam sebuah objek agar dapat dihitung luas dan kelilingnya secara bersama-sama. Kelas SOLIDShapes mengumpulkan beberapa objek Shape dalam sebuah ArrayList dan menyediakan metode areaOfShapes() dan perimeterOfShapes() untuk menghitung luas dan keliling dari semua bentuk yang ada di dalam ArrayList tersebut.

"Composite" pattern memungkinkan untuk mengolah sekumpulan objek dalam satu objek agar diperlakukan secara sama. Hal ini sesuai dengan tujuan dari program ini yaitu mengelompokkan berbagai bentuk dalam sebuah objek agar dapat dihitung luas dan kelilingnya secara bersama-sama.

Cara menjalankan program:
Untuk menjalankan program ini, Anda dapat menyimpan kode di atas ke dalam file dengan ekstensi .java, kemudian mengcompile dan menjalankannya menggunakan command line atau IDE seperti Eclipse atau IntelliJ IDEA.

Versi bahasa dan dependency yang digunakan:
Program ini ditulis dalam bahasa Java versi 8, dan tidak memerlukan dependency eksternal apapun.

Konsep-konsep lain yang digunakan dalam program ini adalah Collection. Collection digunakan untuk menyimpan objek-objek yang dibuat dari kelas Rectangle, Circle, dan Square. Collection yang digunakan adalah ArrayList, yang digunakan untuk menyimpan objek-objek tersebut dan menghitung total area dan perimeter nya. ArrayList digunakan karena memiliki kemampuan untuk menambah dan menghapus objek secara dinamis.

Keunikan program ini adalah implementasi konsep-konsep OOP yang digabungkan dalam satu program, termasuk implementasi interface dan abstract class, inheritance, polimorfisme, dan design pattern, SOLID, serta penggunaan Collection untuk menyimpan objek dan menghitung total area dan perimeter. 
