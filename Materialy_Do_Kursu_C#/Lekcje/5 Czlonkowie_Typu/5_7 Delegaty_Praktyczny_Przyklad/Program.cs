using System;

namespace _5_7_Delegaty_Praktyczny_Przyklad
{
    class Program
    {
        static void Main(string[] args)
        {
            Karta karta = new Karta();
            karta.ZmianaNazwy += new ZmianaNazwyDelegat(KiedyZmianaNazwy);
            karta.ZmianaNazwy += new ZmianaNazwyDelegat(KiedyZmianaNazwy2);
            karta.ZmianaNazwy += new ZmianaNazwyDelegat(KiedyZmianaNazwy3);
            karta.ZmianaNazwy += new ZmianaNazwyDelegat(KiedyZmianaNazwy3);
            karta.ZmianaNazwy += new ZmianaNazwyDelegat(KiedyZmianaNazwy3);
            karta.ZmianaNazwy += new ZmianaNazwyDelegat(KiedyZmianaNazwy4);
            karta.ZmianaNazwy += new ZmianaNazwyDelegat(KiedyZmianaNazwy5);
            karta.ZmianaNazwy -= new ZmianaNazwyDelegat(KiedyZmianaNazwy3);


            karta.Nazwa = "karta Marcina";
            karta.Nazwa = "karta Jacka";

            Console.WriteLine(karta.Nazwa);

        }

        private static void KiedyZmianaNazwy5(string istniejacaNazwa, string nowaNazwa)
        {
            Console.WriteLine("--------------------");
        }

        private static void KiedyZmianaNazwy4(string istniejacaNazwa, string nowaNazwa)
        {
            Console.WriteLine("++++++++++++++++++++++++++++++");
        }

        private static void KiedyZmianaNazwy3(string istniejacaNazwa, string nowaNazwa)
        {
            Console.WriteLine("CzeSC");
        }

        private static void KiedyZmianaNazwy2(string istniejacaNazwa, string nowaNazwa)
        {
            Console.WriteLine("*************************");
        }

        private static void KiedyZmianaNazwy(string istniejacaNazwa, string nowaNazwa)
        {
            Console.WriteLine($"Zmiana nazwy z { istniejacaNazwa } na { nowaNazwa }");
        }
    }
}
