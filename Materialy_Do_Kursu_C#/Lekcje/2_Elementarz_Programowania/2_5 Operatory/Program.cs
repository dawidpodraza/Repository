
namespace _2_5_Operatory
{
    class Program
    {
        static void Main(string[] args)
        {
            int liczba1 = 10;
            int liczba2 = 20;
            bool liczba3 = true;
            bool liczba4 = false;

            // operatory matematyczne
            var wynik1 = liczba1 + liczba2;
            var wynik2 = liczba1 - liczba2;
            var wynik3 = liczba1 * liczba2;
            var wynik4 = liczba1 / liczba2;
            var wynik5 = liczba1 % liczba2;

            var wynik6 = liczba1++;     //operator inkrementacji
            var wynik7 = liczba1--;     //operator dekramentacji
            var wynik8 = ++liczba1;     //operator inkrementacji
            var wynik9 = --liczba1;     //operator dekramentacji


            // operatory relacyjne   (prawda, fałsz (true,false))
            var wynik10 = (liczba1 == liczba2);
            var wynik11 = (liczba1 != liczba2);
            var wynik12 = (liczba1 > liczba2);
            var wynik13 = (liczba1 < liczba2);
            var wynik14 = (liczba1 >= liczba2);
            var wynik15 = (liczba1 <= liczba2);


            // operatory logiczne
            var wynik16 = (liczba3 && liczba4);     // suma logiczna
            var wynik17 = (liczba3 || liczba4);     // alternatywa logiczna
            var wynik18 = (!liczba3);               // negacja logiczna

            // operatory matematyczne sztuczki
            liczba1 += 4;                           //liczba1 = liczba1 + 4;
            liczba1 -= 4;                           //liczba1 = liczba1 - 4;
            liczba1 *= 4;                           //liczba1 = liczba1 * 4;
            liczba1 /= 4;                           //liczba1 = liczba1 / 4;
        }
    }
}
