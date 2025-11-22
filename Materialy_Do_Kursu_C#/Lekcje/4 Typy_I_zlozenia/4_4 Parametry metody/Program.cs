using System;
using System.Collections.Generic;
using System.Linq;

namespace _4_4_Parametry_metody
{
    class Program
    {
        static void UstawNazwe(Karta karta)
        {
            karta = new Karta();
            karta.Nazwa = "Karta Marcina";
        }

        static void ZwiekszNumer(int numer)
        {
            numer = 42;
        }


        static void Main(string[] args)
        {
            Karta karta1 = new Karta();
            Karta karta2 = karta1;

            UstawNazwe(karta2);
            Console.WriteLine(karta2.Nazwa);


            int x1 = 6;
            ZwiekszNumer(x1);
            Console.WriteLine(x1);
        }
    }
}
