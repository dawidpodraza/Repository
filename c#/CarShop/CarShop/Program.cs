using CarShop;


namespace CarShop
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Car car1 = new Car("E61", "BMW", 25000);
            Car car2 = new Car("Transporter", "VW", 55000);
            Car car3 = new Car("A5", "Audi", 34500);
            Car car4 = new Car("E60", "BMW", 23000);

            CarShop carshop1 = new CarShop();
            carshop1.AddCar(car1);
            carshop1.AddCar(car2);
            carshop1.AddCar(car3);
            carshop1.AddCar(car4);


            foreach (var car in carshop1.Cars)
            {
                Console.WriteLine(car);
            }
        }
    }
}