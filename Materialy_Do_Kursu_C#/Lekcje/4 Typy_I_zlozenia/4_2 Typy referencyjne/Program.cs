using System;
using System.Collections.Generic;
using System.Linq;


namespace _4_2_Typy_referencyjne
{
    class Program
    {
        static void Main(string[] args)
        {

            Karta karta1 = new Karta();
            Karta karta2 = karta1;

            karta1 = new Karta();
            karta1.Nazwa = "Karta Marcina";

            Karta karta3 = karta2;

            Console.WriteLine(karta2.Nazwa);
        }
    }
}
