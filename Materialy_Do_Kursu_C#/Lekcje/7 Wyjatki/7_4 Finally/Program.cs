using System;
using System.IO;
namespace _7_4_Finally
{
    class Program
    {
        static void Main(string[] args)
        {

            StreamWriter plik = new StreamWriter("C:\\katalog\\mojplik.txt", true);

            try
            {
                Console.WriteLine("Podaj imie");
                string imie = Console.ReadLine();

                plik.WriteLine(imie);
                plik.WriteLine("Piszemy do pliku");
            }
            finally
            {
                plik.Close();
            }

            using (StreamWriter plik2 = new StreamWriter("C:\\katalog\\mojplik.txt", true))
            {
                plik2.WriteLine("Piszemy do pliku Dopisujemy !!!!!!");
            }

        }
    }
}
