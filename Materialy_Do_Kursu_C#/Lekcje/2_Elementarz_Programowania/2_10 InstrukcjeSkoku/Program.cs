using System;

namespace _2_10_InstrukcjeSkoku
{
    class Program
    {
        static void Main(string[] args)
        {

            int[] liczby = { 1, 2, 4, 8, 12, 25, 46, 65, 78, 94 };


            #region
            // uzycie instrukcji goto
            foreach (var liczba in liczby)
            {
                if (liczba == 2)
                {
                    Console.WriteLine("Liczba to : {0}", liczba);
                    goto etykieta;
                    Console.WriteLine("Test");
                }
            }


            // uzycie instrukcji break, continue
            foreach (var liczba in liczby)
            {
                Console.WriteLine("Liczba wynosi : {0}", liczba);

                if (liczba == 2)
                {
                    Console.WriteLine("Liczba to : {0}", liczba);
                    continue;
                    Console.WriteLine("Test");
                }

                if (liczba == 4)
                {
                    Console.WriteLine("Liczba wynosi 4");
                    break;
                    Console.WriteLine("Test");
                }
            }

            etykieta:
            Console.WriteLine("Hello");
     
            #endregion

            Metoda(liczby);

            Console.WriteLine("Koniec programu");
        }

        private static void Metoda(int[] liczby)
        {
            foreach (var liczba in liczby)
            {

                if (liczba == 8)
                {
                    Console.WriteLine("Liczba wynosi 8");
                    return;
                    Console.WriteLine("Test");
                }

            }

            Console.WriteLine("Test");
        }
    }
}
