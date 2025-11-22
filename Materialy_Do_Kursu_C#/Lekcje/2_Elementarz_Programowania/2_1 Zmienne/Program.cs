namespace _2_1_Zmienne
{
    class Program
    {
        static void Main(string[] args)
        {
            // deklaracja zmiennej
            int liczbaCalkowita;

            // inicjalizacja zmiennej
            liczbaCalkowita = 20;

            // deklaracja i inicjalizacja zmiennej
            int liczba = 20;

            // zmiana wartości zmiennej (przypisanie do zmiennej)
            liczba = 500;
            liczbaCalkowita = 600;



            // Podstawowe typy danych w C#
            byte zmiennaMala = byte.MaxValue;                                   // 1 bajt

            short liczbaCalowitaKrotka = 5;                                     // 2 bajty
            liczbaCalowitaKrotka = short.MaxValue;

            int liczbaCalkowita2 = 500;                                         // 4 bajty
            liczbaCalkowita2 = int.MaxValue;

            long liczbaCalkowitaDluga = 500000;                                 // 8 bajtów
            liczbaCalkowitaDluga = long.MinValue;



            float liczbaZmiennoprzecinkowaPojedynczejPrecyzji = 400.55F;        // 4 bajty
            liczbaZmiennoprzecinkowaPojedynczejPrecyzji = float.MaxValue;

            double liczbaZmiennoprzecinkowaPodwojnejPrecyzji = 500000.55;       // 8 bajtów
            liczbaZmiennoprzecinkowaPodwojnejPrecyzji = double.MinValue;



            bool taknie = true;                                                 // 1 bajt

            char znak = 'A';                                                    // 2 bajty

            string tekst = "To jest zmienna tekstowa";                          //  "abc"  -  2 bajty * ilosc znaków = 6 bajtów
        }
    }
}
