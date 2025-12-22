namespace BMIcalculator
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            User user1= new User();
            user1.AskForData();
            user1.CountBMI();
            user1.PrintInfo();

        }
    }
}
