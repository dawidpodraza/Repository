using System;
using System.Collections.Generic;
using System.Text;

namespace Konstruktor
{
    internal class Osoba
    {
        string imie;
        string nazwisko;
        string miasto;
        string uilica;
        int wiek;

        public Osoba()
        {
            imie = "Default";
            nazwisko = "Default";
            miasto = "Default";
            uilica = "Default";
            wiek = 10;
            System.Console.WriteLine("Zadziałał konstruktor domyślny");
        }
        public Osoba(string imie, string nazwisko, string miasto, string ulica, int wiek)
        {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.miasto = miasto;
            this.uilica = ulica;
            this.wiek = wiek;
            System.Console.WriteLine("Zadziałał konstruktor z 5 parametrami");
        }

        public Osoba(string imie, string nazwisko, string miasto)
        {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.miasto = miasto;
            System.Console.WriteLine("Zadziałał konstruktor z 3 parametrami");
        }

        public Osoba(string imie, string nazwisko) :this(imie,nazwisko,"Czestochowa","103",15)
        {
            System.Console.WriteLine("Zadziałał konstruktor z 2 parametrami");
        }
    }
}
