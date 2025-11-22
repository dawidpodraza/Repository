using System;


namespace _2_11_Kolekcje
{
    class Program
    {
        static void Main(string[] args)
        {

            int[] tablica1 = new int[10];

            int[] liczby = { 1, 2, 3, 4, 8, 9, 34, 54, 67 };

            tablica1[0] = 1;
            tablica1[1] = 2;
            tablica1[2] = 3;
            tablica1[3] = 4;
            tablica1[4] = 5;
            tablica1[5] = 6;
            tablica1[6] = 7;
            tablica1[7] = 8;
            tablica1[8] = 9;
            tablica1[9] = 10;

            foreach (var item in liczby)
            {
                Console.WriteLine(item);
            }

            //for (int i = 0; i <= tablica1.Length; i++)
            //{
            //    Console.WriteLine(tablica1[i]);
            //}
        }
    }
}
