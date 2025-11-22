using System;

namespace _2_7_If
{
    class Program
    {
        private static int wiek;

        static void Main(string[] args)
        {
            Console.WriteLine("Podaj swój wiek : ");
            wiek = int.Parse(Console.ReadLine());

            string test = wiek > 18 ? "Dorosły" : "Dziecko";
            Console.WriteLine(test);

            SprawdzanieWieku();
        }

        private static void SprawdzanieWieku()
        {
            if (wiek <= 8)
            {
                if (wiek < 4)
                {
                    Console.WriteLine("Twój wiek jest mniejszy lub równy 8");
                }

                Metoda1();
            }
            else if (wiek < 18)
            {
                Console.WriteLine("Twój wiek jest mniejszy od 18 ale wiekszy niz 8 lat");
                Metoda1();
                Metoda2();
            }
            else if (wiek < 50)
            {
                Metoda1();
                Metoda2();
            }
            else
            {
                Console.WriteLine("Masz sporo lat");
                Metoda1();
            }
        }

        private static void Metoda2()
        {
            Console.WriteLine("Czesc");
        }

        private static void Metoda1()
        {
            Console.WriteLine("Wiek wynosi " + wiek);
        }
    }
}
