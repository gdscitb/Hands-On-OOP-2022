#include <iostream>
using namespace std;

class celestial {
protected:
    int mass;
    int diameter;
public:
    celestial(int a = 0, int b = 0) {
        mass = a;
        diameter = b;
    };

    virtual void kill() = 0;
};

class planet : public celestial {
public:
    planet(int a = 0, int b = 0) : celestial(a, b) { }
    void kill() {
        cout << "The planet sucked into a black hole.\n";
    }
};

class star : public celestial {
public:
    star(int a = 0, int b = 0) : celestial(a, b) { }
    void kill() {
        if (mass > 100) {
            cout << "The star undergoes supernova.\n";
        }
        else {
            cout << "The star ran out of fuel and dies out.\n";
        }
    }
};

class blackhole : public celestial {
public:
    blackhole(int a = 0, int b = 0) : celestial(a, b) { }
    void kill() {
        cout << "The black hole experienced Hawking radiation and dies out.\n";
    }
};

int main() {
    // Buat objek
    planet p(3, 5);
    star s(200, 100);
    blackhole b(9000, 50);

    // Jalankan fungsi kill()
    p.kill();
    s.kill();
    b.kill();
    return 0;
}