/*

* =============== VEHICLE MOVE PROGRAM  ===================
Project ini merupakan implementasi dari OOP pada kendaraan yang bergerak

====== VEHICLE CLASS ========
Terdapat sebuah parent class yang bernama Vehicle
Properti (variabel) spesifik yang ada di setiap vehicle tentu saja adalah string 'name', int 'speed', dan int 'direction' (direction dalamn derajat) 
Setiap jenis Vehicle tentu saja bergerak (move). Nah pada saat bergerak, yang kena pengaruhnya adalah speed dan direction (lihat contoh functionnya di class Vehicle)
Setiap jenis vehicle juga berubah arah (steer). Nah pada saat berubah arah, yang kena pengaruhnya adalah dirfection(lihat contoh functionnya di class Vehicle)
Nah Vehicle ini kan punya banyak jenis (contohnya car, ship, plane, etc). Di program ini akan discover salah satu jenis vehicle, yaitu car


====== CAR CLASS =======
Class Car merupakan inherit dari class Vehicle
Adapun properti spesifik yang dipunyai oleh Car yaitu banyak pintu (doors), gearbox (gears), jenis transmisi (isManual), dan type atau jenis mobil (type)
Nah setiap mobil kan bisa berubah gear (1 sampai 6), jadi function program yang akan digunakan pada class ini adalah perubahan dari gearbox tersebut (changeGear) yang merupakan int
Setiap mobil juga bisa berubah kecepatan, jadi akan digunakan function method changeSpeed yang nantinya akan berpengaruh pada speed dan directionnya
Nah Vehicle ini kan punya banyak jenis (contohnya SUV, MPV, LCGC, Crossover, etc), pada contoh di program ini akan dibuat jenis mobil MPV dan LCGC


============ MULTIPLE LEVEL INHERITANCE: LCGC CLASS & MPV CLASS =================
Kedua class tersebut (LCGC dan MPV) merupakan inherit dari Car Class
Setiap jenis mobil memiliki accelerate, speed, gearbox yang berbeda beda
Nah pada program ini, akan dikeluarkan output berupa speed dan posisi gearbox yang nantinya dapat diinput programmnya di bagian Main Class


KETENTUAN MINIMAL
1) Inheritance, sudah ada pada setiap class yang dibuat, contohnya pada Car Class yang melakukan inherit dari Vehicle Class serta MPV class dan LCGC class yang melakukan multiple inherit dari Car class
2) Abstract class, terdapat pada car class dimanaclass tersebut masih dalam bentuk abstrak. Karena bentuknya masih abstrak, dia tidak bisa dibuat langsung menjadi objek.
3) Polimorfisme, digunakan pada LCGC class dan MPV class yang masing masing sama sama menggunakan class dari satu nama, yaitu car
4) SOLID, sudah menggunakan prinsip SOLD
5) Design pattern: Class creational patterns

Contoh inputan sederhana ada di bawah ini
*/

public class main{
    public static void main(String[] args){
        LCGC Ayla = new LCGC("Ayla", true);
        Ayla.move(40, 0);
        Ayla.accelerate(20);
    }
}
