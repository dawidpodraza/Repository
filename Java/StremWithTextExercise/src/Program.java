import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    static void main(String[] args)  {


        String fileName = "text.txt";
        BufferedReader bufferedReader = null;
        List<String> listOfWorsFromTextFile = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));

            String nextLine = null;
            while((nextLine = bufferedReader.readLine()) !=null){
                listOfWorsFromTextFile.add(nextLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println(listOfWorsFromTextFile);

        listOfWorsFromTextFile = listOfWorsFromTextFile.stream()
                .map(x->x.replace(",","").replace(".",""))
                .toList();

        System.out.println(listOfWorsFromTextFile);

        long numbersOfWordsWithS = listOfWorsFromTextFile.stream()
                .flatMap(x->Stream.of(x.split("\\s+"))) // do przećwiczenia i regex też
                .filter(x->x.toLowerCase().startsWith("s"))
                .count();

        long numberOfWordWith5Letters = listOfWorsFromTextFile.stream()
                .flatMap(x -> Stream.of(x.split("\\s+"))) // do przećwiczenia i regex też
                .filter(word -> word.length() == 5)
                .count();

        System.out.println("Liczba wyrazów na \"s\" :"+numbersOfWordsWithS);
        System.out.println("Liczba wyrazów z 5 literami :"+numberOfWordWith5Letters);

        System.out.println(numbersOfWordsWithS);
        System.out.println(numberOfWordWith5Letters);

    }



}
