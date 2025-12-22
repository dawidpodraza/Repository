using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BMIcalculator
{
    internal class User
    {
        public string Name { get; set; }
        public double Weight { get; set; }
        public double Height { get; set; }

        private double BMI= 0;

        public void AskForData()
        {
            Console.WriteLine("Podaj imie:");
            Name = Console.ReadLine();
            Console.WriteLine("Podaj wzrost:");
            Height = double.Parse(Console.ReadLine());
            Console.WriteLine("Podaj wagę:");
            Weight = double.Parse(Console.ReadLine());

        }

        public void CountBMI()
        {
            BMI =  Weight / (Height * Height);
        }

        public void PrintInfo()
        {
            Console.WriteLine(Name+" twoje BMI wynosi "+BMI);
            if(BMI>=18.5 & BMI <= 24.9)
            {
                Console.WriteLine("Waga prawidłowa");
            }else if(BMI> 24.9)
            {
                Console.WriteLine("Nadwaga");
            }
            else
            {
                Console.WriteLine("Niedowaga");
            }
        }
    }
}
