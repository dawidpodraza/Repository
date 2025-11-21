import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    static void main(String[] args) throws IOException {


        String fileName = "text.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        List<String> listOfWorsFromTextFile = new ArrayList<>();

        String nextLine = null;
        while((nextLine = bufferedReader.readLine()) !=null){
            listOfWorsFromTextFile.add(nextLine);
        }

        System.out.println(listOfWorsFromTextFile);

        listOfWorsFromTextFile = listOfWorsFromTextFile.stream()
                .map(x->x.replace(",","").replace(".",""))
                .toList();

        System.out.println(listOfWorsFromTextFile);

        long numbersOfWordsWithS = listOfWorsFromTextFile.stream()
                .flatMap(line -> List.of(line.split("\\s+")).stream()) // tego nie rozumiem !!
                .filter(x->x.toLowerCase().startsWith("s"))
                .count();

        long numberOfWordWith5Letters = listOfWorsFromTextFile.stream()
                .flatMap(line -> List.of(line.split("\\s+")).stream()) // tego nie rozumiem !!
                .filter(word -> word.length() == 5)
                .count();

        System.out.println("Liczba wyrazów na \"s\" :"+numbersOfWordsWithS);
        System.out.println("Liczba wyrazów z 5 literami :"+numberOfWordWith5Letters);


    }



}
