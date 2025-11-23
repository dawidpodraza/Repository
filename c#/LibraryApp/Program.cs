using System.Diagnostics;
using System.Reflection;

namespace LibraryApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Witaj w ksiegarni !");
            Library library = new Library();

            bool stopApp = false;

            while (stopApp == false)
            {
                Console.WriteLine("1-dodaj , 2-usun , 3-szukaj , 4-pokaz wszystkie , 5-zakoncz");
                string choice = Console.ReadLine();

                switch (choice)
                {
                    case "1":
                        Console.WriteLine("Podaj tytul: ");
                        string title = Console.ReadLine();
                        Console.WriteLine("Podaj autora: ");
                        string author = Console.ReadLine();
                        Console.WriteLine("Podaj rok wydania: ");
                        int year = int.Parse(Console.ReadLine());

                        library.AddBook(new Book(title, author, year));

                        break;
                    case "2":
                        Console.WriteLine("Podaj tytul do usuniecia: ");
                        string titleToRemove = Console.ReadLine();

                        for (int i = 0; i < library.books.Count; i++)
                        {
                            Book? book = library.books[i];
                            if (book.Title.Equals(titleToRemove))
                            {
                                library.RemoveBook(book);
                                Console.WriteLine("Usunieto ksiazke " + book.Title);
                            }
                            else
                            {
                                Console.WriteLine("Nie ma takiej ksiazki !");
                            }
                        }
                        break;
                    case "3":
                        Console.WriteLine("Wpisz tytul do wyszukania: ");
                        string titleToFind = Console.ReadLine();
                        
                        library.FindBook(titleToFind);
                        break;
                    case "4":
                        library.ShowAllBooks();
                        break;
                    case "5":
                        stopApp = true;
                        Console.WriteLine("Do zobaczenia ....");
                        break;
                }
            }
        }
    }

    class Book
    {
        public string Title { get; set; }
        public string Author { get; set; }
        public int Year { get; set; }

        public Book(string title, string author, int year)
        {
            Title = title;
            Author = author;
            Year = year;
        }

        private string GetInfo()
        {
            return Title + " " + Author;
        }
    }

    class Library
    {
        public List<Book> books = new List<Book>();


        public void AddBook(Book book)
        {
            books.Add(book);
        }
        public void RemoveBook(Book book)
        {
            books.Remove(book);
        }

        public void FindBook(string title)
        {

            foreach (var item in books)
            {
                if (item.Title == title)
                {
                    Console.WriteLine("ksiazka dostepna");
                    break;
                }   
            }
        }

        public void ShowAllBooks()
        {
            foreach (Book book in books)
            {
                Console.WriteLine(book.Title);
            }
        }
    }
}
