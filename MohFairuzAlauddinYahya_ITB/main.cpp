#include <iostream>
#include <string>
#include <random>
class Hero
{
public:
    std::string name;
    int strength;
    int weakness;

    Hero() {}
    Hero(std::string n, int s, int w)
    {
        name = n;
        strength = s;
        weakness = w;
        // TODO : GENERATE BUAT PRINT INFO
    }
};
class Weapon
{
public:
    std::string name;
    int damage;

    Weapon() {}
    Weapon(std::string n, int d)
    {
        name = n;
        damage = d;
        // TODO : GENERATE BUAT PRINT INFO
    }
};

class Armor
{
public:
    std::string name;
    int reduction;

    Armor() {}
    Armor(std::string n, int r)
    {
        name = n;
        reduction = r;
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

Hero hero1("Saitama", 9, 95);
Hero hero2("Chid Kagenou", 8, 90);
Hero hero3("Yoriichi Tsugikuni", 10, 85);
Hero hero4("Loid Forger", 6, 99);

Weapon weapon1("Sword", 3);
Weapon weapon2("Pistols", 2);
Weapon weapon3("Arrow", 4);
Weapon weapon4("Spear", 5);

Armor armor1("Gold", 3);
Armor armor2("Silver", 2);
Armor armor3("Bronze", 1);

class Bot : public Hero, public Weapon, public Armor
{
public:
    Hero chosenHero;
    Weapon chosenWeapon;
    Armor chosenArmor;
    std::mt19937 rng;

    Bot()
    {
        rng.seed(std::random_device()());
    }

    void generateChoice()
    {
        std::uniform_int_distribution<std::mt19937::result_type> heroDist(1, 4);
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

        std::uniform_int_distribution<std::mt19937::result_type> weaponDist(1, 4);
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

        std::uniform_int_distribution<std::mt19937::result_type> armorDist(1, 3);
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
        chosenHero.strength += chosenWeapon.damage;
        chosenHero.weakness += chosenArmor.reduction;
    }
};

int main()
{

    // GENERATE BOT
    Bot bot;
    bot.generateChoice();
    std::cout << "Bot memilih hero " << bot.chosenHero.name << std::endl;
    std::cout << "Bot memilih senjata " << bot.chosenWeapon.name << std::endl;
    std::cout << "Bot memilih armor " << bot.chosenArmor.name << std::endl;
    std::cout << "Power: " << bot.chosenHero.strength << std::endl;
    std::cout << "Health: " << bot.chosenHero.weakness << std::endl;

    std::cout << "Pilih hero yang ingin digunakan:" << std::endl;
    std::cout << "1. " << hero1.name << "\t\t( Attack : " << hero1.strength << ", Health : " << hero1.weakness << " )" << std::endl;
    std::cout << "2. " << hero2.name << "\t\t( Attack : " << hero2.strength << ", Health : " << hero2.weakness << " )" << std::endl;
    std::cout << "3. " << hero3.name << "\t( Attack : " << hero3.strength << ", Health : " << hero3.weakness << " )" << std::endl;
    std::cout << "4. " << hero4.name << "\t\t( Attack : " << hero4.strength << ", Health : " << hero4.weakness << " )" << std::endl;

    int choice;
    std::cin >> choice;

    while (choice < 1 || choice > 4)
    {
        std::cout << "Pilihan tidak valid. Silakan pilih kembali:" << std::endl;
        std::cin >> choice;
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

    std::cout << "Anda telah memilih hero " << chosenHero.name << std::endl;

    std::cout << "Pilih senjata yang ingin digunakan:" << std::endl;
    std::cout << "1. " << weapon1.name << "\t( Damage addition : " << weapon1.damage << " % )" << std::endl;
    std::cout << "2. " << weapon2.name << "\t( Damage addition : " << weapon2.damage << " % )" << std::endl;
    std::cout << "3. " << weapon3.name << "\t( Damage addition : " << weapon3.damage << " % )" << std::endl;
    std::cout << "4. " << weapon4.name << "\t( Damage addition : " << weapon4.damage << " % )" << std::endl;

    int weaponChoice;
    std::cin >> weaponChoice;

    while (weaponChoice < 1 || weaponChoice > 4)
    {
        std::cout << "Pilihan tidak valid. Silakan pilih kembali:" << std::endl;
        std::cin >> weaponChoice;
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

    std::cout << "Anda telah memilih " << chosenHero.name << " dengan senjata " << chosenWeapon.name << std::endl;
    chosenHero.strength += chosenWeapon.damage;
    std::cout << "Kekuatan hero Anda sekarang adalah " << chosenHero.strength << std::endl;

    std::cout << "Pilih armor yang ingin digunakan:" << std::endl;
    std::cout << "1. " << armor1.name << "\t\t(Reduction Damage : " << armor1.reduction << " )" << std::endl;
    std::cout << "2. " << armor2.name << "\t(Reduction Damage : " << armor2.reduction << " )" << std::endl;
    std::cout << "3. " << armor3.name << "\t(Reduction Damage : " << armor3.reduction << " )" << std::endl;

    int armorChoice;
    std::cin >> armorChoice;

    while (armorChoice < 1 || armorChoice > 3)
    {
        std::cout << "Pilihan tidak valid. Silakan pilih kembali:" << std::endl;
        std::cin >> armorChoice;
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

    std::cout << "Anda telah memilih armor " << chosenArmor.name << std::endl;
    chosenHero.weakness += chosenArmor.reduction;
    std::cout << "Kekuatan hero Anda sekarang adalah " << chosenHero.strength << std::endl
              << "\n";
    Player player(chosenHero, chosenWeapon, chosenArmor);

    std::cout << "Player: " << player.chosenHero.name << std::endl;
    std::cout << "Weapon: " << player.chosenWeapon.name << std::endl;
    std::cout << "Armor: " << player.chosenArmor.name << std::endl;
    std::cout << "Power: " << player.chosenHero.strength << std::endl;
    std::cout << "Health: " << player.chosenHero.weakness << std::endl;

    return 0;
}
