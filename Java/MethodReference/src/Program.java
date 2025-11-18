import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>(List.of("Marian", "Kuba", "Janusz", "Waldek"));

        Collections.sort(listOfNames,String::compareToIgnoreCase);

        System.out.println(listOfNames);
    }
}
