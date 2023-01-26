import java.util.Scanner;
import java.lang.Math;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Square extends Shape {
    private double squareSide;

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    double calculateArea() {
        return (squareSide*squareSide);
    }

    double calculatePerimeter() {
        return (squareSide*4);
    }
}

class Triangle extends Shape {
    private double triangleSide1;
    private double triangleSide2;
    private double triangleSide3;

    public Triangle(double triangleSide1, double triangleSide2, double triangleSide3) {
        this.triangleSide1 = triangleSide1;
        this.triangleSide2 = triangleSide2;
        this.triangleSide3 = triangleSide3;
    }

    double calculateArea() {
        double s = (triangleSide1 + triangleSide2 + triangleSide3) / 2;
        return ((Math.sqrt(s*(s - triangleSide1)*(s - triangleSide2)*(s - triangleSide3))));
    }

    double calculatePerimeter() {
        return (triangleSide1 + triangleSide2 + triangleSide3);
    }

}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return (Math.PI*radius*radius);
    }

    double calculatePerimeter() {
        return (Math.PI*2*radius);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return (length*width);
    }

    double calculatePerimeter() {
        return ((2*length) + (2*width));
    }
}

class Rhombus extends Shape {
    private double diagonal1;
    private double diagonal2;

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    double calculateArea() {
        return (0.5*diagonal1*diagonal2);
    }

    double calculatePerimeter() {
        double rhombusSide = Math.sqrt((diagonal1*diagonal1*0.25) + (diagonal2*diagonal2*0.25));
        return (rhombusSide*4);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cnt = true;

        while (cnt) {
            System.out.println("============================o============================");
            System.out.println("Welcome to the Area and Perimeter Calculator of Two-Dimensional Shapes! :)");
            System.out.println("Here is a selection of shapes available for this calculator!");
            System.out.println("1. Triangle");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            System.out.println("4. Rhombus");
            System.out.println("5. Circle");
        
            boolean validShapeChoice = false;
            while (!validShapeChoice) {
                System.out.print("Which shape do you want to calculate? Enter the number (1/2/3/4/5): ");
                int shapeChoice = sc.nextInt();
                if (shapeChoice == 1 || shapeChoice == 2 || shapeChoice == 3 || shapeChoice == 4 || shapeChoice == 5) {
                    validShapeChoice = true;
                    switch (shapeChoice) {
                        case 1:
                            System.out.print("Enter side 1 length: ");
                            double side1 = sc.nextDouble();
                            System.out.print("Enter side 2 length: ");
                            double side2 = sc.nextDouble();
                            System.out.print("Enter side 3 length: ");
                            double side3 = sc.nextDouble();
                            Shape triangle = new Triangle(side1, side2, side3);
        
                            System.out.println("\n" + "Area: " + triangle.calculateArea());
                            System.out.println("Perimeter: " + triangle.calculatePerimeter());
                            break;
                        case 2:
                            System.out.print("Enter side length: ");
                            double side = sc.nextDouble();
                            Shape square = new Square(side);
        
                            System.out.println("\n" + "Area: " + square.calculateArea());
                            System.out.println("Perimeter: " + square.calculatePerimeter());
                            break;
                        case 3:
                            System.out.print("Enter length: ");
                            double length = sc.nextDouble();
                            System.out.print("Enter width: ");
                            double width = sc.nextDouble();
                            Shape rectangle = new Rectangle(length, width);
        
                            System.out.println("\n" + "Area: " + rectangle.calculateArea());
                            System.out.println("Perimeter: " + rectangle.calculatePerimeter());
                            break;
                        case 4:
                            System.out.print("Enter diagonal 1 length: ");
                            double diag1 = sc.nextDouble();
                            System.out.print("Enter diagonal 2 length: ");
                            double diag2 = sc.nextDouble();
                            Shape rhombus = new Rhombus(diag1, diag2);
        
                            System.out.println("\n" + "Area: " + rhombus.calculateArea());
                            System.out.println("Perimeter: " + rhombus.calculatePerimeter());
                            break;
                        case 5:
                            System.out.print("Enter radius length: ");
                            double rads = sc.nextDouble();
                            Shape circle = new Circle(rads);
        
                            System.out.println("\n" + "Area: " + circle.calculateArea());
                            System.out.println("Perimeter: " + circle.calculatePerimeter());
                            break;
                    }        
                } else { 
                    System.out.println("Input invalid! Please input the right number!");
                }
            }

            boolean continueChoiceValid = false;
            System.out.println("Calculation finished. Do you wish to try again?");
            while (!continueChoiceValid) {
                System.out.print("Enter 1 for yes, 2 for no: ");
                int continueChoice = sc.nextInt();
                if (continueChoice == 1) {
                    continueChoiceValid = true;
                } else if (continueChoice == 2) {
                    continueChoiceValid = true;
                    cnt = false;
                } else {
                    System.out.println("Input invalid! Please try again!");
                }
            }

        }

        System.out.println("Thank you for trying this calculator :)");
        System.out.println("============================o============================" + "\n");
    }

}