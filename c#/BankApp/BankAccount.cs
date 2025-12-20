using System;
using System.Collections.Generic;
using System.Text;

namespace BankApp
{
    public class BankAccount
    {
        private string _ownerName;
        private decimal _balance;
        private int _accountNumber;

       

        public string OwnerName => _ownerName;
        public decimal Balance => _balance;
        public int AccountNumber => _accountNumber;

        public static int nextAccountNumber;

        public BankAccount(string ownerName, decimal balance)
        {
            _ownerName = ownerName;
            _balance = balance;
        }

        /// <summary>
        /// "Wpłaca środki na konto"
        /// </summary>
        /// <param name="amount">Ilość pieniędzy do wpłaty</param>
        /// <exception cref="ArgumentException"></exception>
        public void Deposit(decimal amount)
        {
            if (amount <= 0)
            {
                throw new ArgumentException("Nie można wpłacić 0");
            }

            _balance += amount;
        }
        /// <summary>
        /// "Wypłaca środki z konta
        /// </summary>
        /// <param name="amount">Ilość pieniędzy do wypłaty</param>
        /// <exception cref="ArgumentException"></exception>
        public void Withdraw(decimal amount)
        {
            
            if (amount <= 0)
            {
                throw new ArgumentException("Nie wypłacisz 0");
            }
            else if(amount > _balance)
            {
                throw new ArgumentException("Nie masz tyle na koncie");
            }

            _balance -= amount;
        }
        /// <summary>
        /// Przelewa pieniądze na inne konto
        /// </summary>
        /// <param name="target">Konto na które chcesz przelać środki</param>
        /// <param name="amount">Ilość pieniędzy do przelania</param>
        public void Transfer(BankAccount target,decimal amount)
        {
            target.Deposit(amount);
            _balance-=amount;
            Console.WriteLine("Przelano "+amount+" na konto "+target.OwnerName);
        }
        /// <summary>
        /// Pokazuje stan konta
        /// </summary>
        /// <returns>Stan konta</returns>
        public decimal ShowInfo()
        {
            return _balance;
        }
    }
}
