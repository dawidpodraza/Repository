using BooksInLibrary;
using System.Threading.Channels;
using System.Xml.Serialization;

namespace Library
{
    internal class Program
    {
        static void Main(string[] args)
        {
            BookCollection library = new BookCollection();

            library.clientActionToDo();
        }
    }
}
namespace BooksInLibrary
{
    class Book
    {
        private string _name;
        private string _author;
        private int _yearOfRealase;
        private int _iD;

        public Book(string name, string author, int yearOfRealase, int iD)
        {
            Name = name;
            Author = author;
            YearOfRealase = yearOfRealase;
            ID = iD;
        }

        public string Name { get => _name; set => _name = value; }
        public string Author { get => _author; set => _author = value; }
        public int YearOfRealase { get => _yearOfRealase; set => _yearOfRealase = value; }
        public int ID { get => _iD; set => _iD = value; }

        public override bool Equals(object? obj)
        {
            return obj is Book book &&
                   _name == book._name &&
                   _author == book._author &&
                   _yearOfRealase == book._yearOfRealase &&
                   _iD == book._iD &&
                   Name == book.Name &&
                   Author == book.Author &&
                   YearOfRealase == book.YearOfRealase &&
                   ID == book.ID;
        }

        public override int GetHashCode()
        {
            return HashCode.Combine(_name, _author, _yearOfRealase, _iD, Name, Author, YearOfRealase, ID);
        }

        public override string? ToString()
        {
            return Name + " " + Author;
        }
    }
    class BookCollection
    {
        public List<Book> listOfBooks = new List<Book>();

        public void clientActionToDo()
        {
            bool exit = false;

            while (exit == false)
            {
                Console.WriteLine("--------------------------\nCo chcesz zrobić ? \n1-dodaj książkę\n2-Szukaj książki\n3-Usuń książkę\n4-Pokaż zawartość księgarni\n5-koniec\n--------------------------");
                string choice = Console.ReadLine();
                switch (choice)
                {
                    case "1":
                        listOfBooks.Add(addBook());
                        break;
                    case "2":
                        searchBook();
                        break;
                    case "3":
                        removeBook();
                        break;
                    case "4":
                        printInfo();
                        break;
                    case "5":
                        Console.WriteLine("Do zobaczenia!");
                        exit = true;
                        break;
                    default:
                        Console.WriteLine("Zły wybór spróbuj ponownie");
                        break;

                }
            }

        }
    
        private void printInfo()
        {
            foreach (var item in listOfBooks)
            {
                Console.WriteLine(item);
            }
        }


        private void searchBook()
        {
            Console.WriteLine("Podaj tytuł książki której szukasz:");
            string name = Console.ReadLine();
            bool found = false;

            foreach (var item in listOfBooks)
            {
                if (item.Name == name)
                {
                    Console.WriteLine("Podana książka jest dostępna");
                    found = true;
                    break;
                }
            }

            if (!found)
            {
                Console.WriteLine($"Książka {name} nie jest dostępna");
            }
        }

        private Book addBook()
        {

            Console.WriteLine("Podaj tytuł książki:");
            string bookname = Console.ReadLine();
            Console.WriteLine("Podaj autora:");
            string authorName = Console.ReadLine();
            Console.WriteLine("Podaj rok wydania:");
            int yearOfRealase = int.Parse(Console.ReadLine());
            Console.WriteLine("Podaj ID:");
            int ID = int.Parse(Console.ReadLine());

            return new Book(bookname, authorName, yearOfRealase, ID);

        }

        private void removeBook()
        {
            Console.WriteLine("Podaj ID książki którą chcesz usunąć:");
            int id = int.Parse(Console.ReadLine());
            bool found = false;

            foreach (var item in listOfBooks)
            {
                if (item.ID == id)
                {
                    listOfBooks.Remove(item);
                    found = true;
                    Console.WriteLine($"Usunięto książkę {item.Name}");
                    break;
                }


            }
            if (!found)
            {
                Console.WriteLine("Nie ma takiej ksiązki w bibliotece");
            }

        }
    }
}


