/*
Deskripsi program: Program ini dibuat untuk menghitung luas dari 2 bangun datar, yaitu lingkaran atau segiempat.

Keterangan:
- Factory Method adalah salah satu Design Pattern untuk membuat objek
- Design pattern yang saya gunakan ada di "ShapeFactory" yang termasuk design pattern Factory Method.
- Design pattern ini berguna untuk menentukan objek berdasarkan input dari user.
- Alasan saya memilih design pattern ini adalah inheritance dari class AbstractShape yang ada 2, sehingga kode fleksibel dan objek lain dapat mudah ditambahkan.
- Cara menjalankan programnya adalah melakukan run pada aplikasi compiler/terminal, lalu melakukan input sesuai yang diminta.
- Bahasa pemrograman yang digunakan adalah bahasa Java.
- Ini merupakan interactive program karena program ini meminta input user, dan mengeluarkan output berdasarkan input user.

*/
import java.util.Scanner;

interface Shape {
    double getArea();
}

abstract class AbstractShape implements Shape {
    protected double width;
    protected double height;
}

class Rectangle extends AbstractShape {
    public Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang segiempat: ");
        this.width = sc.nextDouble();
        System.out.print("Masukkan lebar segiempat: ");
        this.height = sc.nextDouble();
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle extends AbstractShape {
    private double radius;
    public Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        this.radius = sc.nextDouble();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Segiempat")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Lingkaran")) {
            return new Circle();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hitung luas bentuk apa? (Segiempat/Lingkaran): ");
        String shapeType = sc.nextLine();
        Shape shape = ShapeFactory.getShape(shapeType);
        System.out.println("Luas bentuk: " + shape.getArea());
    }
}
