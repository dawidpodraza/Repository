using System;


namespace _6_5_Klasy_Abstrakcyjne
{


    //          Klasy Abstrakcyjne 
    //
    //                -  Z klasy abstrakcyjnej nie można utworzyć instancji obiektu.
    //
    //                -  Klasa Abstrakcyjna może zawierać abstrakcyjnych członków.




    public abstract class Okno
    {


        public virtual string Tytul { get; set; } 


        public virtual void Rysuj()
        {
            // kod który rysuje okno ...
        }


        public abstract void Otwórz();

    } 
}
