using System.ComponentModel;

namespace RockPaperScissor
{
    public static class GameInformer
    {
        public static void WinnerChecker(Bots player, Bots enemy) // mengecek pemenang setiap ronde dan mengeksekusi fungsi Winning dan Losing
        {
            string x;
            string[] hands = { "Rock", "Paper", "Scissor" };

            if ((player.hand + 1) % 3 == (enemy.hand % 3)) // enemy win
            {
                player.Losing(enemy.attack + enemy.winStreakBonus);
                enemy.Winning(player.defense);

                x = "<<";
            }
            else if ((enemy.hand + 1) % 3 == (player.hand % 3)) // player win
            {
                enemy.Losing(player.attack + player.winStreakBonus);
                player.Winning(enemy.defense);

                x = ">>";
            }
            else // draw
            {
                x = "==";
            }

            Console.WriteLine($"\n{player.name} ({hands[player.hand]})   | {x} |  {enemy.name} ({hands[enemy.hand]})\n");
        }

        public static int Guessing(Bots bot1, Bots bot2) // meminta input tebakan dari role Gambler
        {
            Console.WriteLine($"Who is gonna win? \n1. {bot1.name} \n2. {bot2.name}");
            return Convert.ToInt32(Console.ReadLine());
        }

        public static void CheckGuess(int guess, int winner) // mengecek apakah tebakan benar dari role Gambler
        {
            if (guess == winner)
            {
                Console.WriteLine("Your Guess is Right\n");
            }
            else
            {
                Console.WriteLine("Your Guess is Wrong\n");
            }
        }

        public static void PlayerData(Bots player) // menampilkan atribut dari player
        {
            Console.WriteLine
               ($"{player.name} \nHealth  : {player.health} \nAttack  : {player.attack} \nDefense : {player.defense} \nAtkBonus: {player.winStreakBonus} \n");
        }

        public static int ChooseRole() // meminta input role dari client
        {
            Console.WriteLine("Choose your role : \n1. Player \n2. Gambler \n");
            return Convert.ToInt32(Console.ReadLine()) - 1;
        }

    }
}