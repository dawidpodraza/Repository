
namespace ClassAndObjects
{
    internal class Program
    {
        static void Main()
        {
            List<Person> listOfPersons = new List<Person>();
            listOfPersons.Add(new Person("Dawid", "Podraza", 45));
            listOfPersons.Add(new Person("Kamil", "Nowak", 34));
            listOfPersons.Add(new Person("Janusz", "Kowalski", 56));

            //listOfPersons.RemoveAt(0);
            listOfPersons.Reverse();

            foreach (Person person in listOfPersons)
            {
                Console.WriteLine(person);
            }
        }

        internal class Person
        {
            public string FirstName { get; }
            public string LastName { get; }
            public int Age { get; }




            public Person(string firstName, string lastName, int age)
            {
                this.FirstName = firstName;
                this.LastName = lastName;
                this.Age = age;
            }
            

            public override bool Equals(object? obj)
            {
                return obj is Person person &&
                       FirstName == person.FirstName &&
                       LastName == person.LastName &&
                       Age == person.Age;
            }

            public override int GetHashCode()
            {
                return HashCode.Combine(FirstName, LastName, Age);
            }

            public override string ToString()
            {
                return FirstName+" "+LastName;
            }
            
        }
    }
}
