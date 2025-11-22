using System.IO;


namespace _7_4_Finally
{

        //      Finalizacja (Finally)
        //
        //          -  Ostatnia klauzula dodaje kod finalizacji
        //
        //          -  wykonuje się nawet, gdy kontrola wykracza poza zakres



    class Finally
    {

        static void Metoda()
        {

            StreamWriter plik = new StreamWriter("mojplik.txt");


            try
            {
                plik.WriteLine("Piszemy do pliku");
            }
            finally
            {
                plik.Close();
            }



            using (StreamWriter plik2 = new StreamWriter("mojplik.txt"))
            {
                plik2.WriteLine("Piszemy do pliku");
            }

        }
    }
}
