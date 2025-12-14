namespace KartaOcenFilmow
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Karta karta = new Karta();
            
            karta.DodajOcene(6);
            karta.DodajOcene(4);
            karta.DodajOcene(3.3f);
            karta.DodajOcene(5);

            

            Karta kartaUzytkownika = new Karta();

            

            for (; ; )
            {
                Console.WriteLine("Podaj ocene z zakresu 1 - 10");
                Console.WriteLine("Wyjście wybierz liczbę 666");
                float ocena;
                bool wynik= float.TryParse(Console.ReadLine(), out ocena);

                if(!wynik)
                {
                    Console.WriteLine("to nie jest liczba");
                }
                else if (ocena > 0 && ocena <= 10)
                {
                    kartaUzytkownika.DodajOcene(ocena);
                }
                else if(ocena == 666)
                {
                    break;
                }
                else
                {
                    Console.WriteLine("Liczba z poza zakresu");
                }
                

            }

            float srednia = kartaUzytkownika.ObliczSrednia();
            float max = kartaUzytkownika.NajwiekszaOcena();
            float min = kartaUzytkownika.NajnizszaOcena();

            Console.WriteLine("Srednia ocena "+ srednia);
            Console.WriteLine("Majlepsza ocena "+ max);
            Console.WriteLine("Najgorsza ocena "+ min);

            
            
        }
    }
    
}
