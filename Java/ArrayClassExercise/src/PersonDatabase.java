import java.lang.reflect.Array;
import java.util.Arrays;

public class PersonDatabase {
    private final int INITIAL_CAPACITY = 1;
    private Person[] persons = new Person[INITIAL_CAPACITY];
    private Person[] persons2;


    public void add(Person p) {
        persons2 = Arrays.copyOf(persons,persons.length*2);
        Arrays.fill(persons2,p);

    }

    public Person[] getPersons() {
        return persons;
    }

    public Person[] getPersons2() {
        return persons2;
    }

    public void printInfo() {
        for (Person person : persons2) {
            System.out.println(person);
        }

    }
}
