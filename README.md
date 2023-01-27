Interface IVehicle menentukan method yang harus diimplementasikan oleh class yang mengimplementasikannya.
Class Vehicle adalah class abstract yang mengimplementasikan interface IVehicle dan menyediakan implementasi dasar untuk method startEngine() dan stopEngine().
Class Car adalah turunan dari class Vehicle dan menambahkan property model dan year dan method displayDetails().
Class SportsCar adalah turunan dari class Car dan menambahkan property topSpeed dan mengoverride method displayDetails().
Melalui penggunaan inheritance, kita dapat mengakses method dari class parent di class child.
Melalui penggunaan interface, kita dapat memastikan bahwa semua class yang mengimplementasikannya akan menyediakan implementasi yang sesuai untuk method yang ditentukan dalam interface.
Melalui penggunaan abstract class, kita dapat memberikan implementasi dasar untuk method yang akan digunakan oleh class turunannya.
Melalui penggunaan polimorfisme, kita dapat menggunakan objek dari class child sebagai objek dari class parent dan mengakses method yang dioverride oleh class child.
Design pattern yang digunakan dalam contoh ini adalah Template Method Pattern, dimana class parent menyediakan implementasi dasar untuk method yang akan digunakan oleh class turunannya, tetapi class turunan dapat meng-override method tersebut untuk memberikan implementasi yang lebih spesifik.
Prinsip SOLID yang digunakan dalam contoh ini adalah Single Responsibility Principle (SRP), dimana setiap class memiliki tanggung jawab yang terbatas dan spesifik. Class Vehicle bertanggung jawab untuk mengatur engine, class Car bertanggung jawab untuk menyimpan detail model dan tahun, dan class SportsCar bertanggung jawab untuk menyimpan detail topSpeed.