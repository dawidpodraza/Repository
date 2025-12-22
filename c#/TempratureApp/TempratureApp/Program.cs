namespace TempratureApp
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Podaj stopnie w Celcjuszach:");
            decimal tempToConvertInCelsius = decimal.Parse(Console.ReadLine());

            decimal tempInFarhenheit = ConvertToFarhenheit(tempToConvertInCelsius);

            Console.WriteLine("Temperatur w stopniach F wynosi: "+tempInFarhenheit);
        }

        public static decimal ConvertToFarhenheit(decimal tempToConvertInCelsius)
        {
            return tempToConvertInCelsius * 1.8m + 32;
        }
    }
}
