
namespace ClassAndObjects
{
    internal class Program
    {
        static void Main(string[] args)
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
            public string firstName { get; set; }
            public string lastName { get; set; }
            public int age { get; set; }




            public Person(string firstName, string lastName, int age)
            {
                this.firstName = firstName;
                this.lastName = lastName;
                this.age = age;
            }

            public Person()
            {
            }

            public override bool Equals(object? obj)
            {
                return obj is Person person &&
                       firstName == person.firstName &&
                       lastName == person.lastName &&
                       age == person.age;
            }

            public override int GetHashCode()
            {
                return HashCode.Combine(firstName, lastName, age);
            }

            public override string? ToString()
            {
                return firstName+" "+lastName;
            }
        }
    }
}
