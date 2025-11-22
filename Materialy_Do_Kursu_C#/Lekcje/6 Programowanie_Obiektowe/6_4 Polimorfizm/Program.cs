using System;

namespace _6_4_Polimorfizm
{
    class Program
    {
        static void Main(string[] args)
        {
            Karta kartaOcen = UtworzKarte();

            kartaOcen.DodajOcene(4);
            kartaOcen.DodajOcene(8);
            kartaOcen.DodajOcene(6);
            kartaOcen.DodajOcene(3);

            KartaStatystyki statystyki = kartaOcen.ObliczStatystyki();

            Console.WriteLine("Srednia : " + statystyki.SredniaOcena);
            Console.WriteLine("Najnizsza : " + statystyki.NajnizszaOcena);
            Console.WriteLine("Najwyzsza : " + statystyki.NajwyzszaOcena);
        }

        private static Karta UtworzKarte()
        {
            return new LepszaKarta();
        }
    }
}
