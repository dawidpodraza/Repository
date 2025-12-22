using CarShop;

namespace UnitTest
{
    public class UnitTest1
    {
        [Fact]
        public void TestCarChangePrice()
        {
            Car car1 = new Car("E61","BMW",12000);
            car1.ChangePrice(13550);

            Assert.Equal(13550,car1.Price);
        }
    }
}