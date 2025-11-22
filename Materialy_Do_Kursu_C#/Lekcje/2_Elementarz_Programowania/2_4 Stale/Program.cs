using System;

namespace _2_4_Stale
{
    class Program
    {
        const float PI = 3.1415f;
        const float R = 5f;
        const string nazwa = "Nazwa firmy ABC";

        static void Main(string[] args)
        {
           

        }

        public void ObliczPoleKola()
        {

            var wynik = PI * R * R;
        }

        public void Metoda(string nazwaFirmy)
        {

        }

        public void Metoda2()
        {
            Metoda(nazwa);
        }
    }
}
