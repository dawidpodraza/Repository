using System;

namespace _6_5_Klasy_Abstrakcyjne
{
    class Program
    {
        static void Main(string[] args)
        {
            KartaPodstawowa kartaOcen = UtworzKarte();

            kartaOcen.DodajOcene(4);
            kartaOcen.DodajOcene(8);
            kartaOcen.DodajOcene(6);
            kartaOcen.DodajOcene(3);

            KartaStatystyki statystyki = kartaOcen.ObliczStatystyki();

            Console.WriteLine("Srednia : " + statystyki.SredniaOcena);
            Console.WriteLine("Najnizsza : " + statystyki.NajnizszaOcena);
            Console.WriteLine("Najwyzsza : " + statystyki.NajwyzszaOcena);
        }

        private static KartaPodstawowa UtworzKarte()
        {
            return new LepszaKarta();
        }
    }
}
