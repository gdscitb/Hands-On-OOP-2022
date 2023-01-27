# Deskripsi Program
Simulasi "Database" Sederhana berisi List Classroom yang memiliki Teacher tertentu dan Beberapa Students yang berbeda latar belakang.

## Design Pattern
Singleton -> DatabaseManager sebagai Singleton, karena hanya boleh ada satu instance dalam sebuah runtime program

singleton dipilih karena sudah familiar. Sebelumnya, sudah sempat mempelajari singleton untuk keperluan GameDevelopment.

## SOLID Principle
- Open-Closed principle (student dan inheritance nya)
- Liskov Substitution principle (studennt dan inheritance nya)

## Dependency
  Program tidak menggunakan dependency eksternal. Melainkan, menggunakan sebuah dependensi yang sudah dibuat menjadi lokal dalam folder yang sama, yaitu `nlohmann/json.hpp`.

[[JSON for ModernC++]](https://github.com/nlohmann/json)

  Dependensi ini digunakan untuk melakukan penyimpanan data dalam sebuah file berformat json sehingga dapat lebih mudah untuk dilakukan pengamatan.

## Lain-lain
Multi-inheritance juga sedikit digunakan dalam program ini untuk mempermudahkan pembelajaran OOP.

# Cara Menjalankan
```bash
> g++ src/main.cpp src/Classroom.cpp src/DatabaseManager.cpp src/Student.cpp src/Teacher.cpp src/User.cpp src/randint.h -o "./bin/main.exe" 
```

dan buka executable `bin/main.exe`
