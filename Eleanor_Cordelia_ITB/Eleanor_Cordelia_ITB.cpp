#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Menu {
  // Data ini di wariskan ke class Food dan class Beverage
protected:
  string name;
  float price;
  float discount;

public:
  // Constructor
  Menu(string n, float p, float d) {
    name = n;
    price = p;
    discount = d / 100;
  }

  // Encapsulation: Data-data sensitif yang dibuat private dan protected
  // getter (e.g get_total_price, get_info) untuk akses data
  void get_info() {
    cout << "Nama item\t: " << name << "\n"
         << "Harga item\t: " << price << "k" << endl;
  }
};

// Inheritance
class Food : public Menu {

private:
  string flavour;

public:
  //Constructor
  Food(string f, string n, float p, float d) : Menu(n, p, d) { flavour = f; }

  float get_price(int count) { return price * (1 - discount) * count; }
  void get_info() {
    cout << name << " " << flavour << " "
         << " " << price * (1 - discount) << endl;
  }
};

class Beverage : public Menu {
private:
  string size; // Either s, m, l, xl
  string flavour;

public:
  // Constructor
  Beverage(string s, string f, string n, float p, float d) : Menu(n, p, d) {
    size = s;
    flavour = f;
  }

  float get_price(int count) { return price * (1 - discount) * count; }
  // Function Overriding
  void get_info() {
    cout << name << " " << flavour << " " << size << " "
         << price * (1 - discount) << endl;
  }
};

class App {
private:
  vector<Food> food;
  vector<Beverage> beverage;
  vector<pair<int, int>> order;
  int total_price;

public:
  App() {
    create_list();
    cout << "Welcome to the App" << endl;
    get_list();

    get_order();

    total_price = show_total_order();

    payment(total_price);
  }

  void payment(int total_price) {
    cout << "Total belanja adalah " << total_price << " ribu " << endl;
    cout << "Masukkan nominal duit : " << endl;
    int duit_masuk;
    cin >> duit_masuk;

    if (total_price - duit_masuk <= 0) {
      cout << "Kembalian anda " << duit_masuk - total_price << " ribu " << endl;
    } else {
      cout << "Duit Kurang" << endl;
    }
  }

  int show_total_order() {
    cout << "Price"
         << "     "
         << "Quantity" << endl;
    int temp = 0;
    for (auto x : order) { // per baris
      cout << x.first << "        " << x.second << endl;
      temp += x.first;
    }
    return temp;
  }

  void get_order() {
    cout << "What do you like to order? type -1 to end" << endl;
    cout << "No."
         << "     "
         << "Quantity" << endl;
    int a = 0;
    int b = 0;
    cin >> a;
    while (a != -1) {
      cin >> b; // Nomor & qty
      a--;
      if (a < food.size() && a >= 0) {
        // Order food
        order.push_back(make_pair(food[a].get_price(b), b));
      } else if (a >= food.size() && a <= (food.size() + beverage.size())) {
        // Order beverage
        a -= food.size();
        order.push_back(make_pair(beverage[a].get_price(b), b));
      }
      cin >> a;
    }
  }

  void create_list() {
    // Str flavour, str nama, float price, float discount;
    Food food1("Savory", "Spaghetti Aglio Olio", 40.000, 5);
    Food food2("Sweet", "Creme Brulee", 20.000, 0);
    Food food3("Savory", "Cheese Burger", 35.000, 0);
    Food food4("Savory", "Chicken Burger", 38.000, 0);

    food.push_back(food1);
    food.push_back(food2);
    food.push_back(food3);
    food.push_back(food4);

    // Str size, str flavour, str nama, float price, float discount;
    Beverage bev1("L", "Sweet", "Ice Tea", 10.000, 0);
    Beverage bev2("S", "Sweet", "Caramel Macchiato", 25.000, 0);
    Beverage bev3("M", "Neutral", "Mineral Water", 8.000, 0);
    

    beverage.push_back(bev1);
    beverage.push_back(bev2);
    beverage.push_back(bev3);
  }
  
  void get_list() {
    int i = 1;
    for (auto x : food) {
      cout << "| " << i << ". ";
      i++;
      x.get_info();
    }

    for (auto x : beverage) {
      cout << "| " << i << ". ";
      i++;
      x.get_info();
    }
  }
};

int main() {
  App app;

  return 0;
}