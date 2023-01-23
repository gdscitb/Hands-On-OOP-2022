#include <iostream>
#include <string>
#include <random>
#include <typeinfo>
#ifndef INIZIALITATION
#define INIZIALITATION
using namespace std;
class Hero
{
public:
    string name;
    double damage;
    double health;
    double defense;

    Hero();
    ~Hero();
};
class Weapon
{
public:
    string name;
    double damage;
    double critical;

    Weapon();
    ~Weapon();
    
};

class Armor
{
public:
    string name;
    double defense;
    double addHealth;

    Armor();
    ~Armor();
    };
// Prinsip Multi-inheritance
class Player : public Hero, public Weapon, public Armor
{
public:
    Hero chosenHero;
    Weapon chosenWeapon;
    Armor chosenArmor;

    Player();
    ~Player();
    
};


class Bot : public Hero, public Weapon, public Armor
{
public:
    Hero chosenHero;
    Weapon chosenWeapon;
    Armor chosenArmor;
    mt19937 rng;

    Bot()
    {
        rng.seed(random_device()());
    }
    ~Bot()
    {
        rng.seed(random_device()());
    }

    void generateChoice()
    {
        uniform_int_distribution<mt19937::result_type> heroDist(1, 4);
        int heroChoice = heroDist(rng);

        switch (heroChoice)
        {
        case 1:
            chosenHero = hero1;
            break;
        case 2:
            chosenHero = hero2;
            break;
        case 3:
            chosenHero = hero3;
            break;
        case 4:
            chosenHero = hero4;
            break;
        }

        uniform_int_distribution<mt19937::result_type> weaponDist(1, 4);
        int weaponChoice = weaponDist(rng);

        switch (weaponChoice)
        {
        case 1:
            chosenWeapon = weapon1;
            break;
        case 2:
            chosenWeapon = weapon2;
            break;
        case 3:
            chosenWeapon = weapon3;
            break;
        case 4:
            chosenWeapon = weapon4;
            break;
        }

        uniform_int_distribution<mt19937::result_type> armorDist(1, 3);
        int armorChoice = armorDist(rng);

        switch (armorChoice)
        {
        case 1:
            chosenArmor = armor1;
            break;
        case 2:
            chosenArmor = armor2;
            break;
        case 3:
            chosenArmor = armor3;
            break;
        }
    }
    void initialInfo()
    {
        cout << "Bot :\nHero \t: " << chosenHero.name << " ( Damage:" << chosenHero.damage << ", Health:" << chosenHero.health << ", Defense:" << chosenHero.defense << "% )" << endl;
        cout << "Weapon : " << chosenWeapon.name << " ( Additional Damage: " << chosenWeapon.damage << ", Critical: " << chosenWeapon.critical << "% )" << endl;
        cout << "Armor : " << chosenArmor.name << "( Addition Health: " << chosenArmor.addHealth << ", Defense: " << chosenArmor.defense << "% )" << endl;
    }

    void resultInfo()
    {
        chosenHero.damage += chosenWeapon.damage;
        chosenHero.damage += (chosenWeapon.critical / 100) * chosenHero.damage;
        chosenHero.health += chosenArmor.addHealth;
        chosenHero.defense += chosenArmor.defense;
        ;
        cout << "Total Attack: " << chosenHero.damage << endl;
        cout << "Total Health: " << chosenHero.health << endl;
        cout << "Total Defense: " << chosenHero.defense << "%" << endl;
    }
};
#endif
