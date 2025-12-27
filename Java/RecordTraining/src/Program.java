import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Person> listOfPeople = new ArrayList<>();
        try {
            List<String> list = Files.readAllLines(Path.of("persons.csv"));

            for (String element : list) {
                String[] elements = element.split(";");
                Person p = new Person(
                        elements[0],
                        elements[1],
                        Integer.parseInt(elements[2])

                );
                listOfPeople.add(p);
            }

            for (Person listOfPerson : listOfPeople) {
                System.out.println(listOfPerson);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
