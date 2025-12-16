namespace BankApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            BankAccount bankAccount1 = new BankAccount("Marysia",11000);
            BankAccount bankAccount2 = new BankAccount("Kasia",8700);

            bankAccount1.Deposit(3400);
            bankAccount1.Withdraw(1367);

            bankAccount2.Deposit(200);
            bankAccount2.Withdraw(320);


            Console.WriteLine(bankAccount1.ShowInfo());
            Console.WriteLine(bankAccount2.ShowInfo());

            bankAccount1.Transfer(bankAccount2, 100);

            Console.WriteLine(bankAccount1.ShowInfo());
            Console.WriteLine(bankAccount2.ShowInfo());


        }
    }
}
