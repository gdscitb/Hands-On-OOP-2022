interface Shape {
    double getArea(); // metode interface yang akan diimplementasikan oleh kelas-kelas
}

abstract class Polygon implements Shape {
    protected int[] sides;

    public Polygon(int[] s) { // constructor untuk menginisialisasi sisi-sisi poligon
        sides = s;
    }

    public double getPerimeter() { // metode untuk menghitung keliling poligon
        double perimeter = 0;
        for (int side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

    public abstract double getArea(); // metode abstrak yang akan diimplementasikan oleh kelas-kelas
}

class Rectangle extends Polygon { // kelas persegi panjang yang diwarisi dari kelas poligon
    public Rectangle(int width, int height) { // constructor untuk menginisialisasi lebar dan tinggi persegi panjang
        super(new int[] { width, height, width, height });
    }

    @Override
    public double getArea() { // menimpa metode interface
        return sides[0] * sides[1];
    }
}

class Square extends Rectangle { // kelas persegi yang diwarisi dari kelas persegi panjang
    public Square(int side) {
        super(side, side);
    }
}

class Circle implements Shape { // kelas Circle yang mengimplementasikan interface Shape
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double getArea() { // menimpa metode interface
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3]; // membuat array untuk menampung objek-objek
        shapes[0] = new Rectangle(10, 5);
        shapes[1] = new Square(5);
        shapes[2] = new Circle(5);

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}