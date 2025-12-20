using BankApp;
namespace TestProject1
{
    public class Tests
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void Test1ConstructorWorks()
        {
         BankAccount account1 = new BankAccount("Marian" ,1200);
            Assert.Equals("Marian", account1.OwnerName);
            

        }
    }
}
