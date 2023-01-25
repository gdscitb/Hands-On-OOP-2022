#include <iostream>
#include <string>
#include <random>
#include <typeinfo>
#include <windows.h> // for windows
using namespace std;

// ! INTERFACE SKILL
class Skill
{
public:
    string name;
    double damage;
    double manaCost;

    Skill(string n, double d, double mC)
    {
        name = n;
        damage = d;
        manaCost = mC;
    }
};

class Hero
{
public:
    string name;
    double damage;
    double health;
    double defense;
    double mana;
    vector<Skill> skillList;

    Hero() {}
    Hero(string n, double dmg, double w, double def, double m)
    {
        name = n;
        damage = dmg;
        health = w;
        defense = def;
        mana = m;
        // TODO : GENERATE BUAT PRINT INFO
    }
    void addJurus(string name, double damage, double manaCost)
    {
        skillList.push_back(Skill(name, damage, manaCost));
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
    double addMana;

    Armor() {}
    Armor(string n, double def, double aH, double aM)
    {
        name = n;
        defense = def;
        addHealth = aH;
        addMana = aM;
        // TODO : GENERATE BUAT PRINT INFO
    }
};

// * Prinsip Multi-inheritance terletak pada class Skill yang merupakan child dari parent hero yang di instance saat case class Weapon dengan grandparent Hero
// * Prinsip Inheritance biasa terlerak pada class Armor
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
    void playerInfo()
    {
        cout << "Player Info" << endl;
        cout << "\nHero: " << chosenHero.name << endl;
        cout << "Weapon: " << chosenWeapon.name << endl;
        cout << "Armor: " << chosenArmor.name << endl;
        cout << "Total Attack: " << chosenHero.damage << endl;
        cout << "Total Health: " << chosenHero.health << endl;
        cout << "Total Defense: " << chosenHero.defense << "% " << endl;
        cout << "Total Mana: " << chosenHero.mana << endl;
    }
};

// ! INSTANCE CLASS
Hero hero1("Saitama", 20, 95, 10, 50);
Hero hero2("Chid Kagenou", 14, 80, 15, 45);
Hero hero3("Yoriichi Tsugikuni", 18, 85, 20, 35);
Hero hero4("Loid Forger", 12, 96, 18, 40);

Weapon sword("Sword", 10, 25);
Weapon pistols("Pistols", 6, 30);
Weapon arrow("Arrow", 5, 33);
Weapon spear("Spear", 8, 23);

