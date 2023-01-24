#include <iostream>
#include <string>
#include <random>
#include <typeinfo>
using namespace std;
class Skill
{
public:
    string name;
    int damage;

    Skill(string n, int d)
    {
        name = n;
        damage = d;
    }
};

class Hero
{
public:
    string name;
    double damage;
    double health;
    double defense;
    vector<Skill> skillList;

    Hero() {}
    Hero(string n, double dmg, double w, double def)
    {
        name = n;
        damage = dmg;
        health = w;
        defense = def;
        // TODO : GENERATE BUAT PRINT INFO
    }
    void addJurus(string name, int damage)
    {
        skillList.push_back(Skill(name, damage));
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

// ! INSTANCE CLASS
Hero hero1("Saitama", 20, 95, 5);
Hero hero2("Chid Kagenou", 14, 20, 7);
Hero hero3("Yoriichi Tsugikuni", 18, 85, 4);
Hero hero4("Loid Forger", 12, 96, 4);

Weapon sword("Sword", 10, 25);
Weapon pistols("Pistols", 6, 30);
Weapon arrow("Arrow", 5, 33);
Weapon spear("Spear", 8, 23);

Armor gold("Gold", 20, 10);
Armor silver("Silver", 15, 20);
Armor bronze("Bronze", 10, 30);

// ! GENERATING BOT HERO
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
            chosenWeapon = sword;
            chosenHero.addJurus("Star Strike", 15);
            chosenHero.addJurus("Super Air Strike", 20);
            chosenHero.addJurus("Sword Stab", 25);
            chosenHero.addJurus("X strike", 30);
            break;
        case 2:
            chosenWeapon = pistols;
            chosenHero.addJurus("Crazy Shot", 15);
            chosenHero.addJurus("Destroy Shot", 20);
            chosenHero.addJurus("Crazy Gun", 25);
            chosenHero.addJurus("Focus Shot", 30);
            break;
        case 3:
            chosenWeapon = arrow;
            chosenHero.addJurus("Falling Star", 15);
            chosenHero.addJurus("Shied Destroy", 20);
            chosenHero.addJurus("Concentration", 25);
            chosenHero.addJurus("Triangle of Light", 30);
            break;
        case 4:
            chosenWeapon = spear;
            chosenHero.addJurus("Deadly Thrust", 15);
            chosenHero.addJurus("Rotate Spear", 20);
            chosenHero.addJurus("Breaking Limit", 25);
            chosenHero.addJurus("Twin Brother", 30);
            break;
        }

        uniform_int_distribution<mt19937::result_type> armorDist(1, 3);
        int armorChoice = armorDist(rng);

        switch (armorChoice)
        {
        case 1:
            chosenArmor = gold;
            break;
        case 2:
            chosenArmor = silver;
            break;
        case 3:
            chosenArmor = bronze;
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

class GamePlay
{
public:
    string userChoice;
    string botChoice;
    Hero &userHero;
    Hero &botHero;
    mt19937 rng;

    GamePlay(Hero &uHero, Hero &bHero) : userHero(uHero), botHero(bHero)
    {
        rng.seed(random_device()());
    }

    string generateBotChoice()
    {
        uniform_int_distribution<mt19937::result_type> dist(1, 3);
        int choice = dist(rng);
        switch (choice)
        {
        case 1:
            return "rock";
        case 2:
            return "paper";
        case 3:
            return "scissors";
        }
    }

    string getWinner()
    {
        botChoice = generateBotChoice();
        
        if (userChoice == "rock")
        {
            if (botChoice == "paper")
                return "bot";
            else if (botChoice == "scissors")
                return "user";
            else
                return "draw";
        }
        else if (userChoice == "paper")
        {
            if (botChoice == "scissors")
                return "bot";
            else if (botChoice == "rock")
                return "user";
            else
                return "draw";
        }
        else if (userChoice == "scissors")
        {
            if (botChoice == "rock")
                return "bot";
            else if (botChoice == "paper")
                return "user";
            else
                return "draw";
        }
        else
        {
            return "Invalid input";
        }
    }
};

int main()
{
    // ! SHOW BOT'S HERO
    Bot bot;
    bot.generateChoice();
    bot.initialInfo();
    bot.resultInfo();

    // ! PLAYER CHOOSE HERO
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

    // ! PLAYER CHOOSE WEAPON
    cout << "\nPilih senjata yang ingin digunakan:" << endl;
    cout << "1. " << sword.name << "\t( Damage addition : " << sword.damage << ", Critical: " << sword.critical << "% )" << endl;
    cout << "2. " << pistols.name << "\t( Damage addition : " << pistols.damage << ", Critical: " << pistols.critical << "% )" << endl;
    cout << "3. " << arrow.name << "\t( Damage addition : " << arrow.damage << ", Critical: " << arrow.critical << "% )" << endl;
    cout << "4. " << spear.name << "\t( Damage addition : " << spear.damage << ", Critical: " << spear.critical << "% )" << endl;

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
        chosenWeapon = sword;
        chosenHero.addJurus("Star Strike", 15);
        chosenHero.addJurus("Super Air Strike", 20);
        chosenHero.addJurus("Sword Stab", 25);
        chosenHero.addJurus("X strike", 30);
        break;
    case 2:
        chosenWeapon = pistols;
        chosenHero.addJurus("Crazy Shot", 15);
        chosenHero.addJurus("Destroy Shot", 20);
        chosenHero.addJurus("Crazy Gun", 25);
        chosenHero.addJurus("Focus Shot", 30);
        break;
    case 3:
        chosenWeapon = arrow;
        chosenHero.addJurus("Falling Star", 15);
        chosenHero.addJurus("Shied Destroy", 20);
        chosenHero.addJurus("Concentration", 25);
        chosenHero.addJurus("Triangle of Light", 30);
        break;
    case 4:
        chosenWeapon = spear;
        chosenHero.addJurus("Deadly Thrust", 15);
        chosenHero.addJurus("Rotate Spear", 20);
        chosenHero.addJurus("Breaking Limit", 25);
        chosenHero.addJurus("Twin Brother", 30);
        break;
    }

    cout << "Anda telah memilih " << chosenHero.name << " dengan senjata " << chosenWeapon.name << endl;
    chosenHero.damage += chosenWeapon.damage;
    chosenHero.damage += (chosenWeapon.critical / 100) * chosenHero.damage;
    cout << "Damage hero Anda sekarang adalah " << chosenHero.damage << endl;

    // ! PLAYER CHOOSE ARMOR
    cout << "\nPilih armor yang ingin digunakan:" << endl;
    cout << "1. " << gold.name << "\t\t( Additional Health : " << gold.addHealth << ", Defense : " << gold.defense << "% )" << endl;
    cout << "2. " << silver.name << "\t( Additional Health : " << silver.addHealth << ", Defense : " << silver.defense << "% )" << endl;
    cout << "3. " << bronze.name << "\t( Additional Health : " << bronze.addHealth << ", Defense : " << bronze.defense << "% )" << endl;

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
        chosenArmor = gold;
        break;
    case 2:
        chosenArmor = silver;
        break;
    case 3:
        chosenArmor = bronze;
        break;
    }
    cout << "Anda telah memilih " << chosenHero.name << " dengan senjata " << chosenWeapon.name << ", dan armor " << chosenArmor.name << endl;
    chosenHero.health += chosenArmor.addHealth;
    chosenHero.defense += chosenArmor.defense;
    Player player(chosenHero, chosenWeapon, chosenArmor);

