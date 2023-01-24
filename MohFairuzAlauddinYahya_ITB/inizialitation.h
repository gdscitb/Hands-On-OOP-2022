#ifndef INIZIALITATION
#define INIZIALITATION

#include <string>
#include <random>
using namespace std;
class Hero
{
public:
    string name;
    double damage;
    double health;
    double defense;
    Hero(string n, double dmg, double w, double def);
};

class Weapon
{
public:
    string name;
    double damage;
    double critical;
    Weapon(string n, double d, double c);
};

class Armor
{
public:
    string name;
    double defense;
    double addHealth;
    Armor(string n, double def, double aH);
};

class Player : public Hero, public Weapon, public Armor
{
public:
    Hero chosenHero;
    Weapon chosenWeapon;
    Armor chosenArmor;
    Player(Hero h, Weapon w, Armor a);
};

class Bot : public Hero, public Weapon, public Armor
{
public:
    Hero chosenHero;
    Weapon chosenWeapon;
    Armor chosenArmor;
    mt19937 rng;
    random_device rd;
    uniform_int_distribution<mt19937::result_type> heroDist;
    Bot();
    void generateChoice();
    void initialInfo();
    void resultInfo();

};

#endif
