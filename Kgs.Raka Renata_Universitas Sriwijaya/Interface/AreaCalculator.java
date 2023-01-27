
//program ini menggunakan prinsip Open Closed Principle, yaitu tidak boleh ada modifikasi di dalam atribut maupun fungsi di dalam kelas

interface Shape {
    double area();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area() {
        return width * height;
    }
}
class AreaCalculator {
    public double area(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.area();
        }
        return area;
    }

    public static void main(String[] args) {
        Circle lingkaran = new Circle(100);
        System.out.println(lingkaran.area());
    }
}
