using System.Collections.Generic;
using System.Linq;

namespace _4_5_Parametry_metody_Ref_Out
{
    class Karta
    {
        public Karta()
        {
            oceny = new List<float>();
        }

        // Stan (zmienne - pola)
        private List<float> oceny;
        public string Nazwa;

        // Zachowania (metody)

        /// <summary>
        /// Obliczmy statystyki dla ocen
        /// </summary>
        /// <returns>KartaStatystyki(srednia, minimalna, maksymalna ocena)</returns>
        public KartaStatystyki ObliczStatystyki()
        {
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
        public void DodajOcene(float ocena)
        {
            if (ocena >= 0 && ocena <= 10)
            {
                oceny.Add(ocena);
            }              
        }
    }
}
