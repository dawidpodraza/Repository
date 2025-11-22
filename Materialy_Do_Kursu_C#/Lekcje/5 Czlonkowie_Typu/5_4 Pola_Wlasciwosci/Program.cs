using System;

namespace _5_4_Pola_Wlasciwosci
{
    class Program
    {
        static void Main(string[] args)
        {
            Karta karta1 = new Karta();
            karta1.DodajOcene(4);
            karta1.DodajOcene(8);
            karta1.DodajOcene(6);

            karta1.Nazwa = "karta Marcina";
            karta1.Nazwa = null;
            karta1.Nazwa = "";

            Console.WriteLine(karta1.Nazwa); 

        }
    }
}
