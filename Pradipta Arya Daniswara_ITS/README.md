# Hands On OOP: Remote TV Universal

## Deskripsi Program

Program ini mensimulasikan sebuah remote tv universal dengan menggunakan class ```RemoteControl``` yang menggunakan interface ```Control``` dimana remote tersebut dapat mengontrol 3 jenis tv yaitu ```TVSamsung```, ```TVLG```, dan ```TVPolytron``` dimana ketiganya merupakan derived class dari abstract class ```TVDefault```. 

User dapat melakukan input berupa:
- Menyalakan/mematikan tv
- Memindahkan channel pada tv
- Menaikkan dan menurunkan volume pada tv

## Design Pattern

Program ini menggunakan Behavioral Design Pattern, lebih tepatnya Command Design Pattern. Dalam Command Design Pattern input dari client akan diteruskan kepada invoker yang kemudian akan meneruskan input tersebut pada concrete command yang akan memberikan sebuah perintah yang kemudian akan dijalankan oleh receiver. Dalam program ini ```Control``` berlaku sebagai interface, ```TVSamsung```, ```TVLG```, dan ```TVPolytron``` yang merupakan derived class dari abstract class ```TVDefault``` berlaku sebagai concrete command dan receiver, ```RemoteControl``` berlaku sebagai invoker dan ```TVMenu``` sebagai client. Design pattern ini dipilih karena ```TVSamsung```, ```TVLG```, dan ```TVPolytron``` memiliki input yang sama diantara ketiganya sehingga digunakanlah ```RemoteControl``` sebagai controller dari ketiga class tersebut daripada membuat 3 jenis controller untuk masing-masing class tersebut. Penggunaan abstract class ```TVDefault``` digunakan karena ```TVSamsung```, ```TVLG```, dan ```TVPolytron``` memiliki banyak kesamaan sehingga lebih baik menggunakan template class yang sama yang kemudian diberikan modifikasi untuk tiap-tiap tv.

## Cara Menjalankan Program

User dapat menjalankan program dengan menjalankan ```TVMenu.java``` dengan ```javac TVMenu.java && java TVMenu```. Kemudian user memasukkan input yang diinginkan user untuk mengubah tampilan pada TV virtual yang sudah disiapkan. Output yang dihasilkan bervariasi bergantung pada input user, misalkan jika user ingin menyalakan TV Samsung maka output yang dikeluarkan adalah sebagai berikut:

```
--------------------------------------
Samsung TV turned on!
Currently watching RCTI with 50% volume!
--------------------------------------
```

## Versi Bahasa dan Dependency

Program ini menggunakan bahasa Java 18. Program ini tidak menggunakan dependency.

## Lain-lain

Program ini merupakan interactive program, dimana program ini menerima input dari user dan mengeluarkan output sesuai input tersebut.