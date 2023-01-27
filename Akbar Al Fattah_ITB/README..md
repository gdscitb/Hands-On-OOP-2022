# Hands On OOP

## Daftar class
1. Player: berisi warna skin yang dapat diperiksa dengan getColor() dan mengubah warna dengan changeColor()
2. Item: abstract class yang merupakan benda
3. ThrowableItem: turunan dari class item yang merupakan benda yang bisa dilempar dengan fungsi throwItem()
4. NonThrowableItem: turunan dari class item yang merupakan benda yang tidak bisa dilempar, namun bisa disimpan dengan fungsi saveItem()

## Syarat minimum:
1. prinsip SOLID. S: Single Responsibility
2. abstract class: item akan menjadi superclass/cetak biru dari ThrowableItem dan NonThrowableItem
3. Polymorphism: Item dapat berupa ThrowableItem dan NonThrowableItem
4. Inheritance: class ThrowableItem dan NonThrowableItem adalah turunan dari Item
5. Design patterns: Classification:Creational patterns. Class player, ThrowableItem,dan NonThrowableItem dapat digunakan berulang-ulang