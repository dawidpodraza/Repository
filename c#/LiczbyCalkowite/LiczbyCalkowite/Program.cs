namespace LiczbyCalkowite
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Questioner questioner1 = new Questioner();
            questioner1.AskForNumbers();

            Console.WriteLine("Największa liczba "+ questioner1.HighestNumber());
            Console.WriteLine("Najmniejsza liczba "+ questioner1.LowestNumber());
        }
    }
}