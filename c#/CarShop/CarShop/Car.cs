namespace CarShop
{
    public class Car
    {
        public string Model { get; }
        public string Brand { get; }
        public decimal Price { get; set; }

        public Car(string model, string brand, decimal price)
        {
            Model = model;
            Brand = brand;
            Price = price;
        }

        public override bool Equals(object? obj)
        {
            return obj is Car car &&
                   Model == car.Model &&
                   Brand == car.Brand &&
                   Price == car.Price;
        }

        public override int GetHashCode()
        {
            return HashCode.Combine(Model, Brand, Price);
        }

     

        public override string ToString()
        {
            return $"{Brand} {Model} - {Price} zł";
        }

        public decimal ChangePrice(decimal newPrice)
        {
            Price = newPrice;
            return Price;
        }
    }
}
