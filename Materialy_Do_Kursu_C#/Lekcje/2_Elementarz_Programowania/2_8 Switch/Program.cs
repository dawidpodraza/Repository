using System;

namespace _2_8_Switch
{
    class Program
    {
        private static string imie;

        static void Main(string[] args)
        {
            Console.WriteLine("Podaj swoje imie : ");
            imie = Console.ReadLine();

            switch (imie)
            {
                case "Marcin":
                    Metoda1();
                    Metoda2();
                    break;
                case "Tomek":
                    Metoda3();
                    Metoda4();
                    Metoda5();
                    break;
                case "Jacek":
                    Metoda6();
                    Metoda7();
                    break;
                default:
                    Metoda7();
                    break;
            }

        }

        private static void Metoda7()
        {
            Console.WriteLine("Jesteś w metodzie 7");
        }

        private static void Metoda6()
        {
            Console.WriteLine("Jesteś w metodzie 6");
        }

        private static void Metoda5()
        {
            Console.WriteLine("Jesteś w metodzie 5");
        }

        private static void Metoda4()
        {
            Console.WriteLine("Jesteś w metodzie 4");
        }

        private static void Metoda3()
        {
            Console.WriteLine("Jesteś w metodzie 3");
        }

        private static void Metoda2()
        {
            Console.WriteLine("Jesteś w metodzie 2");
        }

        private static void Metoda1()
        {
            Console.WriteLine("Jesteś w metodzie 1");
        }
    }
}
