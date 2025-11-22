namespace TestProgram
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Podaj pierwszą liczbę: ");
            int first = int.Parse(Console.ReadLine());
            Console.WriteLine("Podaj drugą liczbę: ");
            int second = int.Parse(Console.ReadLine());
            int sum = first + second;
            Console.WriteLine("Suma liczb "+first+", "+second+" wynosi "+sum);
            Console.ReadLine();
            //test comment
            //test comment 2

        }
    }
}
