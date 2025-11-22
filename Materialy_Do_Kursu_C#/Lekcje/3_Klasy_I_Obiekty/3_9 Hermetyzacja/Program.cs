using System;
using System.Collections.Generic;
using System.Linq;

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
            karta.DodajOcene(6.4f);

            KartaStatystyki statystyki =  karta.ObliczStatystyki();

            Console.WriteLine("Srednia ocena : " + statystyki.SredniaOcena);
            Console.WriteLine("Najwyzsza ocena : " + statystyki.NajwyzszaOcena);
            Console.WriteLine("Najnizsza ocena : " + statystyki.NajnizszaOcena);

            Karta karta2 = new Karta();

            karta2.DodajOcene(1);
            karta2.DodajOcene(3);
            karta2.DodajOcene(4);
            karta2.DodajOcene(5.4f);
            karta2.DodajOcene(7.7f);
            karta2.DodajOcene(8.4f);

            statystyki = karta2.ObliczStatystyki();

            Console.WriteLine("Srednia ocena : " + statystyki.SredniaOcena);
            Console.WriteLine("Najwyzsza ocena : " + statystyki.NajwyzszaOcena);
            Console.WriteLine("Najnizsza ocena : " + statystyki.NajnizszaOcena);



        }
    }
}