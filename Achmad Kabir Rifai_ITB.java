interface Shape {
    double getArea();
}

abstract class Shape2D implements Shape {
    abstract double getPerimeter();
}

class Rectangle extends Shape2D {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Circle extends Shape2D {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Shape3D {
    private Shape2D shape2D;
    private double height;

    public Shape3D(Shape2D shape2D, double height) {
        this.shape2D = shape2D;
        this.height = height;
    }

    public double getVolume() {
        return shape2D.getArea() * height;
    }
}

class Main {
    public static void main(String[] args) {
        Shape2D rectangle = new Rectangle(10, 5);
        Shape2D circle = new Circle(3);
        Shape3D cylinder = new Shape3D(circle, 10);

        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());
        System.out.println("Volume of cylinder: " + cylinder.getVolume());
    }
}
