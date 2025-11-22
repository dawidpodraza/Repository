using System;

namespace _7_3_Lancuch_Wyjatkow
{

        //      Łańcuchowa instrukcja catch
        //
        //          -  Umieść najbardziej specyficzny typ w pierwszej klauzuli Catch
        //
        //          -  System.Exception wyłapie wszystko (z wyjątkiem kilku specjalnych wyjątków)


    class LancuchWyjatkow
    {
        static void Metoda()
        {
            try
            {
                ObliczStatystyki();
                // ...
            }
            catch (DivideByZeroException ex)
            {
                Console.WriteLine(ex.Message);
                // ...
            }
            catch (ArgumentNullException ex)
            {
                Console.WriteLine(ex.Message);
                // ...
            }
            catch (FieldAccessException ex)
            {
                Console.WriteLine(ex.Message);
                // ...
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
                // ...
            }
        }













        private static void ObliczStatystyki()
        {
            throw new NotImplementedException();
        }
    }
}
