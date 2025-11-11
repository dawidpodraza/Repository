import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>(List.of("Adam", "Kasia", "Ewa", "Olek"));

        listOfNames.forEach(name -> System.out.println("Helo " + name));

        System.out.println("-----------------------------------------------------------");

        List<Integer> listOfNumbers = new ArrayList<>(List.of(1, 4, 7, 10, 13));

        listOfNumbers.stream()
                .filter(n -> n > 5)
                .forEach(n -> System.out.println(n));

        System.out.println("-----------------------------------------------------------");

        List<Integer> listOfNumbers2 = List.of(1, 2, 3, 4, 5);
        List<Integer> listOfNumbers2Multiplied = listOfNumbers2.stream()
                .map(n -> n * 10)
                .toList();
        System.out.println(listOfNumbers2Multiplied);


        System.out.println("-----------------------------------------------------------");


        List<String> listOfWords = new ArrayList<>(List.of("banana", "apple", "kiwi"));
        listOfWords.sort((n,n2)-> n.compareTo(n2));
        listOfWords.forEach(n -> System.out.println(n));


    }

    //    ### Ćwiczenie 1 – Wypisywanie imion
    //1. Masz listę imion: Adam, Ewa, Kasia, Olek.
    //2. Użyj metody forEach z lambdą, żeby dla każdego imienia wypisać: "Hello, <imię>!".
    //            3. Lambda przyjmuje jeden argument (imię) i wykonuje System.out.println.



    //        ### Ćwiczenie 2 – Filtrowanie liczb
    //1. Masz listę liczb: 1, 4, 7, 10, 13.
    //            2. Chcesz wypisać tylko liczby większe niż 5.
    //            3. Użyj stream() i metody filter z lambdą (Predicate) do sprawdzenia warunku > 5.
    //            4. Na końcu użyj forEach, żeby wypisać wynik.


    //### Ćwiczenie 3 – Modyfikacja listy
    //1. Masz listę liczb: 1, 2, 3, 4, 5.
    //2. Chcesz stworzyć nową listę, w której każda liczba będzie pomnożona przez 10.
    //3. Użyj stream() i metody map z lambdą (Function) do przekształcenia wartości.
    //4. Na końcu wypisz nową listę.


    //    ### Ćwiczenie 4 – Sortowanie słów
    //1. Masz listę słów: banana, apple, kiwi.
    //2. Chcesz posortować je alfabetycznie.
    //            3. Użyj metody sorted z lambdą (Comparator) lub compareTo.
    //            4. Wypisz posortowaną listę.




}
