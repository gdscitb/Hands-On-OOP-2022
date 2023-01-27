#include <iostream>
#include <stdio.h>
#include <string>

// template interface bangun datar
class Shape {
 public:
  virtual double getArea() = 0;
  virtual double getPerimeter() = 0;
};

// class segi empat
class Rectangle : public Shape {
 private:
  double width_;
  double height_;

 public:
  Rectangle(double width, double height) : width_(width), height_(height) {}
  double getArea() override { return width_ * height_; }
  double getPerimeter() override { return 2 * (width_ + height_); }
};

// inheritance segi empat: persegi
class Square : public Rectangle {
 public:
  Square(double side) : Rectangle(side, side) {}
};

// single responsibility, luas bangun datar
class AreaCalculator {
 public:
  double calculate(Shape &shape) { return shape.getArea(); }
};

// open/closed principle, keliling bangun datar
class PerimeterCalculator {
 public:
  double calculate(Shape &shape) { return shape.getPerimeter(); }
};

// --------- ---------PROGRAM UTAMA --------- ---------

int main() {
  
  printf("PROGRAM MENGHITUNG KELILING DAN LUAS SEGI EMPAT DAN PERSEGI\n");
  
  // deklarasi fungsi menghitung luas dan keliling
  AreaCalculator areaCalculator;
  PerimeterCalculator perimeterCalculator;
  
  // deklarasi & input spesifikasi segi empat
  int in_width;
  int in_height;
  printf("Masukkan lebar segi empat: ");
  scanf("%d", &in_width);
  printf("Masukkan tinggi segi empat: ");
  scanf("%d", &in_height);
  
  // deklarasi segi empat berdasarkan input spesifikasi (polimorfisme)
  Shape *rectangle = new Rectangle(in_width, in_height);
  
  // output luas dan keliling segi empat
  std::cout << "Luas segi empat: " << areaCalculator.calculate(*rectangle) << std::endl;
  std::cout << "Keliling segi empat: " << perimeterCalculator.calculate(*rectangle) << std::endl;
  
  // deklarasi & input spesifikasi persegi
  int in_side;
  printf("Masukkan sisi persegi: ");
  scanf("%d", &in_side);
  
  // deklarasi persegi berdasarkan input spesifikasi (polimorfisme)
  Shape *square = new Square(in_side);

  // output luas dan keliling persegi
  std::cout << "Luas persegi: " << areaCalculator.calculate(*square) << std::endl;
  std::cout << "Keliling persegi: " << perimeterCalculator.calculate(*square) << std::endl;
  
  return 0;
}
