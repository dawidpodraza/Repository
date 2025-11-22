using System;


namespace _5_2_Metody
{
    public class Metody
    {

        public void WriteAsByte(int value)
        {
            byte[] bytes = BitConverter.GetBytes(value);

            foreach (byte b in bytes)
            {
                Console.Write("0x{0:x2} ", b);
            }
        }


    }
}
