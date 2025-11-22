using System.Collections.Generic;
using System.Linq;

namespace _3_11_Słowo_kluczowe_Static
{
    class Karta
    {
        public Karta()
        {
            oceny = new List<float>();
            Licznik++;
        }

        // Stan (zmienne - pola)
        private List<float> oceny;
        public static float MinOcena = 0;
        public static float MaxOcena = 10;
        public static long Licznik = 0;

        // Zachowania (metody)

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
