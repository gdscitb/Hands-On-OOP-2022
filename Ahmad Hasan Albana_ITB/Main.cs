using System.Numerics;
using System;
using System.Security.Cryptography.X509Certificates;

namespace RockPaperScissor
{
    public class Program
    {
        static void Main(string[] args)
        {
            if (GameInformer.ChooseRole() == 0)
            {
                Operator.MainStart(Operator.CreateUser(), RockPaperScissor.Operator.CreateBot(1));
            }
            else
            {
                Operator.MainStart(RockPaperScissor.Operator.CreateBot(1), RockPaperScissor.Operator.CreateBot(2));
            }
        }
    }
}