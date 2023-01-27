using System;

namespace RPGGameHugo_ITB

{
    class Battle
    {
        public static void Fight(Player player1, Player monster)
        {
            while(true)
            {
                if(BattleEvent(player1,monster) == "Game Over")
                {
                    Console.Clear();
                    Console.WriteLine("---------Game Over--------");
                    Console.WriteLine("       Anda kalah :(");
                    break;
                }else if(BattleEvent(player1,monster) == "Menang")
                {
                    player1.Turn += 1;
                    player1.Health += 20;

                    monster.Health = player1.MonsterHealthUpgrader();


                    Console.Clear();
                    Console.WriteLine("-----SELAMAT ANDA MENANG!!!--------");
                    double XpReward = player1.RandomXp();
                    Console.WriteLine("Anda Menang!");
                    Console.WriteLine("Selamat Anda mendapatkan XP sebesar : {0} dan HP Bertambah sebesar 20",XpReward);
                    Console.WriteLine("Ingin Lanjut? (y/n) ");
                    string lanjut = Console.ReadLine();
                    if (lanjut == "n")
                    {
                        break;
                    }
                    else
                    {
                        Console.Clear();
                        player1.xp = player1.xp + XpReward;
                        if (player1.xp > player1.XpToNextLvl())
                        {
                            
                            player1.xp -= player1.XpToNextLvl();
                            player1.Level += 1;
                            Console.WriteLine("=-------------------------------------------=");
                            Console.WriteLine("Anda naik level, ingin mengupgrade stats apa?");
                            Console.WriteLine("A --- ATTACK + 5            D --- DEFENSE + 2 ");
                            Console.WriteLine("       HEALTH ANDA BERTAMBAH SEBESAR 50");
                            Console.WriteLine("=-------------------------------------------=");
                            player1.Health += 50;
                            monster.MaxAttack += 2;
                            monster.DefenseMax += 1;
                            string statsup = Console.ReadLine();
                            if(statsup == "A")
                            {
                                player1.MaxAttack += 5;
                            }else
                            {
                                player1.DefenseMax += 2;
                            }
                        }
                        
                       
                    }

                    
                }

                
            }
        }

        public static string BattleEvent(Player player1,Player monster)
        {
            
            double player1AttackDamage = player1.Attack();
            double player1DefenseAmount = player1.Defense();
            double defenseBuff = player1.DefenseBuff();

            double monsterAttackDamage = monster.Attack();
            double monsterDefenseAmount = monster.Defense();

            double damageKeMonster = player1AttackDamage - monsterDefenseAmount;
            double damageKePlayer = monsterAttackDamage - player1DefenseAmount;
            if (player1.Health >= 100)
            {
                player1.Health = 100;
            }



            Console.WriteLine("=---------BATTLE-------=");
            Console.WriteLine("        A - ATTACK              ");
            Console.WriteLine("        D - DEFENSE             ");
            Console.WriteLine("----------STATS----------");
            Console.WriteLine("Defense : {0} , Attack : {1}" , player1.DefenseMax,player1.MaxAttack);
            Console.WriteLine("XP : {0} / {1} , LVL : {2}" , player1.xp,player1.XpToNextLvl(),player1.Level );
            Console.WriteLine("Monster HP  : {0} , Your HP {1}" , monster.Health, player1.Health);

            Console.WriteLine("=-----------------------=");
            
            string input = Console.ReadLine();
            
            Console.Clear();
           

            if (input == "A" )
            {
                if(damageKeMonster > 0)
                {
                    monster.Health = monster.Health - damageKeMonster;
                    Console.WriteLine("Anda menyerang monster sebesar {0} " , damageKeMonster);

                }
                else 
                {               
                    damageKeMonster = 0;
                    Console.WriteLine("SERANGAN TERBLOK OLEH LAWAN ! ");
                }
                
            }else // Input == "D"
            {

                player1DefenseAmount += defenseBuff;
                Console.WriteLine("Anda meningkatkan pertahanan anda sebesar {0} defense!",defenseBuff);
                Console.WriteLine("Defense anda sekarang sebesar {0}" , player1DefenseAmount);
            } 



            //MONSTER SERANG
            if(damageKePlayer > 0)
            {
                player1.Health = player1.Health - damageKePlayer;
                Console.WriteLine("Monster menyerang anda sebesar {0} " , damageKePlayer);
            


            }
            else 
            {               
                damageKePlayer = 0;
                Console.WriteLine("ANDA MEMBLOKIR SERANGAN! ");
                Console.WriteLine("Health Anda : {0}",player1.Health);

            }


            




            
            if(player1.Health <= 0)
            {
                return "Game Over";

            }else if (monster.Health <= 0)
            {
                return "Menang";
            }else 
                return "Play Again";

        }

    }

}