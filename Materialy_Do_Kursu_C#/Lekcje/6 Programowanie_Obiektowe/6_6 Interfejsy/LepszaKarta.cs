using System;

namespace _6_6_Interfejsy
{
    public class LepszaKarta : Karta
    {

        /// <summary>
        /// Obliczmy statystyki dla ocen, nie uwzgledniajac najnizszej oceny
        /// </summary>
        /// <returns>KartaStatystyki(srednia, minimalna, maksymalna ocena)</returns>
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
