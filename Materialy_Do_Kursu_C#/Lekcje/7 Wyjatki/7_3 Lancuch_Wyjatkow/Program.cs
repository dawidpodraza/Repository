using System;


namespace _7_3_Lancuch_Wyjatkow
{
    class Program
    {
        static void Main(string[] args)
        {
            Karta karta = new Karta();
            karta.ZmianaNazwy += KiedyZmianaNazwy;
            karta.ZmianaNazwy += KiedyZmianaNazwy2;

            try
            {
                Console.WriteLine("Proszę podaj nazwe karty");
                karta.Nazwa = Console.ReadLine();
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
                Console.WriteLine("");
            }
            catch(NullReferenceException)
            {
                Console.WriteLine("Coś poszło nie tak, mamy problem");
            }
            catch (Exception)
            {
                Console.WriteLine("Błąd ogólny");
            }


           
            karta.Nazwa = "karta Marcina";
            karta.Nazwa = "karta Jacka";
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
