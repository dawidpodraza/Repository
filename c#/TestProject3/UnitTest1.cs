using BankApp;
using NUnit.Framework;
namespace TestProject3
{
    public class Tests
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void Test1()
        {
            BankAccount account = new BankAccount("Marian", 1200);
            Assert.AreEqual("Marian", account.OwnerName);
        }
    }
}
