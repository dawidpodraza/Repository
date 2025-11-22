using System;

namespace _4_9_Projekt
{
    public class Program
    {
        static void Main(string[] args)
        {
            Karta karta1 = new Karta();
            karta1.DodajOcene(4);
            karta1.DodajOcene(8);

            KartaStatystyki stat = karta1.ObliczStatystyki();

            Console.WriteLine(stat.SredniaOcena);

        }
    }
}
