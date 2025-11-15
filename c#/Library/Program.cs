using BooksInLibrary;
using System.Threading.Channels;

namespace Library
{
    internal class Program
    {
        static void Main(string[] args)
        {
            BookCollection library = new BookCollection();

            library.booksCollection.Add(BookActions.addBook());
            library.booksCollection.Add(BookActions.addBook());
            library.booksCollection.Add(BookActions.addBook());

            Console.WriteLine("------------------------------");
            library.printInfo();
            Console.WriteLine("------------------------------");
            library.searchBook();
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
    class BookActions
    {
        public static Book addBook()
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
    }
    class BookCollection
    {
        public List<Book> booksCollection = new List<Book>();


        public void printInfo()
        {
            foreach (var item in booksCollection)
            {
                Console.WriteLine(item);
            }
        }

        public void searchBook()
        {
            Console.WriteLine("Podaj tytuł książki ktrej szukasz:");
            string name = Console.ReadLine();
            bool found = false;

            foreach(var item in booksCollection)
            {
                if(item.Name == name)
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
    }

}
