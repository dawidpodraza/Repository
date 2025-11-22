using System;


namespace _7_1_Throw
{

        //      Throw 
        //
        //          - użyj throw, aby zgłośić wyjątek
        //
        //          - wyjątki zapewniają bezpieczną i strukturalną obsługę błędów w .Net


    class Throw
    {

        static void Metoda()
        {
            Console.WriteLine("Podajliczbę");
            int wiek = int.Parse(Console.ReadLine());




            if (wiek == 20)
            {
                throw new ArgumentException("20 jest nie dozwoloną wartością do wprowadzenia");
            }




        }
    }
}
