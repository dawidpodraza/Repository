using System;
using System.Windows.Forms;

namespace CyberpunkCalculator
{
    static class Program
    {
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            // Tutaj uruchamiamy nasz cyberpunkowy formularz
            Application.Run(new CyberpunkForm());
        }
    }
}
