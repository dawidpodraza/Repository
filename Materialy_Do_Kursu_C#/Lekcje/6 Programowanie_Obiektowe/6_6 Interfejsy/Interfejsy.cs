using System;


namespace _6_6_Interfejsy
{


    //          Interfejsy 
    //
    //                -  Interfejsy nie zawierają szczegółów implementacji (definiuje tylko sygnaturę metod, zdarzeń, właściwości)
    //
    //                -  Typ może implementować wiele interfejsów




    public interface IOkno
    {

        string Tytul { get; set; }


        void Rysuj();


        void Otwórz();

    } 
}
