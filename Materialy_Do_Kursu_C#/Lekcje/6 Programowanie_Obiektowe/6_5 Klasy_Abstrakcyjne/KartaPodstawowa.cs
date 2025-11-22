namespace _6_5_Klasy_Abstrakcyjne
{
    public abstract class KartaPodstawowa
    {
        public abstract void DodajOcene(float ocena);

        public abstract KartaStatystyki ObliczStatystyki();

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
