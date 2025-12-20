namespace Monkey
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello SIR!");

            Count count = new Count();
            int result =count.AddTwo(5, 5);
            Console.WriteLine(result);
            

        }
    }
}
