using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Speech.Synthesis;

namespace SpeechApp2
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Naciśni dowolny klawisz !");
            string anyKey = Console.ReadLine();
            SpeechSynthesizer synt = new SpeechSynthesizer();
            synt.Speak("Cześć to ja twój program z syntezatorem mowy");
            


        }
    }
}

    