using Microsoft.VisualBasic.FileIO;
using System;
using static Program;

public class Program
{
    public class Entity
    {
        protected int level { get; set; }
        protected int health { get; set; }
        protected int mana { get; set; }
        protected int stamina { get; set; }
        protected int meleeDMG { get; set; }
        protected int rangedDMG { get; set; }
        protected string className { get; set; }

        public int GetLevel()
        {
            return level;
        }

        public int GetHealth()
        {
            return health;
        }

        public int GetMana()
        {
            return mana;
        }

        public int GetStamina()
        {
            return stamina;
        }

        public int GetMeleeDMG()
        {
            return meleeDMG;
        }

        public int GetRangedDMG()
        {
            return rangedDMG;
        }

        public string GetClassName()
        {
            return className;
        }

        public void ChangeHealth(int delta)
        {
            health += delta;
        }

        public void ChangeMana(int delta)
        {
            mana += delta;
        }

        public void ChangeStamina(int delta)
        {
            stamina += delta;
        }

        public void ChangeMeleeDMG(int delta)
        {
            meleeDMG += delta;
        }

        public void ChangeRangedDMG(int delta)
        {
            rangedDMG += delta;
        }
    }

    public class Player : Entity
    {
        protected int experience { get; set; }

        public int GetExperience()
        {
            return experience;
        }

        public void ChangeExperience(int delta)
        {
            experience += delta;
        }

        public void PlayerGetDMG(int delta)
        {
            ChangeHealth(-delta);
        }

        public virtual void LevelUp()
        {
            level += 1;
            ChangeHealth(100);
            ChangeMana(-mana + 100);
            ChangeStamina(-stamina + 100);
            ChangeMeleeDMG(8);
            ChangeRangedDMG(8);
        }
    }

    public class Knight : Player
    {
        public Knight()
        {
            level = 1;
            className = "Knight";
            experience = 0;
            health = 100;
            mana = 80;
            stamina = 120;
            meleeDMG = 25;
            rangedDMG = 15;
        }

        public override void LevelUp()
        {
            level += 1;
            ChangeHealth(100);
            ChangeMana(-mana + 80);
            ChangeStamina(-stamina + 120);
            ChangeMeleeDMG(10);
            ChangeRangedDMG(6);
        }
    }

    public class Mage : Player
    {
        public Mage()
        {
            level = 1;
            className = "Mage";
            experience = 0;
            health = 100;
            mana = 120;
            stamina = 80;
            meleeDMG = 15;
            rangedDMG = 25;
        }

        public override void LevelUp()
        {
            level += 1;
            ChangeHealth(100);
            ChangeMana(-mana + 120);
            ChangeStamina(-stamina + 80);
            ChangeMeleeDMG(6);
            ChangeRangedDMG(10);
        }
    }

    public class Thief : Player
    {
        public Thief()
        {
            level = 1;
            className = "Thief";
            experience = 0;
            health = 100;
            mana = 100;
            stamina = 100;
            meleeDMG = 20;
            rangedDMG = 20;
        }

        public override void LevelUp()
        {
            level += 1;
            ChangeHealth(100);
            ChangeMana(-mana + 100);
            ChangeStamina(-stamina + 100);
            ChangeMeleeDMG(8);
            ChangeRangedDMG(8);
        }
    }

    public class Monster : Entity
    {
        public void ChangeLevel(int delta)
        {
            level = delta;
            health += (delta - 1) * 20;
            //mana += (delta - 1) * 20;
            //stamina += (delta - 1) * 20;
            meleeDMG += (delta - 1) * 4;
            rangedDMG += (delta - 1) * 4;
        }
        public void MonsterGetDMG(int delta)
        {
            ChangeHealth(-delta);
        }
    }

    public class Goblin : Monster
    {
        public Goblin()
        {
            level = 1;
            className = "Goblin";
            health = 100;
            mana = 80;
            stamina = 120;
            meleeDMG = 5;
            rangedDMG = 3;
        }
    }

