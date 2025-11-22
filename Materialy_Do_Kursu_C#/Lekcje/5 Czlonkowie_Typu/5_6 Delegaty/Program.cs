using System;


namespace _5_6_Delegaty
{
    class Program
    {     
        static void Main(string[] args)
        {
            Wiadomosc wiadomosc = new Wiadomosc();

            Wypisz wypisz = new Wypisz(wiadomosc.WypiszWiadomosc);

            wypisz += new Wypisz(metoda);

            wypisz("Witaj Marcin !");
        }

        private static void metoda(string wiadomosc)
        {
            Console.WriteLine(wiadomosc + "!!!!!!!!!!!!!!!");
        }
    }
}
