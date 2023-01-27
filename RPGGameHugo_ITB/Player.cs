using System;

namespace RPGGameHugo_ITB

{
    class Player
    {
        public string Name{get; set;} = "Player";
        public double Health {get; set;}= 0;
        public double MaxAttack {get; set;} = 0;
        public double DefenseMax {get; set;} = 0;
        public double xp {get; set;} = 0;
        public double Level {get; set;} = 0;
        public double Turn{get; set;} = 0;

        //RNG
        Random random = new Random();


        //Polimorfism
        public Player(string name = "Player",double health = 0, double maxAttack = 0, double defenseMax = 0,double XP = 0,double level = 0,double winTurn = 0)
        {
            Name = name;
            Health = health;
            MaxAttack = maxAttack;
            DefenseMax = defenseMax;
            xp = XP;
            Level = level;
            Turn = winTurn;

        }



        
        public double Attack()
        {
            return random.Next(1,(int)MaxAttack);
        }
        public double Defense()
        {
            return random.Next(1,(int)DefenseMax);
        }
        public double DefenseBuff()
        {
            return random.Next(1,10);
        }
        public double RandomXp()
        {
            return random.Next(20,70);
        }
        public double XpToNextLvl()
        {
            return 50 + (10 * Level);
        }
        public double MonsterHealthUpgrader()
        {
            return 30 + (5 * Turn);
        }
        public double MonsterAttackUpgrader()
        {
            return 10 + (2 * Turn);
        }
        public double MonsteDefenseUpgrader()
        {
            return 1 + (2 * Turn);
        }




    }
}