    public class Slime : Monster
    {
        public Slime()
        {
            level = 1;
            className = "Slime";
            health = 100;
            mana = 120;
            stamina = 80;
            meleeDMG = 3;
            rangedDMG = 5;
        }
    }

    public class Wolf : Monster
    {
        public Wolf()
        {
            level = 1;
            className = "Wolf";
            health = 100;
            mana = 100;
            stamina = 100;
            meleeDMG = 4;
            rangedDMG = 4;
        }
    }

    public static void Main(String[] args)
    {
        void Title()
        {
            Console.Clear();
            Console.WriteLine(" _____ _____ __ __ _____    _____ _____ _____ ");
            Console.WriteLine("|_   _|   __|  |  |_   _|  | __  |  _  |   __|");
            Console.WriteLine("  | | |   __|-   -| | |    |    -|   __|  |  |");
            Console.WriteLine("  |_| |_____|__|__| |_|    |__|__|__|  |_____|");
            Console.WriteLine("                                              ");
        }

        void ProceedText()
        {
            Console.WriteLine("Enter number above to proceed (0 for main menu)...");
        }

        void MainMenu()
        {
            try
            {
                Title();
                Console.WriteLine("1. Play");
                Console.WriteLine("2. Exit");
                ProceedText();
                int option = int.Parse(Console.ReadLine());
                if (option == 1)
                {
                    ClassOption();
                }
                else if (option == 2)
                {
                    Environment.Exit(0);
                }
                else
                {
                    MainMenu();
                }
            }
            catch (Exception ex) { MainMenu(); }

            //int option = 0;
            //do
            //{
            //    try
            //    {
            //        option = int.Parse(Console.ReadLine());
            //    }
            //    catch { }

            //    if (option == 1) { ClassOption(); }
            //    else if (option == 2) { break; }
            //    else { option = 0; }
            //}
            //while (option != 2);
        }

        void ClassOption()
        {
            try
            {
                Title();
                Console.WriteLine("Choose your class:");
                Console.WriteLine("1. Knight");
                Console.WriteLine("2. Mage");
                Console.WriteLine("3. Thief");
                ProceedText();
                int option = int.Parse(Console.ReadLine());
                if (option == 1)
                {
                    Knight player = new Knight();
                    PlayOption(player);
                }
                else if (option == 2)
                {
                    Mage player = new Mage();
                    PlayOption(player);
                }
                else if (option == 3)
                {
                    Thief player = new Thief();
                    PlayOption(player);
                }
                else if (option == 0)
                {
                    MainMenu();
                }
                else
                {
                    ClassOption();
                }
            }
            catch(Exception ex) { ClassOption(); }
        }

        void PlayOption(Player player)
        {
            try
            {
                Title();
                Console.WriteLine($"You are a Lvl {player.GetLevel()} {player.GetClassName()} (HP:{player.GetHealth()}/MP:{player.GetMana()}/AP:{player.GetStamina()}) EXP:{player.GetExperience()}/100");
                Console.WriteLine("1. Battle");
                Console.WriteLine("2. Upgrade");
                ProceedText();
                int option = int.Parse(Console.ReadLine());
                if (option == 1)
                {
                    BattleFinder(player);
                }
                else if (option == 2)
                {
                    UpgradeOption(player);
                }
                else if (option == 0)
                {
                    MainMenu();
                }
                else
                {
                    PlayOption(player);
                }
            }
            catch(Exception ex) { PlayOption(player); }
        }

        void UpgradeOption(Player player)
        {
            try
            {
                Title();
                Console.WriteLine($"You are a Lvl {player.GetLevel()} {player.GetClassName()} (HP:{player.GetHealth()}/MP:{player.GetMana()}/AP:{player.GetStamina()}) EXP:{player.GetExperience()}/100");
                Console.WriteLine("1. Level Up");
                Console.WriteLine("2. Increase melee ATK DMG (-10 EXP)");
                Console.WriteLine("3. Increase ranged ATK DMG (-10 EXP)");
                Console.WriteLine("4. Heal (-10 EXP)");
                Console.WriteLine("5. Rest (-10 EXP)");
                Console.WriteLine("6. Meditate (-10 EXP)");
                Console.WriteLine("7. Convert MP to AP");
                Console.WriteLine("8. Convert AP to MP");
                Console.WriteLine("9. Back");

                ProceedText();
                int option = int.Parse(Console.ReadLine());
                if (option == 1 && player.GetExperience() >= 100)
                {
                    player.ChangeExperience(-100);
                    player.LevelUp();
                }
                else if (option == 2 && player.GetExperience() >= 10)
                {
                    player.ChangeExperience(-10);
                    player.ChangeMeleeDMG(2);
                }
                else if (option == 3 && player.GetExperience() >= 10)
                {
                    player.ChangeExperience(-10);
                    player.ChangeRangedDMG(2);
                }
                else if (option == 4 && player.GetExperience() >= 10)
                {
                    player.ChangeExperience(-10);
                    player.ChangeHealth(10);
                }
                else if (option == 5 && player.GetExperience() >= 10)
                {
                    player.ChangeExperience(-10);
                    player.ChangeStamina(10);
                }
                else if (option == 6 && player.GetExperience() >= 10)
                {
                    player.ChangeExperience(-10);
                    player.ChangeMana(10);
                }
                else if (option == 7)
                {
                    player.ChangeStamina(player.GetMana() / 2);
                    player.ChangeMana(-player.GetMana());
                }
                else if (option == 8)
                {
                    player.ChangeMana(player.GetStamina() / 2);
                    player.ChangeStamina(-player.GetStamina());
                }
                else if (option == 9)
                {
                    PlayOption(player);
                }
                else if (option == 0)
                {
                    MainMenu();
                }
                else
                {
                    UpgradeOption(player);
                }
                UpgradeOption(player);
            }
            catch (Exception ex) { UpgradeOption(player); }
        }

        void BattleFinder(Player player)
        {
            Title();
            Random random = new Random();
            int enemyRandom = random.Next(1, 4);
            if (enemyRandom == 1)
            {
                Goblin enemy = new Goblin();
                EnemyFound(player, enemy);
            }
            else if (enemyRandom == 2)
            {
                Slime enemy = new Slime();
                EnemyFound(player, enemy);
            }
            else if (enemyRandom == 3)
            {
                Wolf enemy = new Wolf();
                EnemyFound(player, enemy);
            }
        }

        void EnemyFound(Player player, Monster enemy)
        {
            Random random = new Random();
            int lvlRandom = 1;
            if (player.GetLevel() != 1)
            {
                lvlRandom = random.Next(player.GetLevel() - 1, player.GetLevel() + 2);
            }

            enemy.ChangeLevel(lvlRandom);
            

            try
            {
                Console.WriteLine($"You found a Lvl {enemy.GetLevel()} {enemy.GetClassName()} (HP:{enemy.GetHealth()}/MP:{enemy.GetMana()}/AP:{enemy.GetStamina()})");
                Console.WriteLine("1. Fight");
                Console.WriteLine("2. Flee");
                ProceedText();
                int option = int.Parse(Console.ReadLine());
                if (option == 1)
                {
                    Battle(player, enemy);
                }
                else if (option == 2)
                {
                    PlayOption(player);
                }
                else if (option == 0)
                {
                    MainMenu();
                }
                else
                {
                    EnemyFound(player, enemy);
                }
            }
            catch (Exception ex) { EnemyFound(player, enemy);  }
        }

        void Battle(Player player, Monster enemy)
        {
            try
            {
                Title();
                Console.WriteLine($"You   : Lvl {player.GetLevel()} {player.GetClassName()} (HP:{player.GetHealth()}/MP:{player.GetMana()}/AP:{player.GetStamina()}) EXP:{player.GetExperience()}/100");
                Console.WriteLine($"Enemy : Lvl {enemy.GetLevel()} {enemy.GetClassName()} (HP:{enemy.GetHealth()}/MP:{enemy.GetMana()}/AP:{enemy.GetStamina()})");
                Console.WriteLine("1. Use melee ATK");
                Console.WriteLine("2. Use ranged ATK");
                Console.WriteLine("3. Stand still");
                //Console.WriteLine("3. Use defense");
                ProceedText();
                int option = int.Parse(Console.ReadLine());
                if (option == 1 && player.GetStamina() >= 10)
                {
                    PlayerMeleeATK(player, enemy);
                }
                else if (option == 2 && player.GetMana() >= 10)
                {
                    PlayerRangedATK(player, enemy);
                }
                else if (option == 3)
                {
                    if (player.GetStamina() < 10 || player.GetMana() < 10)
                    {
                        player.ChangeStamina(20);
                        player.ChangeMana(20);
                    }
                    EnemyAttack(player, enemy);
                }
                //else if (option == 3)
                //{

                //}
                else if (option == 0)
                {
                    MainMenu();
                }
                else
                {
                    Battle(player, enemy);
                }
            }
            catch (Exception ex) { Battle(player, enemy); }
        }

        void PlayerMeleeATK(Player player, Monster enemy)
        {
            try
            {
                player.ChangeMana(5);
                player.ChangeStamina(-10);
                Random random = new Random();
                int dmgRandom = random.Next(80, 121) * player.GetMeleeDMG() / 100;
                enemy.MonsterGetDMG(dmgRandom);
                Title();
                Console.WriteLine($"You   : Lvl {player.GetLevel()} {player.GetClassName()} (HP:{player.GetHealth()}/MP:{player.GetMana()}/AP:{player.GetStamina()}) EXP:{player.GetExperience()}/100");
                Console.WriteLine($"Enemy : Lvl {enemy.GetLevel()} {enemy.GetClassName()} (HP:{enemy.GetHealth()}/MP:{enemy.GetMana()}/AP:{enemy.GetStamina()})");
                if (enemy.GetHealth() <= 0)
                {
                    player.ChangeExperience(20 + (enemy.GetLevel() - player.GetLevel() + 1) * 10 * random.Next(100, 121) / 100);
                    Console.WriteLine($"You killed a Lvl {enemy.GetLevel()} {enemy.GetClassName()}.");
                    Console.ReadLine();
                    PlayOption(player);
                }
                Console.WriteLine($"You use melee ATK and deal {dmgRandom} DMG.");
                Console.WriteLine("1. Continue");
                ProceedText();
                int option = int.Parse(Console.ReadLine());
                if (option == 1)
                {
                    EnemyAttack(player, enemy);
                }
                else if (option == 0)
                {
                    MainMenu();
                }
                else
                {
                    EnemyAttack(player, enemy);
                }
            }
            catch (Exception ex) { EnemyAttack(player, enemy); }
        }

        void PlayerRangedATK(Player player, Monster enemy)
        {
            try
            {
                player.ChangeStamina(5);
                player.ChangeMana(-10);
                Random random = new Random();
                int dmgRandom = random.Next(80, 121) * player.GetRangedDMG() / 100;
                enemy.MonsterGetDMG(dmgRandom);
                Title();
                Console.WriteLine($"You   : Lvl {player.GetLevel()} {player.GetClassName()} (HP:{player.GetHealth()}/MP:{player.GetMana()}/AP:{player.GetStamina()}) EXP:{player.GetExperience()}/100");
                Console.WriteLine($"Enemy : Lvl {enemy.GetLevel()} {enemy.GetClassName()} (HP:{enemy.GetHealth()}/MP:{enemy.GetMana()}/AP:{enemy.GetStamina()})");
                if(enemy.GetHealth() <= 0)
                {
                    player.ChangeExperience(20 + (enemy.GetLevel() - player.GetLevel() + 1) * 10 * random.Next(100, 121) / 100);
                    Console.WriteLine($"You killed a Lvl {enemy.GetLevel()} {enemy.GetClassName()}.");
                    Console.ReadLine();
                    PlayOption(player);
                }
                Console.WriteLine($"You use ranged ATK and deal {dmgRandom} DMG.");
                Console.WriteLine("1. Continue");
                ProceedText();
                int option = int.Parse(Console.ReadLine());
                if (option == 1)
                {
                    EnemyAttack(player, enemy);
                }
                else if (option == 0)
                {
                    MainMenu();
                }
                else
                {
                    EnemyAttack(player, enemy);
                }
            }
            catch (Exception ex) { EnemyAttack(player, enemy); }
        }

        void EnemyAttack(Player player, Monster enemy)
        {
            Title();
            while (enemy.GetStamina() >= 10 || enemy.GetMana() >= 10)
            {
                Random random = new Random();
                int atkRandom = random.Next(1, 3);
                if (atkRandom == 1 && enemy.GetStamina() >= 10)
                {
                    EnemyMeleeATK(player, enemy);
                }
                else if (atkRandom == 2 && enemy.GetMana() >= 10)
                {
                    EnemyRangedATK(player, enemy);
                }
            }
            enemy.ChangeMana(10);
            enemy.ChangeStamina(10);
            Battle(player, enemy);
        }

        void EnemyMeleeATK(Player player, Monster enemy)
        {
            try
            {
                enemy.ChangeStamina(-10);
                Random random = new Random();
                int dmgRandom = random.Next(80, 121) * enemy.GetMeleeDMG() / 100;
                player.PlayerGetDMG(dmgRandom);
                Title();
                Console.WriteLine($"You   : Lvl {player.GetLevel()} {player.GetClassName()} (HP:{player.GetHealth()}/MP:{player.GetMana()}/AP:{player.GetStamina()}) EXP:{player.GetExperience()}/100");
                Console.WriteLine($"Enemy : Lvl {enemy.GetLevel()} {enemy.GetClassName()} (HP:{enemy.GetHealth()}/MP:{enemy.GetMana()}/AP:{enemy.GetStamina()})");
                if (player.GetHealth() <= 0)
                {
                    Console.WriteLine($"You killed by a Lvl {enemy.GetLevel()} {enemy.GetClassName()}.");
                    Console.ReadLine();
                    MainMenu();
                }
                Console.WriteLine($"{enemy.GetClassName()} uses melee ATK and deal {dmgRandom} DMG.");
                Console.WriteLine("1. Continue");
                ProceedText();
                int option = int.Parse(Console.ReadLine());
                if (option == 1)
                {
                    Battle(player, enemy);
                }
                else if (option == 0)
                {
                    MainMenu();
                }
                else
                {
                    Battle(player, enemy);
                }
            }
            catch (Exception ex) { Battle(player, enemy); }
        }

        void EnemyRangedATK(Player player, Monster enemy)
        {
            try
            {
                enemy.ChangeMana(-10);
                Random random = new Random();
                int dmgRandom = random.Next(80, 121) * enemy.GetRangedDMG() / 100;
                player.PlayerGetDMG(dmgRandom);
                Title();
                Console.WriteLine($"You   : Lvl {player.GetLevel()} {player.GetClassName()} (HP:{player.GetHealth()}/MP:{player.GetMana()}/AP:{player.GetStamina()}) EXP:{player.GetExperience()}/100");
                Console.WriteLine($"Enemy : Lvl {enemy.GetLevel()} {enemy.GetClassName()} (HP:{enemy.GetHealth()}/MP:{enemy.GetMana()}/AP:{enemy.GetStamina()})");
                if (player.GetHealth() <= 0)
                {
                    Console.WriteLine($"You killed by a Lvl {enemy.GetLevel()} {enemy.GetClassName()}.");
                    Console.ReadLine();
                    MainMenu();
                }
                Console.WriteLine($"{enemy.GetClassName()} uses ranged ATK and deal {dmgRandom} DMG.");
                Console.WriteLine("1. Continue");
                ProceedText();
                int option = int.Parse(Console.ReadLine());
                if (option == 1)
                {
                    Battle(player, enemy);
                }
                else if (option == 0)
                {
                    MainMenu();
                }
                else
                {
                    Battle(player, enemy);
                }
            }
            catch (Exception ex) { Battle(player, enemy); }
        }

        MainMenu();
    }
}