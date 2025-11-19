import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Program {
    static void main(String[] args) throws FileNotFoundException {
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
//
//        List<Integer> filtered = numbers.stream()
//                .filter(x->x%2==0)
//                .toList();
//
//        System.out.println(filtered);

        Scanner scanner = new Scanner(new File("tekst.txt"));
        Stream<String> wordsToRead = scanner.tokens();
        wordsToRead.forEach(System.out::println);

    }
}
