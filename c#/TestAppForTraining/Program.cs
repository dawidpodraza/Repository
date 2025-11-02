using LanguageExt;
using System.IO.IsolatedStorage;
using TestAppForTraining;

CompanyBase appleCompany = new CompanyBase();

for (int i = 0; i < appleCompany.employees.Length; i++)
{
    appleCompany.employees[i].PrintInfo();
}

Console.WriteLine("Podaj 1 liczbe: ");
int first = int.Parse(Console.ReadLine());

Console.WriteLine("Podaj 2 liczbe: ");

int second = int.Parse(Console.ReadLine());

Console.WriteLine("Wybierz działanie + - * / ");

char choice = Console.ReadKey().KeyChar;
Console.WriteLine();

if (choice == '+')
{
    Console.WriteLine(first + second);
}
else if (choice == '-')
{
    Console.WriteLine(first - second);
}
else if (choice == '*')
{
    Console.WriteLine(first * second);
}
else if (choice == '/')
{
    Console.WriteLine(first / second);
}
else
{
    Console.WriteLine("Zły wybór");
}


