using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TaxApp
{
    internal class User
    {
        public decimal Income { get; set; }

        public decimal Tax { get; set; }

        public void AskForIncome()
        {
            Console.WriteLine("Podaj dochod:");
            Income = decimal.Parse(Console.ReadLine());
        }

        public void TaxCount()
        {
            if (Income <= 120000)
            {
                Tax = (Income * 0.18m) - 556.02m;
            }
            else
            {
                Tax = 14839.02m + ((Income - 120000m) * 0.32m);
            }
        }
        public void PrintInfo()
        {
            Console.WriteLine("Podatek do zapaty "+Tax);
        }
    }
}