    // ! POP UP RESULT PLAYER'S HERO INFO
    cout << "\nPlayer: " << player.chosenHero.name << endl;
    cout << "Weapon: " << player.chosenWeapon.name << endl;
    cout << "Armor: " << player.chosenArmor.name << endl;
    cout << "Total Attack: " << player.chosenHero.damage << endl;
    cout << "Total Health: " << player.chosenHero.health << endl;
    cout << "Total Defense: " << player.chosenHero.defense << "% " << endl;

    // ! USING ROCK PAPER SCISSORS TO DETERMINE WHO'S PLAYS

     GamePlay bkg(player.chosenHero, bot.chosenHero);

    while (player.chosenHero.health > 0 && bot.chosenHero.health > 0)
    {
          cout << "\nPilih Giliran:" << endl;
    cout << "1. Rock " << endl;  
    cout << "2. Paper" << endl; 
    cout << "3. Scissors" << endl;
    int turnPlayer;
    cin >> turnPlayer;
    while (cin.fail() || turnPlayer < 1 || turnPlayer > 3)
    {
        cout << "Pilihan tidak valid. Silakan pilih kembali:" << endl;
        cin.clear();                                         // untuk membersihkan error flag
        cin.ignore(numeric_limits<streamsize>::max(), '\n'); // untuk menghapus input yang tidak valid
        cin >> turnPlayer;
    }

    switch (turnPlayer)
    {
    case 1:
        bkg.userChoice = "rock";
        break;
    case 2:
        bkg.userChoice = "paper";
        break;
    case 3:
        bkg.userChoice = "scissors";
        break;
    }

        string winner = bkg.getWinner();

        if (winner == "user")
        {
            bot.chosenHero.health -= player.chosenHero.damage*(bot.chosenHero.defense/100);
            cout << "Anda menang! Health Anda: " << player.chosenHero.health << endl;
            cout << "Anda menang! Health Musuh: " << bot.chosenHero.health << endl;
        }
        else if (winner == "bot")
        {
            player.chosenHero.health -= bot.chosenHero.damage*(player.chosenHero.defense/100);
            cout << "Anda kalah! Health Anda: " << player.chosenHero.health << endl;
            cout << "Anda kalah! Health Musuh: " << bot.chosenHero.health << endl;
        }
        else if (winner == "draw")
        {
            cout << "Hasil seri!" << endl;
        }
        else
        {
            cout << "Input tidak valid." << endl;
        }
    }

    if (hero1.health <= 0)
    {
        cout << "Hero Anda kalah! Game over." << endl;
    }
    else if (hero2.health <= 0)
    {
        cout << "Hero Anda menang! Selamat!" << endl;
    }
    return 0;
}
