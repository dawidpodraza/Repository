using System;

namespace _5_4_Pola_Wlasciwosci
{
    public class Zwierze
    {

        // Pola (Fields) to zmienne zadeklarowane wewnatrz klasy, struktury.
        //      - pola mogą być tylko do odczytu.

        private string _nazwa;
        private string _nazwa2;
        private readonly string _readonly;


        // Konstruktor

        public Zwierze(string nazwa, string nazwa2, string pole)
        {
            _nazwa = nazwa;
            _nazwa2 = nazwa2;
            _readonly = pole;
        }


        // Właściwości (properties) są rozszerzeniem dla pól.
        //      używają akcesorów, dzięki czemu pola prywatne są dostępne z zewnątrz klasy.
        //      nie służą do przechowywania wartości
        //      przy pomocy acesorów właściwości mają dostęp do pól, które reprezentują
        //      Akcesory zaierają instrukcje do wykonania, które pozwalają na odczyt lub zapis wartości pola
        //      deklaracje właściwości mogą zawierać akcesory  get, set lub oba

        public string Nazwa
        {
            get { return _nazwa; }

            set
            {
                if (!String.IsNullOrEmpty(value))
                {
                    _nazwa = value;
                }
            }
        }

        // Właściwość tylko do zapisu
        public string Nazwa2
        {
            set
            {
                if (!String.IsNullOrEmpty(value))
                {
                    _nazwa2 = value;
                }
            }
        }

        // Właściwość tylko do odczytu
        public string Readonly
        {
            get { return _readonly; }
        }


        // właściwość automatyczna
        public int MyProperty { get; set; }
    }
}
