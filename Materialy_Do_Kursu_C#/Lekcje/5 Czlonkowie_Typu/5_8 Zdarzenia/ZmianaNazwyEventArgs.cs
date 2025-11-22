using System;

namespace _5_8_Zdarzenia
{
    public class ZmianaNazwyEventArgs : EventArgs
    {
        public string IstniejacaNazwa { get; set; }
        public string NowaNazwa { get; set; } 
    }
}
