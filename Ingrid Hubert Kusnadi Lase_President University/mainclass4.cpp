//OOP_Inheritance, Interfaces, Polymorphism, Design Patterns, and SOLID - Ingrid Hubert Kusnadi Lase_PresUniv

#include <iostream>
#include <vector>

// Interface for shape objects
class Shape {
 public:
  virtual double area() = 0;
};

// Abstract class for 2D shapes
class TwoDShape: public Shape {
 public:
  TwoDShape(double w, double h) : width_(w), height_(h) {}
  double width() const { return width_; }
  double height() const { return height_; }
  void resize(double w, double h) { width_ = w; height_ = h; }
 private:
  double width_;
  double height_;
};

// Class for rectangles
class Rectangle: public TwoDShape {
 public:
  Rectangle(double w, double h) : TwoDShape(w, h) {}
  double area() { return width() * height(); }
};

// Class for triangles
class Triangle: public TwoDShape {
 public:
  Triangle(double b, double h) : TwoDShape(b, h) {}
  double area() { return width() * height() / 2; }
};

// Design pattern: Composite pattern
class ShapeGroup: public Shape {
 public:
  void addShape(Shape* shape) { shapes_.push_back(shape); }
  double area() {
    double area = 0;
    for (auto shape : shapes_) {
      area += shape->area();
    }
    return area;
  }
 private:
  std::vector<Shape*> shapes_;
};

// SOLID principle: Single responsibility
class ShapeCalculator {
 public:
  double calculateArea(Shape* shape) { return shape->area(); }
};

int main() {
  ShapeCalculator calculator;
  
  Rectangle rect(4, 5);
  std::cout << "Rectangle area: " << calculator.calculateArea(&rect) << std::endl;
  
  Triangle tri(4, 5);
  std::cout << "Triangle area: " << calculator.calculateArea(&tri) << std::endl;
  
  ShapeGroup group;
  group.addShape(&rect);
  group.addShape(&tri);
  std::cout << "Group area: " << calculator.calculateArea(&group) << std::endl;
  
  return 0;
}
