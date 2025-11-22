using System;

namespace _2_3_Zasieg_Zmiennych
{
    class Program
    {
        static void Main(string[] args)
        {

            if (true)
            {
                int zmienna = 10;
                var wynik = 100 + zmienna;
            }

           
        }

        long liczba = 50;

        public int zmiennaPubliczna;
        internal int zmiennaInternal;
        int zmiennaPrywatna;



        public void Metoda1()
        {
            var zmienna1 = liczba;
        }

        public void Metoda2()
        {
            var zmienna1 = liczba;
        }

        public void Metoda3()
        {
            var zmienna1 = liczba;
        }
    }
}
