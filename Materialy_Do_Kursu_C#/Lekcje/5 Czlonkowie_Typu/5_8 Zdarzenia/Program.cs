using System;

namespace _5_8_Zdarzenia
{
    class Program
    {
        static void Main(string[] args)
        {
            Karta karta = new Karta();
            karta.ZmianaNazwy += KiedyZmianaNazwy;
            karta.ZmianaNazwy += KiedyZmianaNazwy2;
            karta.ZmianaNazwy += KiedyZmianaNazwy3;
            karta.ZmianaNazwy += KiedyZmianaNazwy3;
            karta.ZmianaNazwy += KiedyZmianaNazwy3;
            karta.ZmianaNazwy += KiedyZmianaNazwy4;
            karta.ZmianaNazwy += KiedyZmianaNazwy5;
            karta.ZmianaNazwy -= KiedyZmianaNazwy3;


            karta.Nazwa = "karta Marcina";
            karta.Nazwa = "karta Jacka";

            Console.WriteLine(karta.Nazwa);
        }

        private static void KiedyZmianaNazwy5(object sender, ZmianaNazwyEventArgs args)
        {
            Console.WriteLine("--------------------");
        }

        private static void KiedyZmianaNazwy4(object sender, ZmianaNazwyEventArgs args)
        {
            Console.WriteLine("++++++++++++++++++++++++++++++");
        }

        private static void KiedyZmianaNazwy3(object sender, ZmianaNazwyEventArgs args)
        {
            Console.WriteLine("CzeSC");
        }

        private static void KiedyZmianaNazwy2(object sender, ZmianaNazwyEventArgs args)
        {
            Console.WriteLine("*************************");
        }

        private static void KiedyZmianaNazwy(object sender, ZmianaNazwyEventArgs args)
        {
            Console.WriteLine($"Zmiana nazwy z { args.IstniejacaNazwa } na { args.NowaNazwa }");
        }
    }
}
