// Nama :   Owen Tobias Sinurat
// NIM  :   19622270

/* Deskripsi

Program ini mengandung semua spesifikasi wajib yaitu:
1.  Inheritance
2.  Interface/Abstract Class
3.  Polimorfisme
4.  Design pattern yaitu Singleton
5.  salah satu SOLID principle yaitu Open/Close

dan beberapa spesifikasi bonus yaitu:
1.  Multilevel inheritance
2.  Interactive program
*/
#include <iostream>
#include <string>
#include <array>
using namespace std;

// kelas ini merupakan abstract class yang memiliki pure virtual function
class Database
{
public:
    virtual void getName() = 0;
};

class Staff : public Database
{
private: // data penting dibawah di set menjadi private agar memenuhi Open/Close pada prinsip SOLID
    string name;
    int age;

public:
    Staff(string a, int b)
    {
        name = a;
        age = b;
    }
    // dibawah ini adalah implementasi pure virtual function (abstract class) sekaligus polimorfisme dan inheritance
    // kelas ini juga menerapkan multiple inheritance
    void getName()
    {
        cout << "Getting the staff's name..." << endl;
    }
    void displayStaff()
    {
        cout << "Name\t: " << name << endl;
        cout << "Age\t: " << age << endl
             << endl;
    }
};

class Player : public Database
{
private: // data penting dibawah di set menjadi private agar memenuhi Open/Close pada prinsip SOLID
    string name;
    int age;
    string nationality;
    int pace;
    int shooting;
    int defense;
    int passing;
    int physical;
    int dribbling;

public:
    Player(string a, int b, string c, int d, int e, int f, int g, int h, int i)
    {
        name = a;
        age = b;
        nationality = c;
        pace = d;
        shooting = e;
        defense = f;
        passing = g;
        physical = h;
        dribbling = i;
    }
    // dibawah ini adalah implementasi pure virtual function (abstract class) sekaligus polimorfisme dan inheritance
    // kelas ini juga menerapkan multiple inheritance
    void getName()
    {
        cout << "Getting the player's name..." << endl;
    }
    void showStats()
    {
        cout << name << "'s Statistics" << endl;
        cout << "Age\t\t: " << age << endl;
        cout << "Nationality\t: " << nationality << endl;
        cout << "Pace\t\t: " << pace << endl;
        cout << "Shooting\t: " << shooting << endl;
        cout << "Defense\t\t: " << defense << endl;
        cout << "Passing\t\t: " << passing << endl;
        cout << "Physical\t: " << physical << endl;
        cout << "Dribbling\t: " << dribbling << endl
             << endl;
    }
    string getPlayer()
    {
        return name;
    }
};

class Playing : public Player
{
public:
    string name;
    // constructor dibawah adalah penerapan multilevel inheritance
    Playing(Player a) : Player(a)
    {
        name = a.getPlayer();
    }
    void shooting()
    {
        cout << name << " is shooting the ball!" << endl;
    }
    void passing()
    {
        cout << name << " is passing the ball!" << endl;
    }
    void crossing()
    {
        cout << name << " is crossing!" << endl;
    }
};

int main()
{
    Staff staff1("Justin", 35);
    Staff staff2("Larry", 29);
    Staff staff3("Alex", 56);
    Staff staffArray[3] = {staff1, staff2, staff3};
    Player player1("Cristiano", 37, "Portugal", 99, 99, 99, 99, 99, 99);
    Player player2("Rashford", 25, "England", 80, 67, 98, 78, 66, 86);
    Player player3("Casemiro", 32, "Brazil", 67, 56, 97, 89, 78, 78);
    Player playerArray[3] = {player1, player2, player3};
    Playing play1(player1);
    Playing play2(player3);
    Playing play3(player2);

    int choice;
    cout << "FIFA Lite" << endl;
    cout << "1. Display staff" << endl;
    cout << "2. Display player" << endl;
    cout << "3. Demo play" << endl;
    cout << "What do you want to do?" << endl;
    cin >> choice;

    switch (choice)
    {
    case 1:
        for (int i = 0; i < 3; i++)
        {
            cout << i + 1 << "." << endl;
            staffArray[i].displayStaff();
        }
        break;
    case 2:
        for (int i = 0; i < 3; i++)
        {
            cout << i + 1 << "." << endl;
            playerArray[i].showStats();
        }
        break;
    case 3:
        cout << "Demo play" << endl;
        play1.passing();
        play2.shooting();
        play3.crossing();
        break;
    default:
        cout << "Choose between 1/2/3!" << endl;
    }
}