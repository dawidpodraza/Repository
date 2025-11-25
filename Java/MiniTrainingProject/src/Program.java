import javax.imageio.metadata.IIOInvalidTreeException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Dawid",36));
        persons.add(new Person("Anna",16));
        persons.add(new Person("Kamil",43));
        persons.add(new Person("Janusz",18));
        persons.add(new Person("Natalia",28));
        persons.add(new Person("Marcin",6));

        List<Person> filteredPersons = filter(persons, x -> x.getAge() >= 18);

        List<Person> finalFilteredPersons = filteredPersons.stream()
                .filter(x -> x.getName().startsWith("D"))
                .filter(x -> x.getAge() > 30 && x.getAge() < 45)
                .toList();

        System.out.println(finalFilteredPersons);

    }

    public static <T> List<T> filter (List<T> list, Predicate<T> predicate){
        List<T> listOfNewPersons= new ArrayList<>();
        for (T t : list) {
            if(predicate.test(t)){
                listOfNewPersons.add(t);
            }
        }
        return listOfNewPersons;
    }
}
