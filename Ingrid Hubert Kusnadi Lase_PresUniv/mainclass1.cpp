//OOP_Inheritance, Polymorphism, and SOLID - Ingrid Hubert Kusnadi Lase_PresUniv

#include <iostream>
#include <vector>

// Abstract class for animals
class Animal {
 protected:
    std::string name;
    int age;
 public:
    Animal(std::string name, int age) : name(name), age(age) {}
    virtual void makeNoise() = 0;
};

// Dog class inherited from Animal
class Dog : public Animal {
 public:
    Dog(std::string name, int age) : Animal(name, age) {}
    virtual void makeNoise() { std::cout << "Woof woof" << std::endl; }
    void fetch() { std::cout << name << " is fetching." << std::endl; }
};

// Cat class inherited from Animal
class Cat : public Animal {
 public:
    Cat(std::string name, int age) : Animal(name, age) {}
    virtual void makeNoise() { std::cout << "Meow" << std::endl; }
    void climb() { std::cout << name << " is climbing." << std::endl; }
};

// Lion class inherited from Animal
class Lion : public Animal {
 private:
    std::string maneColor;
 public:
    Lion(std::string name, int age, std::string maneColor) : Animal(name, age), maneColor(maneColor) {}
    virtual void makeNoise() { std::cout << "Roar" << std::endl; }
    void hunt() { std::cout << name << " is hunting." << std::endl; }
};

// Using the SOLID principles to create an AnimalManager class that is open for extension and closed for modification
class AnimalManager {
 private:
    std::vector<Animal*> animals;
 public:
    void addAnimal(Animal* animal) { animals.push_back(animal); }
    void makeNoiseAll() {
        for(auto animal : animals) {
            animal->makeNoise();
        }
    }
};

int main() {
    AnimalManager manager;
    manager.addAnimal(new Dog("Fido", 2));
    manager.addAnimal(new Cat("Whiskers", 3));
    manager.addAnimal(new Lion("Simba", 4, "golden"));
    manager.makeNoiseAll();
}
