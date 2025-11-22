using System;

namespace _2_13_Enum
{
    class Program
    {
        static void Main(string[] args)
        {
            Imiona imie = Imiona.Tomek;
            Console.WriteLine(imie);

            switch (imie)
            {
                case Imiona.Marcin:
                    Console.WriteLine(imie);
                    break;
                case Imiona.Tomek:
                    Console.WriteLine(imie);
                    break;
                case Imiona.Jacek:
                    Console.WriteLine(imie);
                    break;
                default:
                    break;
            }

            var wartosciEnuma = Enum.GetValues(typeof(Imiona));

            foreach (var item in wartosciEnuma)
            {
                Console.WriteLine(item);
            }
        }
    }

    enum Imiona
    {
        Marcin,
        Tomek, 
        Jacek
    }
}
