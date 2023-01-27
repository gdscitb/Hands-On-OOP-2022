// Online C++ compiler to run C++ program online
#include <iostream>


#include <iostream>
#include <string>



class Shapev {
public: 
    virtual double getVolume() = 0;
};

class Cube : public Shapev {
private:
    double sisi;

public:
    Cube(double sisi) {
        this -> sisi = sisi;
    }

    double getVolume() {
        return sisi * sisi * sisi;
    }
};

class Cuboid : public Shapev {
private:
    double length;
    double width;
    double height;

public:
    Cuboid(double length, double width, double height ) {
        this -> length = length;
        this -> width = width;
        this -> height = height;
    }

    double getVolume() {
        return length * width * height;
    }
};

class Cylinder : public Shapev {
private:
    double radius ;
    double height;

public:
    Cylinder(double radius, double height) {
        this -> radius = radius;
        this -> height = height;
    }

    double getVolume() {
        return 3.14 * radius * radius * height;
    }
};

class Shape {
public:
    virtual double getArea() = 0;
};

class Circle : public Shape {
private:
    double radius;

public:
    Circle(double radius) {
        this -> radius = radius;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }
};

class Rectangle : public Shape {
private:
    double width;
    double height;

public:
    Rectangle(double width, double height) {
        this -> width = width;
        this -> height = height;
    }

    double getArea() {
        return width * height;
    }
};

class Triangle : public Shape {
private :
    double base;
    double height;

public :
    Triangle(double base, double height){
        this -> base = base;
        this -> height = height;
    }

    double getArea(){
        return (base*height)/2;
    }
};

class ShapeFactory {
public:
    static Shape* createShape(std::string type, int param1 = 1, int param2 = 1) {
        if (type == "circle") {
            return new Circle(param1);
        } else if (type == "rectangle") {
            return new Rectangle(param1, param2);
        } else if (type == "triangle") {
            return new Triangle(param1, param2);
        }
        return nullptr;
    }
};

class ShapeFactoryz {
public:
    static Shapev* createShape(std::string type, int param1 = 1, int param2 = 1,int param3 = 1) {
        if (type == "cube") {
            return new Cube(param1);
        } else if (type == "cuboid"){
            return new Cuboid(param1,param2,param3);
        } else if (type == "cylinder"){
            return new Cylinder(param1,param2);
        }
        return nullptr;
    }
};

int main() {
    int shapes;
    int parameter1;
    int parameter2;
    std::cout << "1. circle\n2. rectangle\n3. triangle\n4. cube\n5. cuboid\n6. cylinder" << std  ::endl;
    std::cout << "Input Shapes = ";
    std::cin >> shapes;
    if (shapes == 1)
    {
        std::cout << "Input radius = ";
        std::cin >> parameter1;
        Shape* circle = ShapeFactory::createShape("circle",parameter1);
        std::cout << "Circle area: " << circle->getArea() << std::endl;
    }else if (shapes == 2)
    {
        std::cout << "Input Length = ";
        std::cin >> parameter1;
        std::cout << "Input Width = ";
        std::cin >> parameter2;
        Shape* rectangle = ShapeFactory::createShape("rectangle",parameter1,parameter2);
        std::cout << "Rectangle area: " << rectangle->getArea() << std::endl;
    }else if (shapes == 3)
    {
        std::cout << "Input Base = ";
        std::cin >> parameter1;
        std::cout << "Input Height = ";
        std::cin >> parameter2;
        Shape* triangle = ShapeFactory::createShape("triangle",parameter1,parameter2);
        std::cout << "Triangle area: " << triangle->getArea() << std::endl;
    }else if (shapes == 4)
    {
        std::cout << "Input sisi = ";
        std::cin >> parameter1;
        Shapev* cube = ShapeFactoryz::createShape("cube",parameter1);
        std::cout << "Cube volume: " << cube->getVolume() << std::endl;
    }else if (shapes == 5)
    {
        int parameter3;
        std::cout << "Input Length = ";
        std::cin >> parameter1;
        std::cout << "Input Width = ";
        std::cin >> parameter2;
        std::cout << "Input Heigth = ";
        std::cin >> parameter3;
        Shapev* cuboid = ShapeFactoryz::createShape("cuboid",parameter1,parameter2,parameter3);
        std::cout << "Cuboid volume: " << cuboid->getVolume() << std::endl;
    }else if (shapes == 6)
    {
        std::cout << "Input Radius = ";
        std::cin >> parameter1;
        std::cout << "Input Height = ";
        std::cin >> parameter2;
        Shapev* cylinder = ShapeFactoryz::createShape("cylinder",parameter1,parameter2);
        std::cout << "Cylinder volume: " << cylinder->getVolume() << std::endl;
    }
    return 0;
}
