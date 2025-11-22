namespace _3_5_Konstruktor
{
    class Osoba
    {
        string imie;
        string nazwiskol;
        string miasto;
        string ulica;
        int wiek;


        public Osoba()
        {
            imie = "Default";
            nazwiskol = "Default";
            miasto = "Default";
            ulica = "Default";
            wiek = 10;
            System.Console.WriteLine("Zadziałał konstruktor domyslny");
        }

        public Osoba(string imie, string nazwisko, string miasto, string ulica, int wiek)
        {
            this.imie = imie;
            this.nazwiskol = nazwisko;
            this.miasto = miasto;
            this.ulica = ulica;
            this.wiek = wiek;
            System.Console.WriteLine("Zadziałał konstruktor 5 parametrowy");
        }

        public Osoba(string imie, string nazwisko, string miasto)
        {
            this.imie = imie;
            this.nazwiskol = nazwisko;
            this.miasto = miasto;
            System.Console.WriteLine("Zadziałał konstruktor 3 parametrowy");
        }

        public Osoba(string imie, string nazwisko) : this(imie,nazwisko, "Katowice", "Mila 16", 18)
        {
            System.Console.WriteLine("Zadziałał konstruktor 2 parametrowy");
        }
    }
}
