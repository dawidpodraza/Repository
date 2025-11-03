import java.util.ArrayList;
import java.util.List;

public class Application {
    static void main(String[] args) {


        List<Person> list1 = new ArrayList<>();

        list1.add(new Person("Marian","Paździoch"));
        list1.add(new Person("Kuba","Bury"));
        list1.add(new Person("Janek","Nowak"));
        list1.remove(1);

        for (Person person : list1) {
            System.out.println(person.toString());
        }
    }
}
