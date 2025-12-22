using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.ExceptionServices;
using System.Text;
using System.Threading.Tasks;

namespace LiczbyCalkowite
{
    public class Questioner
    {
        public int First { get; set; }
        public int Second { get; set; }
        public int Third { get; set; }

        private List<int> _listOfNumbers = new List<int>();

        public IReadOnlyList<int> ListOfNumbers => _listOfNumbers;

        public void AskForNumbers()
        {
            Console.WriteLine("Podaj 3 liczy calkowite");
            First = int.Parse(Console.ReadLine());
            Second = int.Parse(Console.ReadLine());
            Third = int.Parse(Console.ReadLine());

            _listOfNumbers.Add(First);
            _listOfNumbers.Add(Second); 
            _listOfNumbers.Add(Third);
        }

        public int HighestNumber()
        {
           return _listOfNumbers.Max(x => x);
        }
        public int LowestNumber()
        {
            return _listOfNumbers.Min(x => x);
        }
    }
}
