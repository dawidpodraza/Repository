using System;

namespace _6_5_Klasy_Abstrakcyjne
{
    public class ZmianaNazwyEventArgs : EventArgs
    {
        public string IstniejacaNazwa { get; set; }
        public string NowaNazwa { get; set; } 
    }
}
