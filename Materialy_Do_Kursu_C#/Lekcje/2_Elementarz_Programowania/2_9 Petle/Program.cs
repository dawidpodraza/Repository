using System;

namespace _2_9_Petle
{
    class Program
    {
        static void Main(string[] args)
        {
            int length = 10;
            int licznik = 0;
            int[] liczby = { 1, 2, 3, 5, 8, 9, 77, 45 };


            // petla FOR
            for (int i = 0; i < length; i++)
            {
                Console.WriteLine("Wartosc licznika : " + i);
            }


            //// petla while
            while (licznik < 5)
            {
                Console.WriteLine("Test" + licznik);
                licznik++;
            }


            // petla do while
            do
            {
                Console.WriteLine("Test" + licznik);
                licznik++;
            } while (licznik < 5);


            // petla foreach
            foreach (var liczba in liczby)
            {
                Console.WriteLine("Wartosc liczby : " + liczba);
            }
        }
    }
}
