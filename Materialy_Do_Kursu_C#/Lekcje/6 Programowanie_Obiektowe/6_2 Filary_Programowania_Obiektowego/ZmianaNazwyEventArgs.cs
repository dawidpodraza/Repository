using System;

namespace _6_2_Filary_Programowania_Obiektowego
{
    public class ZmianaNazwyEventArgs : EventArgs
    {
        public string IstniejacaNazwa { get; set; }
        public string NowaNazwa { get; set; } 
    }
}
