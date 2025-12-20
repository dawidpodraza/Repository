using NUnit.Framework;


namespace TestProject
{
    public class Tests
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void SimpleTest()
        {
            int result = 1 + 1;
            Assert.AreEqual(2, result); // <- tu powinno działać
        }
        
    }
}
