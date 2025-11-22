using System.Collections.Generic;
using System.Linq;
using System;

namespace _7_2_Try_Catch
{
    public class Karta
    {
        // Konstruktor
        public Karta()
        {
            oceny = new List<float>();
        }


        // Stan (zmienne - pola)
        private List<float> oceny;
        private string _nazwa;

        // Właściwość 
        public string Nazwa
        {
            get
            {
                return _nazwa.ToUpper();
            }
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    throw new ArgumentNullException("Nazwa karty nie może być pusta");
                }

                if (_nazwa != value)
                {
                    ZmianaNazwyEventArgs args = new ZmianaNazwyEventArgs();
                    args.IstniejacaNazwa = _nazwa;
                    args.NowaNazwa = value;

                    ZmianaNazwy(this, args);
                }

                _nazwa = value;

            }
        }

        // Zdarzenie
        public event ZmianaNazwyDelegat ZmianaNazwy;


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
