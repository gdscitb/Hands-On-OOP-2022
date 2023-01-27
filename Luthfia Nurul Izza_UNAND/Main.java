import java.util.ArrayList;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return name + " shape";
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends Rectangle {
    public Square(String name, double side) {
        super(name, side, side);
    }
}

class SOLIDShapes {
    private ArrayList<Shape> shapes;

    public SOLIDShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public double areaOfShapes() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }

    public double perimeterOfShapes() {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.perimeter();
        }
        return totalPerimeter;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle("rectangle", 10, 20));
        shapes.add(new Circle("circle", 5));
        shapes.add(new Square("square", 15));

        SOLIDShapes solidShapes = new SOLIDShapes(shapes);

        System.out.println("Area of all shapes: " + solidShapes.areaOfShapes());
        System.out.println("Perimeter of all shapes: " + solidShapes.perimeterOfShapes());
    }
}
