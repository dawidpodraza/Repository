using System;
using System.Collections.Generic;
using System.Linq;


namespace _4_5_Parametry_metody_Ref_Out
{
    class Program
    {
        static void UstawNazwe(out Karta karta)
        {
            karta = new Karta();
            karta.Nazwa = "Karta Marcina";
        }

        static void ZwiekszNumer(out int numer)
        {
            numer = 42;
        }


        static void Main(string[] args)
        {
            Karta karta1 = new Karta();
            Karta karta2;

            UstawNazwe(out karta2);
            Console.WriteLine(karta2.Nazwa);


            int x1;
            ZwiekszNumer(out x1);
            Console.WriteLine(x1);
        }
    }
}
