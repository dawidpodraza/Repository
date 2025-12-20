namespace BankApp
{
    public class BankAccount
    {
        private readonly string _ownerName;
        private decimal _balance;

        public string OwnerName => _ownerName;
        public decimal Balance => _balance;

        public BankAccount(string ownerName, decimal balance)
        {
            _ownerName = ownerName;
            _balance = balance;
        }

        public void Deposit(decimal amount)
        {
            if (amount <= 0) throw new ArgumentException("Nie można wpłacić 0");
            _balance += amount;
        }

        public void Withdraw(decimal amount)
        {
            if (amount <= 0) throw new ArgumentException("Nie wypłacisz 0");
            if (amount > _balance) throw new ArgumentException("Nie masz tyle na koncie");
            _balance -= amount;
        }
    }
}
