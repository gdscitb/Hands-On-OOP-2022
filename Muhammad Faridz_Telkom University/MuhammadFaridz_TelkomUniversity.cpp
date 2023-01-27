#include <iostream>
#include <vector>
using namespace std;

// Interface Product
class Product
{
public:
    virtual string getName() = 0;
    virtual float getPrice() = 0;
};

// Abstract class Laptop
class Laptop : public Product
{
protected:
    string name;
    float price;

public:
    Laptop(string name, float price) : name(name), price(price) {}
    string getName() { return name; }
    float getPrice() { return price; }
};

// Inheritance
class GamingLaptop : public Laptop
{
private:
    string graphicsCard;

public:
    GamingLaptop(string name, float price, string graphicsCard) : Laptop(name, price), graphicsCard(graphicsCard) {}
    string getGraphicsCard() { return graphicsCard; }
};

class BusinessLaptop : public Laptop
{
private:
    string processor;

public:
    BusinessLaptop(string name, float price, string processor) : Laptop(name, price), processor(processor) {}
    string getProcessor() { return processor; }
};

// Polimorfisme
void printLaptopInfo(Laptop *laptop)
{
    cout << "Name: " << laptop->getName() << endl;
    cout << "Price: " << laptop->getPrice() << endl;
}

int main()
{
    vector<Laptop *> laptops;

    // Implementasi Design Pattern : Prototype
    GamingLaptop *gamingLaptop = new GamingLaptop("Asus ROG", 3500, "Nvidia RTX 3060");
    BusinessLaptop *businessLaptop = new BusinessLaptop("Lenovo Yoga", 2200, "Intel i7");

    laptops.push_back(gamingLaptop);
    laptops.push_back(businessLaptop);

    // Implementasi Prinsip SOLID : Open-Closed Principle
    // Class Laptop dapat dikembangkan untuk tipe-tipe baru tanpa perlu mengubah class yang sudah ada
    for (auto laptop : laptops)
    {
        printLaptopInfo(laptop);
        if (GamingLaptop *gl = dynamic_cast<GamingLaptop *>(laptop))
        {
            cout << "Graphics Card: " << gl->getGraphicsCard() << endl;
        }
        else if (BusinessLaptop *bl = dynamic_cast<BusinessLaptop *>(laptop))
        {
            cout << "Processor: " << bl->getProcessor() << endl;
        }
        cout << endl;
    }
    return 0;
}
