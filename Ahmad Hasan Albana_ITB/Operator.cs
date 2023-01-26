using System.ComponentModel;
using System.Numerics;

namespace RockPaperScissor
{
    public class Operator
    {
        public static void MainStart(Player player, Bots enemy) //Player MainStart
        {
            int round = 0;

            Console.WriteLine($"\n{player.name} ({player.type})  VS  {enemy.name} ({enemy.type})\n");

            while (player.health > 0 && enemy.health > 0)
            {
                round++;

                GameInformer.PlayerData(player);
                GameInformer.PlayerData(enemy);

                Console.WriteLine($"---------- ROUND {round} ----------");

                // pemilihan sign

                player.hand = Player.ChooseSign();
                enemy.hand = GetRandomIndex();
                GameInformer.WinnerChecker(player, enemy);
            }

            if (player.health <= 0)
            {
                player.health = 0;
                Console.WriteLine("You Lose!\n");
            }
            else
            {
                enemy.health = 0;
                Console.WriteLine("You Win!\n");
            }

            GameInformer.PlayerData(player);
            GameInformer.PlayerData(enemy);
        }

        public static void MainStart(Bots player, Bots enemy) //Gambler MainStart
        {
            int winner;
            int round = 0;

            Console.WriteLine($"\n{player.name} ({player.type})  VS  {enemy.name} ({enemy.type})\n");

            int guess = GameInformer.Guessing(player, enemy);

            while (player.health > 0 && enemy.health > 0)
            {
                round++;

                GameInformer.PlayerData(player);
                GameInformer.PlayerData(enemy);

                Console.WriteLine($"---------- ROUND {round} ----------");

                // pemilihan sign

                player.hand = GetRandomIndex();
                enemy.hand = GetRandomIndex();
                GameInformer.WinnerChecker(player, enemy);
            }

            if (player.health <= 0)
            {
                player.health = 0;
                winner = 1;
            }
            else
            {
                enemy.health = 0;
                winner = 0;
            }

            GameInformer.PlayerData(player);
            GameInformer.PlayerData(enemy);

            GameInformer.CheckGuess(guess, winner);
        }

        public static Bots CreateBot(int urutan) // create bot
        {
            return (Bots)CreatePlayer(GetRandomIndex(), $"Bots {urutan}");
        }
        public static Player CreateUser() // create user's player
        {
            return CreatePlayer(Player.ChooseType(), Player.FillName());
        }
        private static Player CreatePlayer(int tipe, string name) // create player secara umum
        {
            if (tipe % 3 == 0)
            {
                return new TypeAttack("Attack", name + " (A)");
            }
            else if (tipe % 3 == 1)
            {
                return new TypeBalance("Balance", name + " (B)");
            }
            else
            {
                return new TypeDefense("Defense", name + " (D)");
            }
        }

        private static int GetRandomIndex() // sebagai input dari bot
        {
            Random rd = new();
            int rand_num = rd.Next(0, 3);

            return rand_num;
        }
    }
}