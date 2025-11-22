using System;

namespace _6_5_Klasy_Abstrakcyjne
{
    public class LepszaKarta : Karta
    {
        public override KartaStatystyki ObliczStatystyki()
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
