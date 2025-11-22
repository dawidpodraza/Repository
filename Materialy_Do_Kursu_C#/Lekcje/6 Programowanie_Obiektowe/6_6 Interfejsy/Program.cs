using System;


namespace _6_6_Interfejsy
{
    class Program
    {
        static void Main(string[] args)
        {
            IKartaPodstawowa kartaOcen = UtworzKarte();

            kartaOcen.DodajOcene(4);
            kartaOcen.DodajOcene(8);
            kartaOcen.DodajOcene(6);
            kartaOcen.DodajOcene(3);

            KartaStatystyki statystyki = kartaOcen.ObliczStatystyki();

            Console.WriteLine("Srednia : " + statystyki.SredniaOcena);
            Console.WriteLine("Najnizsza : " + statystyki.NajnizszaOcena);
            Console.WriteLine("Najwyzsza : " + statystyki.NajwyzszaOcena);
        }

        private static IKartaPodstawowa UtworzKarte()
        {
            return new LepszaKarta();
        }
    }
}
