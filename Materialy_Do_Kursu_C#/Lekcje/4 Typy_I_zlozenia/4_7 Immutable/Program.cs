using System;

namespace _4_7_Immutable
{
    class Program
    {
        static void Main(string[] args)
        {


            int zmienna = 4;
            zmienna = 100;

            DateTime data = new DateTime(2015, 10, 15);

            data = data.AddDays(3);
            Console.WriteLine(data);



            string name = "   Marcin  ";
            name = name.Trim();
            Console.WriteLine(name);

        }
    }
}
