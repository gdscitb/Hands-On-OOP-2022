import java.lang.Math;
import java.util.Scanner;

abstract class Shape {
    abstract double Area();
    abstract double Perimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double Perimeter() {
        return 2 * Math.PI * radius;
    }

    public double Area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Cone {
    private Shape circle;
    private double height;
    private double radius;
    private double miring;

    public Cone(Shape circle, double height, double radius, double miring) {
        this.circle = circle;
        this.height = height;
        this.radius = radius;
        this.miring = miring;
    }

    public double Area() {
        return Math.PI * radius * (radius + miring);
    }

    public double Volume() {
        return circle.Area() * height / 3;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Masukkan radius lingkaran: ");
        double radius = myObj.nextDouble();

        System.out.println("Masukkan panjang sisi miring: ");
        double miring = myObj.nextDouble();

        System.out.println("Masukkan tinggi kerucut: ");
        double height = myObj.nextDouble();
        myObj.close();

        Shape circle = new Circle(radius);
        Cone cone = new Cone(circle, height, radius, miring);

        System.out.println("Keliling lingkaran adalah " + circle.Perimeter());
        System.out.println("Luas lingkaran adalah " + circle.Area());
        System.out.println("Luas permukaan kerucut adalah " + cone.Area());
        System.out.println("Volume kerucut adalah " + cone.Volume());
    }
}