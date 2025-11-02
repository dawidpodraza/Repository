using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestAppForTraining
{
    internal class Person : IEmployer
    {
        private String firstName;
        private String lastName;
        private int age;

        public Person(string firstName, string lastName, int age)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String FirstName { get { return firstName; } }
        public String LastName { get { return lastName; } }
        public int Age { get { return age; } }

        public void PrintInfo()
        {
            System.Console.WriteLine(FirstName + " " + LastName);
        }

        public void StartWorking()
        {
            Console.WriteLine("Working in progress ...");
        }
    }
}
