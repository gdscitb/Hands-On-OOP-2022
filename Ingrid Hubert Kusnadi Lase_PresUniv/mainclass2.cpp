//OOP_Interfaces, Abstract Classes, and Design Patterns - Ingrid Hubert Kusnadi Lase_PresUniv

#include <iostream>
#include <vector>

// Interface for shape
class Shape {
 public:
    virtual void draw() = 0;
};

// Abstract class for 2D shapes
class TwoDShape : public Shape {
 protected:
    double width;
    double height;
 public:
    TwoDShape(double width, double height) : width(width), height(height) {}
    virtual double getArea() = 0;
};

// Rectangle class implementing TwoDShape
class Rectangle : public TwoDShape {
 public:
    Rectangle(double width, double height) : TwoDShape(width, height) {}
    virtual void draw() { std::cout << "Drawing rectangle...\n"; }
    virtual double getArea() { return width * height; }
};

// Circle class implementing TwoDShape
class Circle : public TwoDShape {
 private:
    double radius;
 public:
    Circle(double radius) : TwoDShape(radius, 0), radius(radius) {}
    virtual void draw() { std::cout << "Drawing circle...\n"; }
    virtual double getArea() { return 3.14159 * radius * radius; }
};

// Using the factory design pattern to create Shape objects
class ShapeFactory {
 public:
    static Shape* createShape(std::string type, double width, double height) {
        if(type == "Rectangle") return new Rectangle(width, height);
        if(type == "Circle") return new Circle(width);
        return nullptr;
    }
};

int main() {
    Shape* rectangle = ShapeFactory::createShape("Rectangle", 4, 5);
    rectangle->draw();
    std::cout << "Area of rectangle: " << dynamic_cast<TwoDShape*>(rectangle)->getArea() << std::endl;
    Shape* circle = ShapeFactory::createShape("Circle", 3, 4);
    circle->draw();
    std::cout << "Area of circle: " << dynamic_cast<TwoDShape*>(circle)->getArea() << std::endl;
}
