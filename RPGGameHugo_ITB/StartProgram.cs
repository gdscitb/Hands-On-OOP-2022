using System;

namespace RPGGameHugo_ITB
{
    class StartProgram
    {
        static void Main(string[] args)
        {
            Player player1 = new Player
            ("Player" , 100,8,1,0,1,1);

            Player monster = new Player
            ("Monster",30,10,1,0,1,1);

            Battle.Fight(player1,monster);
            

            Console.ReadLine();
            
            
        }
    }
}
