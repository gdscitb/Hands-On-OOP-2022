# Simple Send, delivery management program

## Deskripsi program
Program ini digunakan untuk melakukan management pengiriman barang. Pengguna dapat memilih jenis logistik yang digunakan (Land atau Sea), mengirimkan barang, melihat daftar pengiriman, dan melihat total biaya pengiriman.

Saat mengirimkan barang, jenis Transport yang digunakan secara otomatis ditentukan dari weight dan distance yang dimasukkan.

<hr>

## Design Pattern

### Template Method Pattern

Termasuk behavioral pattern, terdapat dalam `Transport.ts` untuk implementasi abstract class `Transport`. Class ini memiliki kerangka metode `deliver()`, `ETA()`, `cost()`, dan `toString()`. Kemudian dibuat subclass `Motorcycle`, `Car`, `Truck`, dan `Ship` yang mengubah dan melengkapi beberapa metode ataupun parameter objek yang diperlukan.

Saya memilih pattern ini agar program lebih mudah dibaca dan diubah. Jika terdapat perubahan pada algoritma, maka hanya perlu mengubah pada superclass saja. Jika terdapat perubahan pada parameter, maka hanya perlu mengubah pada subclass saja.

### Factory Method Pattern

Termasuk creational pattern, digunakan untuk implementasi dalam `Logistic.ts`, dibuat dua class Factory `LandLogistic` dan `SeaLogistic`. `LandLogistic` akan mengembalikan jenis Transport `Motorcycle`, `Car`, ataupun `Truck` sesuai dengan weight dan distance yang dimasukkan. `SeaLogistic` akan mengembalikan jenis Transport `Ship`.

Saya memilih pattern ini karena Transport yang digunakan akan ditentukan dari weight dan distance. Jadi untuk mempermudah, saya membuat class Factory agar class yang memanggil tidak perlu mengetahui class Transport yang digunakan. Dan jika nantinya ada perubahan pada jenis Transport yang digunakan, maka cukup mengubah pada class Factory saja.

<hr>

## Cara menjalankan program
build
```
npm install && npm run build
```

run
```
npm start
```

<hr>

## Versi bahasa dan dependency

Bahasa
- node v18.13.0

Dependency
- typescript 4.9.4
- @types/node 18.11.18

<hr>

## Konsep-konsep lain

- Interactive program
- Functional programming (reduce) untuk `totalCost()` pada `DeliveryManager.ts`
- Dependency Injection pada class `DeliveryManager` termasuk SOLID principle (Dependency Inversion Principle)
