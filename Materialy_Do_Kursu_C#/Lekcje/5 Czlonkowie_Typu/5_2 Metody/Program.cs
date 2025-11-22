using System;

namespace _5_2_Metody
{
    class Program
    {
        static void Main(string[] args)
        {
            Karta karta1 = new Karta();
            karta1.DodajOcene(4);
            karta1.DodajOcene(8);
            karta1.DodajOcene(6);

            KartaStatystyki stat = karta1.ObliczStatystyki();

            WypiszWynik("Średnia", stat.SredniaOcena);
            WypiszWynik("Najnizsza", (int)stat.NajnizszaOcena);
            WypiszWynik("Najwyzsza", (long)stat.NajwyzszaOcena);

            WypiszWynik("Test", (long)55, 1, 1);
            WypiszWynik("Params", 3f, 5f, 6f, 8f);
            WypiszWynik("Params", 3, 5, 6, 8);
            WypiszWynik("Params", 3, 5, 6, 8, 96, 656, 4,46,35,7);
            WypiszWynik("Params", 3, 5, 9);
        }

        static void WypiszWynik(string opis, float wynik)
        {
            Console.WriteLine(opis + " : " + wynik);
        }

        static void WypiszWynik(string opis, int wynik)
        {
            Console.WriteLine(opis + " : " + wynik);
        }

        static void WypiszWynik(string opis, long wynik)
        {
            Console.WriteLine(opis + " : " + wynik);
        }

        static void WypiszWynik(string opis, long wynik, int test, int test2)
        {
            Console.WriteLine(opis + " : " + wynik);
        }

        static void WypiszWynik(string opis, params float[] wynik)
        {
            Console.WriteLine(opis + " : " + wynik[0] + " - " + wynik[1] + " - " + wynik[2] + " - " + wynik[3]);
        }

        static void WypiszWynik(string opis, params int[] wynik)
        {
            if (wynik.Length > 3)
            {
                Console.WriteLine(opis + " : " + wynik[0] + " - " + wynik[1] + " - " + wynik[2] + " - " + wynik[3]);
            }
            Console.WriteLine(opis + " : " + wynik[0]);
        }
    }
}
