#include <iostream>
#include <string>
#include <random>
#include <typeinfo>
#include "inizialitation.h"
using namespace std;
Hero::Hero(string n, double dmg, double w, double def)
{
    name = n;
    damage = dmg;
    health = w;
    defense = def;
    // TODO : GENERATE BUAT PRINT INFO
}
Weapon::Weapon(string n, double d, double c)

{
    name = n;
    damage = d;
    critical = c;
    // TODO : GENERATE BUAT PRINT INFO
}

Armor::Armor(string n, double def, double aH)

{
    name = n;
    defense = def;
    addHealth = aH;
    // TODO : GENERATE BUAT PRINT INFO
}

// Prinsip Multi-inheritance

Player::Player(string hName, double hDmg, double hHlth, double hDef, string wName, double wDmg, double wCrit, string aName, double aDef, double aHlth) : Hero(hName, hDmg, hHlth, hDef), Weapon(wName, wDmg, wCrit), Armor(aName, aDef, aHlth)
{
    chosenHero = Hero(hName, hDmg, hHlth, hDef);
    chosenWeapon = Weapon(wName, wDmg, wCrit);
    chosenArmor = Armor(aName, aDef, aHlth);
}

Hero hero1("Saitama", 20, 95, 5);
Hero hero2("Chid Kagenou", 14, 90, 7);
Hero hero3("Yoriichi Tsugikuni", 18, 85, 4);
Hero hero4("Loid Forger", 12, 96, 4);

Weapon weapon1("Sword", 10, 25);
Weapon weapon2("Pistols", 6, 30);
Weapon weapon3("Arrow", 5, 33);
Weapon weapon4("Spear", 8, 23);

Armor armor1("Gold", 20, 10);
Armor armor2("Silver", 15, 20);
Armor armor3("Bronze", 10, 30);

Bot::Bot()
{
    rng.seed(rd());
}

void Bot::generateChoice()
{
    heroDist = uniform_int_distribution<mt19937::result_type>(1, 4);
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