Armor gold("Gold", 20, 10, 25);
Armor silver("Silver", 15, 20, 30);
Armor bronze("Bronze", 10, 30, 35);

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
        vector<Hero> heroes = {hero1, hero2, hero3, hero4};
        uniform_int_distribution<int> heroDist(0, heroes.size() - 1);
        int heroChoice = heroDist(rng);
        chosenHero = heroes[heroChoice]; // Pemilihan hero sesuai dengan indeks yang dipilih

        uniform_int_distribution<mt19937::result_type> weaponDist(1, 4);
        int weaponChoice = weaponDist(rng);

        switch (weaponChoice)
        {
        case 1:
            chosenWeapon = sword;
            chosenHero.addJurus("Star Strike", 15, 10);
            chosenHero.addJurus("Super Air Strike", 20, 18);
            chosenHero.addJurus("Sword Stab", 25, 23);
            chosenHero.addJurus("X strike", 30, 30);
            break;
        case 2:
            chosenWeapon = pistols;
            chosenHero.addJurus("Crazy Shot", 15, 10);
            chosenHero.addJurus("Destroy Shot", 20, 18);
            chosenHero.addJurus("Crazy Gun", 25, 23);
            chosenHero.addJurus("Focus Shot", 30, 30);
            break;
        case 3:
            chosenWeapon = arrow;
            chosenHero.addJurus("Falling Star", 15, 10);
            chosenHero.addJurus("Shied Destroy", 20, 18);
            chosenHero.addJurus("Concentration", 25, 23);
            chosenHero.addJurus("Triangle of Light", 30, 30);
            break;
        case 4:
            chosenWeapon = spear;
            chosenHero.addJurus("Deadly Thrust", 15, 10);
            chosenHero.addJurus("Rotate Spear", 20, 18);
            chosenHero.addJurus("Breaking Limit", 25, 23);
            chosenHero.addJurus("Twin Brother", 30, 30);
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
        cout << "Bot :\nHero \t: " << chosenHero.name << " ( Damage:" << chosenHero.damage << ", Health:" << chosenHero.health << ", Defense:" << chosenHero.defense << "%, "
             << "Mana: " << chosenHero.mana << " )" << endl;
        cout << "Weapon : " << chosenWeapon.name << " ( Additional Damage: " << chosenWeapon.damage << ", Critical: " << chosenWeapon.critical << "% )" << endl;
        cout << "Armor : " << chosenArmor.name << "( Addition Health: " << chosenArmor.addHealth << ", Defense: " << chosenArmor.defense << "%, "
             << "Mana: " << chosenArmor.addMana << " )" << endl;
    }

    void resultInfo()
    {
        chosenHero.damage += chosenWeapon.damage;
        chosenHero.damage += (chosenWeapon.critical / 100) * chosenHero.damage;
        chosenHero.health += chosenArmor.addHealth;
        chosenHero.defense += chosenArmor.defense;
        chosenHero.mana += chosenArmor.addMana;
        ;
        cout << "Total Damage: " << chosenHero.damage << endl;
        cout << "Total Health: " << chosenHero.health << endl;
        cout << "Total Defense: " << chosenHero.defense << "%" << endl;
        cout << "Total Mana: " << chosenHero.mana << endl;
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

void loading(string text)
{
    system("cls");
    printf("\e[?25l");

    // Set ASCII to print special character.
    // Code page 437
    SetConsoleCP(437);
    SetConsoleOutputCP(437);
    int bar1 = 177, bar2 = 219;

    cout << "\n\n\n\t\t\t\t" + text + "...";
    cout << "\n\n\n\t\t\t\t";

    for (int i = 0; i < 25; i++)
        cout << (char)bar1;

    cout << "\r";
    cout << "\t\t\t\t";
    for (int i = 0; i < 25; i++)
    {
        cout << (char)bar2;
        Sleep(150);
    }

    cout << "\n\t\t\t\t" << (char)1 << "!";
    system("Pause");
}

int main()
{
    cout << "========BATTLE MASTER==========\n\n"
         << endl;
    cout << "Are you ready to play the game (Y/N)?" << endl;
    string start;
    cin >> start;
    while (start == "Y" || start == "y")
    {
        // * ADDING LOADING SCREEN
        // loading("Enter The Game");

        // ! SHOW BOT'S HERO
        system("cls");
        cout << "========BATTLE MASTER==========\n\n"
             << endl;

        cout << "Bot Generate Hero" << endl;
        for (int i = 0; i < 20; i++)
        {
            cout << ". ";
            Sleep(200);
        }
        cout << endl;
        system("cls");
        cout << "========BATTLE MASTER==========\n\n"
             << endl;
        Bot bot;
        bot.generateChoice();
        bot.initialInfo();
        bot.resultInfo();

        // ! PLAYER CHOOSE HERO
        cout << "\nPilih hero yang ingin digunakan:" << endl;
        cout << "1. " << hero1.name << "\t\t( Damage : " << hero1.damage << ", Health : " << hero1.health << ", Defense : " << hero1.defense << "%, Mana: " << hero1.mana << " )" << endl;
        cout << "2. " << hero2.name << "\t\t( Damage : " << hero2.damage << ", Health : " << hero2.health << ", Defense : " << hero2.defense << "%, Mana: " << hero2.mana << " )" << endl;
        cout << "3. " << hero3.name << "\t( Damage : " << hero3.damage << ", Health : " << hero3.health << ", Defense : " << hero3.defense << "%, Mana: " << hero3.mana << " )" << endl;
        cout << "4. " << hero4.name << "\t\t( Damage : " << hero4.damage << ", Health : " << hero4.health << ", Defense : " << hero4.defense << "%, Mana: " << hero4.mana << " )" << endl;

        int choice;
        cin >> choice;
        // system("cls");
        // * ANTICIPATE ERROR INPUT
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
        // * ANTICIPATE ERROR INPUT
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
            chosenHero.addJurus("Star Strike", 15, 10);
            chosenHero.addJurus("Super Air Strike", 20, 18);
            chosenHero.addJurus("Sword Stab", 25, 23);
            chosenHero.addJurus("X strike", 30, 30);
            break;
        case 2:
            chosenWeapon = pistols;
            chosenHero.addJurus("Crazy Shot", 15, 10);
            chosenHero.addJurus("Destroy Shot", 20, 18);
            chosenHero.addJurus("Crazy Gun", 25, 23);
            chosenHero.addJurus("Focus Shot", 30, 30);
            break;
        case 3:
            chosenWeapon = arrow;
            chosenHero.addJurus("Falling Star", 15, 10);
            chosenHero.addJurus("Shied Destroy", 20, 18);
            chosenHero.addJurus("Concentration", 25, 23);
            chosenHero.addJurus("Triangle of Light", 30, 30);
            break;
        case 4:
            chosenWeapon = spear;
            chosenHero.addJurus("Deadly Thrust", 15, 10);
            chosenHero.addJurus("Rotate Spear", 20, 18);
            chosenHero.addJurus("Breaking Limit", 25, 23);
            chosenHero.addJurus("Twin Brother", 30, 30);
            break;
        }

        // ! WEAPON EFFECT MECHANISM
        cout << "Anda telah memilih " << chosenHero.name << " dengan senjata " << chosenWeapon.name << endl;
        chosenHero.damage += chosenWeapon.damage;
        chosenHero.damage += (chosenWeapon.critical / 100) * chosenHero.damage;
        cout << "Damage hero Anda sekarang adalah " << chosenHero.damage << endl;

        // ! PLAYER CHOOSE ARMOR
        cout << "\nPilih armor yang ingin digunakan:" << endl;
        cout << "1. " << gold.name << "\t\t( Additional Health : " << gold.addHealth << ", Defense : " << gold.defense << "%, Additional Mana: " << gold.addMana << " )" << endl;
        cout << "2. " << silver.name << "\t( Additional Health : " << silver.addHealth << ", Defense : " << silver.defense << "%, Additional Mana: " << silver.addMana << " )" << endl;
        cout << "3. " << bronze.name << "\t( Additional Health : " << bronze.addHealth << ", Defense : " << bronze.defense << "%, Additional Mana: " << bronze.addMana << " )" << endl;

        int armorChoice;
        cin >> armorChoice;
        // * ANTICIPATE ERROR INPUT
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

        // ! ARMOR EFFECT MECHANISM
        cout << "Anda telah memilih " << chosenHero.name << " dengan senjata " << chosenWeapon.name << ", dan armor " << chosenArmor.name << endl;
        chosenHero.health += chosenArmor.addHealth;
        chosenHero.defense += chosenArmor.defense;
        chosenHero.mana += chosenArmor.addMana;

        // * WHAT USER GET WILL BE INSTANCE ON PLAYER
        Player player(chosenHero, chosenWeapon, chosenArmor);

        // ! POP UP RESULT PLAYER'S HERO INFO
        player.playerInfo();

        // ! USING ROCK PAPER SCISSORS TO DETERMINE WHO'S PLAYS
        // loading("Enter The Match");
        GamePlay bkg(player.chosenHero, bot.chosenHero);

        while (player.chosenHero.health > 0 && bot.chosenHero.health > 0)
        {
            cout << "\nPilih Giliran:" << endl;
            cout << "1. Rock " << endl;
            cout << "2. Paper" << endl;
            cout << "3. Scissors" << endl;
            int turnPlayer;
            cin >> turnPlayer;
            // * ANTICIPATE ERROR INPUT
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
                double temporaryDamagePlayer;
                int choice;
                temporaryDamagePlayer = player.chosenHero.damage;
                vector<int> skillIndex;

                while (true)
                {
                    // * untuk memastikan hanya skill yang punya status mana yang cukup untuk digunakan dan dipilih
                    for (int i = 0; i < player.chosenHero.skillList.size(); i++)
                    {
                        if (player.chosenHero.skillList[i].manaCost <= player.chosenHero.mana)
                        {
                            skillIndex.push_back(i);
                        }
                    }

                    // ! ENOUGH MANA RECRUITMENT's ACTION
                    if (skillIndex.size())
                    {
                        cout << "Pilih jurus yang ingin digunakan:" << endl;
                        for (int i = 0; i < skillIndex.size(); i++)
                        {
                            cout << i + 1 << ". " << player.chosenHero.skillList[skillIndex[i]].name << "(Additional Damage : " << player.chosenHero.skillList[skillIndex[i]].damage << ", Mana Cost: " << player.chosenHero.skillList[skillIndex[i]].manaCost << ")" << endl;
                        }
                        cin >> choice;
                    // * ANTICIPATE ERROR INPUT
                        while (cin.fail() || choice < 1 || choice > skillIndex.size())
                        {
                            cout << "Pilihan tidak valid. Silakan pilih kembali:" << endl;
                            cin.clear();                                         // untuk membersihkan error flag
                            cin.ignore(numeric_limits<streamsize>::max(), '\n'); // untuk menghapus input yang tidak valid
                            cin >> choice;
                        }
                        if (player.chosenHero.mana >= player.chosenHero.skillList[choice - 1].manaCost)
                        {
                            // ! EXECUTION DAMAGE COST EFFECT MECHANISM
                            temporaryDamagePlayer += player.chosenHero.skillList[choice - 1].damage;
                            player.chosenHero.mana -= player.chosenHero.skillList[choice - 1].manaCost;
                            bot.chosenHero.health -= temporaryDamagePlayer * (1 - (bot.chosenHero.defense / 100));
                            bot.chosenHero.mana += 15;
                            if (bot.chosenHero.health <= 0)
                            {
                                cout << "Health Musuh habis" << endl;
                            }
                            else
                            {
                                cout << "Anda menang! Health Musuh: " << bot.chosenHero.health << endl;
                            }
                            cout << "Anda menang! Health Anda: " << player.chosenHero.health << endl;
                            cout << "Anda menang! Mana Anda: " << player.chosenHero.mana << endl;
                            cout << "Anda menang! Mana Musuh: " << bot.chosenHero.mana << endl;
                            break;
                        }
                    }
                    // ! NOT ENOUGH MANA RECRUITMENT's ACTION
                    else
                    {
                        cout << "Mana Habis" << endl;
                        break;
                    }
                }
            }
            else if (winner == "bot")
            {
                double temporaryDamageBot;
                int temporarySkillBot;
                int choice;
                temporaryDamageBot = bot.chosenHero.damage;
                vector<int> skillIndex;
                // * memastikan hanya skilll yang memenuhi mana cost yang akan dapat dipilih bot
                for (int i = 0; i < bot.chosenHero.skillList.size(); i++)
                {
                    if (bot.chosenHero.skillList[i].manaCost <= bot.chosenHero.mana)
                    {
                        skillIndex.push_back(i);
                    }
                }
                if (skillIndex.size())
                {
                    mt19937 rng(random_device{}());
                    uniform_int_distribution<> dist(0, skillIndex.size() - 1);
                    int randomIndex = dist(rng);
                    choice = skillIndex[randomIndex];

                    if (bot.chosenHero.mana >= bot.chosenHero.skillList[choice - 1].manaCost)
                    {
                        // ! EXECUTION BOT DAMAGE COST MECHANISM
                        cout << "Bot Menyerang menggunakan Skill : " << bot.chosenHero.skillList[choice - 1].name << "( Damage: " << bot.chosenHero.skillList[choice - 1].damage << ", Mana Cost : " << bot.chosenHero.skillList[choice - 1].manaCost << " )" << endl;
                        temporaryDamageBot += bot.chosenHero.skillList[choice - 1].damage;
                        bot.chosenHero.mana -= bot.chosenHero.skillList[choice - 1].manaCost;
                        player.chosenHero.health -= temporaryDamageBot * (1 - (bot.chosenHero.defense / 100));
                        player.chosenHero.mana += 15;
                        if (player.chosenHero.health <= 0)
                        {
                            cout << "Health Anda habis" << endl;
                        }
                        else
                        {
                            cout << "Anda kalah! Health Anda: " << player.chosenHero.health << endl;
                        }
                        cout << "Anda kalah! Mana Anda: " << player.chosenHero.mana << endl;
                        cout << "Anda kalah! Mana Musuh: " << bot.chosenHero.mana << endl;
                        cout << "Anda kalah! Health Musuh: " << bot.chosenHero.health << endl;
                    }
                }
            }
            else if (winner == "draw")
            {
                // ! EXECUTION DRAW MECHANISM
                cout << "Hasil seri!" << endl;
                player.chosenHero.mana += 10;
                bot.chosenHero.mana += 10;
            }
            else
            {
                cout << "Input tidak valid." << endl;
            }
        }
        //! FINAL DECLARATION
        if (player.chosenHero.health <= 0)
        {
            cout << "Hero Anda kalah! Game over." << endl;
        }
        else if (bot.chosenHero.health <= 0)
        {
            cout << "Hero Anda menang! Selamat!" << endl;
        }
        return 0;
    }
}
