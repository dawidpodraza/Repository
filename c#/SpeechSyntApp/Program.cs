using System;
using System.Speech.Synthesis;


namespace SpeechSyntApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Naciśni dowolny klawisz !");
            string anyKey = Console.ReadLine();
            SpeechSynthesizer synt = new SpeechSynthesizer();
            synt.Speak("Cześć Gabrysia");


        }
    }
}
