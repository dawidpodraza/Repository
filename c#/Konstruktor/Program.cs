namespace Konstruktor
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Osoba osoba1 = new Osoba();
            Osoba osoba2 = new Osoba("Jan","Kowalski");
            Osoba osoba3 = new Osoba("Tomek", "Kowalski","Katowice");
            Osoba osoba4 = new Osoba("Kamil","Nowak","Czestochowa","103",15);
         }
    }
}
