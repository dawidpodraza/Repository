using System;
using System.Speech.Synthesis;

namespace _4_8_Złożenia
{
    class Program
    {
        static void Main(string[] args)
        {

            // Assemblies (złożenia) - to pliki .exe lub .dll


            SpeechSynthesizer synt = new SpeechSynthesizer();
            synt.Speak("Cześć Marcin");
        }
    }
}
