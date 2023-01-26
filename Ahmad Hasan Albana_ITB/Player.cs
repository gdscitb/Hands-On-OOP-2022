using System.ComponentModel;
using System.Security.Cryptography;

namespace RockPaperScissor
{
    public abstract class Bots
    {
        public string name;
        public string type;
        public int attack;
        public int defense;
        public int health;
        public int hand;

        public int winStreakBonus = 0;

        public Bots(string type, string name)
        {
            attack = 500;
            defense = 0;
            health = 5000;
            this.type = type;
            this.name = name;
        }

        public abstract void Winning(int defPoint);
        public void Losing(int atkPoint)
        {
            winStreakBonus = 0;
            health -= atkPoint;
        }
    }

    public abstract class Player : Bots
    {
        public Player(string type, string name) : base(type, name) { }
        
        protected internal static int ChooseType()
        {
            Console.WriteLine("\nChoose your type : \n1. Attack \n2. Balance \n3. Defense\n");
            return Convert.ToInt32(Console.ReadLine()) - 1;
        }

        protected internal static string FillName()
        {
            Console.WriteLine("\nWrite your name: ");
            var name = Console.ReadLine();

            if (name == "" || name == null)
            {
                name = "Player";
            }

            return name;
        }

        internal protected static int ChooseSign()
        {
            Console.WriteLine("Choose your sign : \n1. Rock \n2. Paper \n3. Scissor\n");
            return Convert.ToInt32(Console.ReadLine()) - 1;
        }
    }

    public class TypeAttack : Player
    {
        public TypeAttack(string type, string name):base(type, name) { }
        public override void Winning(int defPoint)
        {
            winStreakBonus+=10;
            health -= defPoint;

            attack += 50;
        }
    }

    public class TypeBalance : Player
    {
        public TypeBalance(string type, string name) : base(type, name) { }
        public override void Winning(int defPoint)
        {
            winStreakBonus+=10;
            health -= defPoint;

            attack += 25;
            defense += 25;
        }
    }

    public class TypeDefense : Player
    {
        public TypeDefense(string type, string name) : base(type, name) { }
        public override void Winning(int defPoint)
        {
            winStreakBonus+=10;
            health -= defPoint;

            defense += 50;
        }
    }
}