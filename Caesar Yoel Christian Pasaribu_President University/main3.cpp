//OOP_Inheritance, Interfaces, Polymorphism, Design Patterns, and SOLID - Caesar Yoel Christian Pasaribu_President University

#include <iostream>
#include <vector>
#include <cmath>
#include <math.h>

// Interface
class Shape {
public:
    virtual double area() = 0;
};

// Abstract class
class Polygon : public Shape {
protected:
    std::vector<double> sides;

public:
    Polygon(const std::vector<double>& s) : sides(s) {}

    double perimeter() {
        double p = 0;
        for (auto side : sides) {
            p += side;
        }
        return p;
    }
};

// Inheritance
class Rectangle : public Polygon {
public:
    Rectangle(double w, double h) : Polygon({w, h, w, h}) {}

    double area() override {
        return sides[0] * sides[1];
    }
};

class Triangle : public Polygon {
public:
    Triangle(double a, double b, double c) : Polygon({a, b, c}) {}

    double area() override {
        double p = perimeter() / 2;
        double a = sides[0], b = sides[1], c = sides[2];
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }
};

class Circle : public Shape {
private:
    double radius;

public:
    Circle(double r) : radius(r) {}

    double area() override {
        return 3.14 * radius * radius;
    }
};

// Design pattern
class ShapeFactory {
public:
    static Shape* createShape(std::string type, std::vector<double> args) {
        if (type == "rectangle") {
            return new Rectangle(args[0], args[1]);
        } else if (type == "triangle") {
            return new Triangle(args[0], args[1], args[2]);
        } else if (type == "circle") {
            return new Circle(args[0]);
        } return 0;
    }
};

int main() {
    // SOLID
    std::vector<Shape*> shapes;
    shapes.push_back(ShapeFactory::createShape("rectangle", {3, 4}));
    shapes.push_back(ShapeFactory::createShape("triangle", {3, 4, 5}));
    shapes.push_back(ShapeFactory::createShape("circle", {5}));

    for (auto shape : shapes) {
        std::cout << shape->area() << std::endl;
    }

    // Clean up
    for (auto shape : shapes) {
        delete shape;
    }

    return 0;
}