#include <iostream>
#include <string>
using namespace std;

class Animal {
  public:
    string name;
    bool alive = true;
    int age = 0;
    int hunger = 0;
    int fatigue = 0;

    Animal(string inputName){
      name = inputName;
    }

    void eat() {
      if (hunger == 0){
        cout << name << " isn't hungry." << "\n";
      }

      else {
        cout << name << " is eating." << "\n";
        hunger += -3;
      }

      if (hunger < 0){
        hunger = 0;
      }
    }

    void sleep() {
      if (fatigue == 0){
        cout << name << " isn't tired." << "\n";
      }

      else {
        cout << name << " is sleeping." << "\n";
        fatigue += -3;
        hunger += 4;
      }

      if (fatigue < 0){
        fatigue = 0;
      }
    }

    void makeNoise() {
      cout << name << " is making noise." << "\n";
    }
};

class Dog : public Animal {
  public:
    void bark() {
      cout << "Bark! Bark!" << "\n";
      cout << name << " is barking." << "\n";
    }
};

class Cat : public Animal {
  public:
    void meow() {
      cout << "Meow! Meow!" << "\n";
      cout << name << " is meowing." << "\n";
    }
};

int main() {
  char choice;
  cout << "Please choose your pet: (a) Dog (b) Cat" << "\n";
  cout << "Enter: ";
  cin >> choice;
  cout << "\n";

  if (choice == 'a'){
    string dogName;
    cout << "Please enter your dog's name: ";
    cin >> dogName;
    cout << "\n";

    Animal pet = Animal(dogName);
    cout << "Congratulations! You now have your own little " << pet.name << "!";
    cout << "\n";

    int day = 1;
    while (pet.alive){
      cout << "\n";
      cout << "Day " << day <<". What do you want to do today?" << "\n";
      cout << "(a) Feed your dog (b) Sing your dog to sleep (c) Do nothing" << "\n";
      cin >> choice;
      cout << "\n";

      if (choice == 'a'){
        pet.eat();
        pet.fatigue += 2;
      }
      else if (choice == 'b'){
        pet.sleep();
      }
      else if (choice == 'c'){
        cout << "You did nothing the entire day." << "\n";
        pet.fatigue += 2;
        pet.hunger += 2;
      }

      cout << "Hunger: " << pet.hunger << "\n";
      cout << "Fatigue: " << pet.fatigue << "\n";

      if ((pet.hunger > 15) || (pet.fatigue > 15)){
        pet.alive = false;
        cout << "\n";
        cout << "Game over! " << pet.name << " has died!";
      }
      day += 1;
    }
  }

  else{
    string catName;
    cout << "Please enter your cat's name: ";
    cin >> catName;
    cout << "\n";

    Animal pet = Animal(catName);
    cout << "Congratulations! You now have your own little " << pet.name << "!";
    cout << "\n";

    int day = 1;
    while (pet.alive){
      cout << "\n";
      cout << "Day " << day <<". What do you want to do today?" << "\n";
      cout << "(a) Feed your pet (b) Sing your pet to sleep (c) Do nothing" << "\n";
      cin >> choice;
      cout << "\n";

      if (choice == 'a'){
        pet.eat();
        pet.fatigue += 2;
      }
      else if (choice == 'b'){
        pet.sleep();
      }
      else if (choice == 'c'){
        cout << "You did nothing the entire day." << "\n";
        pet.fatigue += 2;
        pet.hunger += 2;
      }

      cout << "Hunger: " << pet.hunger << "\n";
      cout << "Fatigue: " << pet.fatigue << "\n";

      if ((pet.hunger > 15) || (pet.fatigue > 15)){
        pet.alive = false;
        cout << "\n";
        cout << "Game over! " << pet.name << " has died!";
      }
      day += 1;
    }
  }
  return 0;
}
