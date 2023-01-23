#include <iostream>
#include <string>
#include <random>
#include <typeinfo>
using namespace std;
class Hero
{
public:
    string name;
    double damage;
    double health;
    double defense;

    Hero() {}
    Hero(string n, double dmg, double w, double def)
    {
        name = n;
        damage = dmg;
        health = w;
        defense = def;
        // TODO : GENERATE BUAT PRINT INFO
    }
};
class Weapon
{
public:
    string name;
    double damage;
    double critical;

    Weapon() {}
    Weapon(string n, double d, double c)
    {
        name = n;
        damage = d;
        critical = c;
        // TODO : GENERATE BUAT PRINT INFO
    }
};

class Armor
{
public:
    string name;
    double defense;
    double addHealth;

    Armor() {}
    Armor(string n, double def, double aH)
    {
        name = n;
        defense = def;
        addHealth = aH;
        // TODO : GENERATE BUAT PRINT INFO
    }
};
// Prinsip Multi-inheritance
class Player : public Hero, public Weapon, public Armor
{
public:
    Hero chosenHero;
    Weapon chosenWeapon;
    Armor chosenArmor;

    Player() {}
    Player(Hero h, Weapon w, Armor a) : Hero(h), Weapon(w), Armor(a)
    {
        chosenHero = h;
        chosenWeapon = w;
        chosenArmor = a;
        // TODO : GENERATE BUAT PRINT INFO
    }
};

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

int main()
{
    Bot bot;
    bot.generateChoice();
    bot.initialInfo();
    bot.resultInfo();

    cout << "\nPilih hero yang ingin digunakan:" << endl;
    cout << "1. " << hero1.name << "\t\t( Damage : " << hero1.damage << ", Health : " << hero1.health << ", Defense : " << hero1.defense << "% )" << endl;
    cout << "2. " << hero2.name << "\t\t( Damage : " << hero2.damage << ", Health : " << hero2.health << ", Defense : " << hero2.defense << "% )" << endl;
    cout << "3. " << hero3.name << "\t( Damage : " << hero3.damage << ", Health : " << hero3.health << ", Defense : " << hero3.defense << "% )" << endl;
    cout << "4. " << hero4.name << "\t\t( Damage : " << hero4.damage << ", Health : " << hero4.health << ", Defense : " << hero4.defense << "% )" << endl;

    int choice;
    cin >> choice;
    while (cin.fail() || choice < 1 || choice > 4)
    {
        cout << "Pilihan tidak valid. Silakan pilih kembali:" << endl;
        cin.clear();                                         // untuk membersihkan error flag
        cin.ignore(numeric_limits<streamsize>::max(), '\n'); // untuk menghapus input yang tidak valid
        cin >> choice;
    }

    Hero chosenHero;
    switch (choice)
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

    cout << "Anda telah memilih hero " << chosenHero.name << endl;

    cout << "\nPilih senjata yang ingin digunakan:" << endl;
    cout << "1. " << weapon1.name << "\t( Damage addition : " << weapon1.damage << ", Critical: " << weapon1.critical << "% )" << endl;
    cout << "2. " << weapon2.name << "\t( Damage addition : " << weapon2.damage << ", Critical: " << weapon2.critical << "% )" << endl;
    cout << "3. " << weapon3.name << "\t( Damage addition : " << weapon3.damage << ", Critical: " << weapon3.critical << "% )" << endl;
    cout << "4. " << weapon4.name << "\t( Damage addition : " << weapon4.damage << ", Critical: " << weapon4.critical << "% )" << endl;

    int weaponChoice;
    cin >> weaponChoice;
    while (cin.fail() || weaponChoice < 1 || weaponChoice > 4)
    {
        cout << "Pilihan tidak valid. Silakan pilih kembali:" << endl;
        cin.clear();                                         // untuk membersihkan error flag
        cin.ignore(numeric_limits<streamsize>::max(), '\n'); // untuk menghapus input yang tidak valid
        cin >> weaponChoice;
    }

    Weapon chosenWeapon;
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

    cout << "Anda telah memilih " << chosenHero.name << " dengan senjata " << chosenWeapon.name << endl;
    chosenHero.damage += chosenWeapon.damage;
    chosenHero.damage += (chosenWeapon.critical / 100) * chosenHero.damage;
    cout << "Damage hero Anda sekarang adalah " << chosenHero.damage << endl;

    cout << "\nPilih armor yang ingin digunakan:" << endl;
    cout << "1. " << armor1.name << "\t\t( Additional Health : " << armor1.addHealth << ", Defense : " << armor1.defense << "% )" << endl;
    cout << "2. " << armor2.name << "\t( Additional Health : " << armor2.addHealth << ", Defense : " << armor2.defense << "% )" << endl;
    cout << "3. " << armor3.name << "\t( Additional Health : " << armor3.addHealth << ", Defense : " << armor3.defense << "% )" << endl;

    int armorChoice;
    cin >> armorChoice;
    while (cin.fail() || armorChoice < 1 || armorChoice > 4)
    {
        cout << "Pilihan tidak valid. Silakan pilih kembali:" << endl;
        cin.clear();                                         // untuk membersihkan error flag
        cin.ignore(numeric_limits<streamsize>::max(), '\n'); // untuk menghapus input yang tidak valid
        cin >> armorChoice;
    }
    
    Armor chosenArmor;
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
    cout << "Anda telah memilih " << chosenHero.name << " dengan senjata " << chosenWeapon.name << ", dan armor " << chosenArmor.name << endl;
    chosenHero.health += chosenArmor.addHealth;
    chosenHero.defense += chosenArmor.defense;
    Player player(chosenHero, chosenWeapon, chosenArmor);

    cout << "\nPlayer: " << player.chosenHero.name << endl;
    cout << "Weapon: " << player.chosenWeapon.name << endl;
    cout << "Armor: " << player.chosenArmor.name << endl;
    cout << "Total Attack: " << player.chosenHero.damage << endl;
    cout << "Total Health: " << player.chosenHero.health << endl;
    cout << "Total Defense: " << player.chosenHero.defense << "% " << endl;

    return 0;
}
