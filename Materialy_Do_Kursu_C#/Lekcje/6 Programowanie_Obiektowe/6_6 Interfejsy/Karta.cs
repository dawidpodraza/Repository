using System;
using System.Collections.Generic;
using System.Linq;

namespace _6_6_Interfejsy
{
    public class Karta :KartaPodstawowa
    {
        // Konstruktor
        public Karta()
        {
            oceny = new List<float>();
        }



        // Stan (zmienne - pola)
        protected List<float> oceny;  



        // Zachowania (metody)

        /// <summary>
        /// Obliczmy statystyki dla ocen
        /// </summary>
        /// <returns>KartaStatystyki(srednia, minimalna, maksymalna ocena)</returns>
        public override KartaStatystyki ObliczStatystyki()
        {
            Console.WriteLine("Karta::ObliczStatystyki");

            KartaStatystyki stat = new KartaStatystyki();

            float suma = 0;

            foreach (var ocena in oceny)
            {
                suma += ocena;
            }

            stat.SredniaOcena = suma / oceny.Count();
            stat.NajnizszaOcena = oceny.Min();
            stat.NajwyzszaOcena = oceny.Max();

            return stat;
        }

        /// <summary>
        /// Dodaje nową ocene do listy ocen
        /// </summary>
        /// <param name="ocena">nowa ocena</param>
        public override void DodajOcene(float ocena)
        {
            if (ocena >= 0 && ocena <= 10)
            {
                oceny.Add(ocena);
            }              
        }
    }
}
