using System;
using System.Collections.Generic;

namespace _2_12_Kolekcje_Lista
{
    class Program
    {
        static void Main(string[] args)
        {

            List<long> naszaLista = new List<long>();

            // dodanie elementu do listy zawsze na koniec
            naszaLista.Add(200);
            naszaLista.Add(50);
            naszaLista.Add(300);
            naszaLista.Add(40);
            naszaLista.Add(100);

            // modyfikacja wartosci elemenu na okreslonej pozycji
            naszaLista[0] = 1;

            // dodanie elementu do listy na okreslonej pozycji
            naszaLista.Insert(0, 11);

            // usuniecie elementów z listy które spełniają warunek
            naszaLista.RemoveAll(x => x > 100);

            // usuniecie elementu z listy o okreslonej pozycji
            naszaLista.RemoveAt(0);


            foreach (var item in naszaLista)
            {
                Console.WriteLine(item);
            }

        }
    }
}
