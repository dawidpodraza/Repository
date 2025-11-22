using System;

namespace _2_2_Var
{
    class Program
    {
        static void Main(string[] args)
        {
            byte zmiennaMala;                                       // 1 bajt     
            short liczbaCalowitaKrotka;                             // 2 bajty
            int liczbaCalkowita2;                                   // 4 bajty
            long liczbaCalkowitaDluga;                              // 8 bajtów

            float liczbaZmiennoprzecinkowaPojedynczejPrecyzji;      // 4 bajty
            double liczbaZmiennoprzecinkowaPodwojnejPrecyzji;       // 8 bajtów     

            bool taknie;                                            // 1 bajt
            char znak;                                              // 2 bajty
            string tekst = "To jest zmienna tekstowa";              //  "abc"  -  2 bajty * ilosc znaków = 6 bajtów


            var zmiennaVar = true;
            zmiennaVar = false;
        }

        long liczba = 50;

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
