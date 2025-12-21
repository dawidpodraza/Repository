using System;
using System.Collections.Generic;
using System.Text;

namespace CarShop
{
    public class CarShop
    {
        private List<Car> _cars = new List<Car>();

        public IReadOnlyList<Car> Cars => _cars;

        public CarShop(List<Car> cars)
        {
            _cars = cars;
        }

        public CarShop()
        { }

        public void AddCar(Car car)
        {
            _cars.Add(car);
        }
        public void RemoveCar(Car car)
        {
            _cars.Remove(car);
        }


    }
}
