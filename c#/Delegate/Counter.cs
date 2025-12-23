using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Metadata.Ecma335;
using System.Text;
using System.Threading.Channels;
using System.Threading.Tasks;

namespace Delegate
{
    public class Counter
    {
       
        private delegate int NumbersAction(int x,int y);


        public void FirstAddThenSubtract(int x,int y)
        {
            NumbersAction numbersAction = Add;
            Console.WriteLine(numbersAction(x,y));

            numbersAction = Subtract;
            Console.WriteLine(numbersAction(x,y));
        }

       
        
        private static int Add(int x,int y) => x+y;    
        private static int Subtract(int x,int y) => x-y;
    }
}
