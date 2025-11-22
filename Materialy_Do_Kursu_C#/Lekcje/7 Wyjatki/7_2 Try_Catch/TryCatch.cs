using System;


namespace _7_2_Try_Catch
{


        //      Obsługa wyjątków
        //
        //          - obsługa wyjatków za pomocą konstrukcji  try  catch
        //
        //          - środowisko wykonawcze odszuka pasujący blok catch



    class TryCatch
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

                Console.WriteLine(ex.StackTrace);

                Console.WriteLine(ex.InnerException);
            }


        }













        private static void ObliczStatystyki()
        {
            throw new NotImplementedException();
        }
    }
}
