using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _6_3_Dziedziczenie
{
    public class LepszaKarta : Karta
    {
        public KartaStatystyki ObliczStatystyki()
        {
            Console.WriteLine("LepszaKarta::ObliczStatystyki");

            float najnizsza = float.MaxValue;

            foreach (var ocen in oceny)  
            {
                najnizsza = Math.Min(ocen, najnizsza);
            }

            oceny.Remove(najnizsza);

            return base.ObliczStatystyki();
        }
    }
}
