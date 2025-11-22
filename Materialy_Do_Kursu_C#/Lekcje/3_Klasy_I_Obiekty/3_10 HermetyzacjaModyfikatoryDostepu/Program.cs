using System;

namespace _3_KartaOcenFilmow
{
    class Program
    {
        static void Main(string[] args)
        {
            Karta karta = new Karta();

            karta.DodajOcene(6);
            karta.DodajOcene(8);
            karta.DodajOcene(3);
            karta.DodajOcene(4.4f);
            karta.DodajOcene(5.7f);

            KartaStatystyki statystyki =  karta.ObliczStatystyki();

            Console.WriteLine("Srednia ocena : " + statystyki.SredniaOcena);
            Console.WriteLine("Najwyzsza ocena : " + statystyki.NajwyzszaOcena);
            Console.WriteLine("Najnizsza ocena : " + statystyki.NajnizszaOcena);



        }
    }
}