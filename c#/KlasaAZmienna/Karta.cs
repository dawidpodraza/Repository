using System;
using System.Collections.Generic;
using System.Text;

namespace KlasaAZmienna
{
    class Karta
    {

        
        //pola
        List<float> oceny = new List<float>();

        



        //metody

        /// <summary>
        /// Dodaje nową ocene do listy ocen
        /// </summary>
        /// <param name="ocena">nowa ocena</param>
        public void DodajOcene(float ocena)
        {
            oceny.Add(ocena);
        }

        /// <summary>
        /// Obliczanie średniej z listy ocen
        /// </summary>
        /// <returns>srednia ocena</returns>
        public float ObliczSrednia()
        {
            //float suma = 0;
            //float srednia = 0;
            //foreach (var item in oceny)
            //{
            //    suma = suma + item;
            //}
            //srednia = suma / oceny.Count();
            //return srednia;

            return oceny.Average();
        }

        /// <summary>
        /// Zwraca najmniejszą ocenę
        /// </summary>
        /// <returns>najmniejsz ocena</returns>
        public float NajnizszaOcena()
        {
            //float min = float.MaxValue;

            //foreach (var item in oceny)
            //{
            //    if (min < item)
            //    {
            //        min = item;
            //    }
            //}
            //return min;

            return oceny.Min();
        }

        /// <summary>
        /// Zwraca największą ocenę
        /// </summary>
        /// <returns>największa ocena</returns>
        public float NajwiekszaOcena()
        {
            //float max = float.MinValue;

            //foreach (var item in oceny)
            //{
            //    if (max > item)
            //    {
            //        max = item;
            //    }

            //}
            //return max;
            return oceny.Max();
        }

       
    }
}
