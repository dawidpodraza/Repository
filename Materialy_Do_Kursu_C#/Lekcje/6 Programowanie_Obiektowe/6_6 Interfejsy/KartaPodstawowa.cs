namespace _6_6_Interfejsy
{
    public abstract class KartaPodstawowa : IKartaPodstawowa
    {
        // Zachowania (metody)

        /// <summary>
        /// Dodaje nową ocene do listy ocen
        /// </summary>
        /// <param name="ocena">nowa ocena</param>
        public abstract void DodajOcene(float ocena);

        /// <summary>
        /// Obliczmy statystyki dla ocen
        /// </summary>
        /// <returns>KartaStatystyki(srednia, minimalna, maksymalna ocena)</returns>
        public abstract KartaStatystyki ObliczStatystyki();



        // Stan (zmienne - pola)
        protected string _nazwa;



        // Właściwość 
        public string Nazwa
        {
            get
            {
                return _nazwa.ToUpper();
            }
            set
            {
                if (!string.IsNullOrEmpty(value))
                {
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
        }



        // Zdarzenie
        public event ZmianaNazwyDelegat ZmianaNazwy;
    }
}
