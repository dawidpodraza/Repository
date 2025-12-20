using Monkey;
namespace Test
{
    public class Tests
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void AddTwoTest()
        {
            Count count = new Count();

            int result = count.AddTwo(5, 5);
            Assert.AreEqual(10,result);
        }
    }
}