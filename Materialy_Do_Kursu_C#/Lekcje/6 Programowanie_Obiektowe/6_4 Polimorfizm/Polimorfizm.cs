using System;

namespace _6_4_Polimorfizm
{


    //      Polimorfizm == "wiele kształtów"
    //
    //              -  jedna zmienna może wskazywać na różne typy obiektów
    //              -  obiekty mogą zachowywać się inaczej w zależności od ich typu


    public class Zwierze : Object
    {
        public virtual void Iedz()
        {
            // jakiś kod ... 
        }
    }

    public class Sak : Zwierze
    {

        public override void Iedz()
        {
            // jakiś kod ...

            base.Iedz();
        }
    }

    public class Kot : Sak
    {

        public override void Iedz()
        {
            // jakiś kod ...

            base.Iedz();
        }
    }
}
