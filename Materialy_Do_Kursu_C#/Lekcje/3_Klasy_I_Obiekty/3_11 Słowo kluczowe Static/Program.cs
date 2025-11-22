using System;

namespace _3_11_Słowo_kluczowe_Static
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

            KartaStatystyki statystyki = karta.ObliczStatystyki();

            Console.WriteLine("Srednia ocena : " + statystyki.SredniaOcena);
            Console.WriteLine("Najwyzsza ocena : " + statystyki.NajwyzszaOcena);
            Console.WriteLine("Najnizsza ocena : " + statystyki.NajnizszaOcena);




            Karta karta2 = new Karta();
            Karta karta3 = new Karta();
            Karta karta4 = new Karta();
            Karta karta5 = new Karta();
            Karta karta6 = new Karta();

            Console.WriteLine("Ilosc kart : " + Karta.Licznik);

            //Console.WriteLine("Ilosc kart : " + karta4.Licznik);
        }
    }
}
