using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Numerics;


NumberPrinter printer = new NumberPrinter();
NumberFilter filter = new NumberFilter();

List<int> listOfNumbers = [1, 2, 3, 4, 5, 6,12,46,89, 7, 8, 9, 10, 11,];

List<int> nextList = [1, 2, 3,4, 5, 6, 7, 8, 9,10,11,]; 

printer.printInfo(listOfNumbers, num => Console.WriteLine(num));
Console.WriteLine("----------------------------------------");
printer.printInfo(nextList, num => Console.WriteLine(num));

List<int> newListOfFilteredNumbersFromNextList = filter.filterMethod(nextList, x => x % 2 == 0);


printer.printInfo(newListOfFilteredNumbersFromNextList, num => Console.WriteLine("Prazefiltrowana liczba " + num));


List<double> randomList = NumberMixer.GenerateRandomNumbersList();
System.Console.WriteLine("Wygenerowana lista: ");
printer.printInfo(randomList,n => Console.WriteLine(n+" "));



class NumberPrinter
{
    public void printInfo<T>(List<T> list, Action<T> action)
    {
        foreach (T num in list)
        {
            action(num);
        }
    }

   
}
class NumberFilter
{
    public List<T> filterMethod<T>(List<T> list, Predicate<T> predicate)
    {

        var result = new List<T>();

        foreach (T num in list)
        {
            if (predicate(num))
            {
                result.Add(num);
            }
        }
        return result;

    }

  
}
class NumberMixer
{    public static List<double> GenerateRandomNumbersList()
    {
        List<double> newList = new List<double>();
        Random random = new Random();
        {
            for (int i = 0; i < 10; i++)
            {
                newList.Add(random.NextDouble());
            }
            
        }
        return newList;
    }
}
