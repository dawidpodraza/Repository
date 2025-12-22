namespace TaxApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            User user1= new User();
            user1.AskForIncome();
            user1.TaxCount();
            user1.PrintInfo();

        }
    }
}
