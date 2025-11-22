using System;


namespace _7_1_Throw
{
    class Program
    {
        static void Main(string[] args)
        {
            Karta karta = new Karta();
            karta.ZmianaNazwy += KiedyZmianaNazwy;
            karta.ZmianaNazwy += KiedyZmianaNazwy2;


            karta.Nazwa = "karta Marcina";
            karta.Nazwa = "karta Jacka";

            karta.Nazwa = null;
        }


        private static void KiedyZmianaNazwy(object sender, ZmianaNazwyEventArgs args)
        {
            Console.WriteLine($"Zmiana nazwy z { args.IstniejacaNazwa } na { args.NowaNazwa }");
        }

        private static void KiedyZmianaNazwy2(object sender, ZmianaNazwyEventArgs args)
        {
            Console.WriteLine("*************************");
        }
 
    }
}