using System;
using System.Collections.Generic;
using System.Linq;

namespace _3_KartaOcenFilmow
{
    class Karta
    {
        public Karta()
        {
            oceny = new List<float>();
        }

        // Stan (zmienne - pola)
        List<float> oceny;

        // Zachowania (metody)

        internal KartaStatystyki ObliczStatystyki()
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
            oceny.Add(ocena);
        }

        /// <summary>
        /// Obliczanie sredniej z listy ocen
        /// </summary>
        /// <returns>srednia ocena</returns>
        public float ObliczSrednia()
        {
            float suma = 0;
            float srednia = 0;

            foreach (var ocena in oceny)
            {
                suma += ocena;
            }

            srednia = suma / oceny.Count();

            return srednia;
        }

        /// <summary>
        /// Dostajemy najmniejsza ocene
        /// </summary>
        /// <returns>najmniejsza ocena</returns>
        public float NajnizszaOcena()
        {
            return oceny.Min();
        }

        /// <summary>
        /// Dostajemy najwieksza ocene
        /// </summary>
        /// <returns>najwieksza ocena</returns>
        public float NajwyzszaOcena()
        {
            return oceny.Max();
        }
    }
}
