import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

import static java.util.Arrays.sort;

public class PersonDatabase {
    private int INITIAL_CAPACITY = 1;
    private int index = 0;
    private Person[] persons = new Person[INITIAL_CAPACITY];


    public void add(Person p) {
        if (index == persons.length) {
            persons = Arrays.copyOf(persons, persons.length * 2);
        }
        persons[index] = p;
        index++;
    }

    public void remove(Person p) {
        for (int i = 0; i < persons.length; i++) {
            if (Objects.equals(persons[i], p)) {
                persons[i] = null;
                break; // jeśli zakładasz, że nie ma duplikatów
            }
        }
        for (int i = 0; i < persons.length - 1; i++) {
            if (persons[i] == null) {
                // przesuwamy elementy w lewo
                System.arraycopy(persons, i + 1, persons, i, persons.length - i - 1);
                persons[persons.length - 1] = null;
                break; // kończymy, bo obsłużyliśmy pierwszy null
            }
        }

    }

    public void get(int index) {
        System.out.println("Pod indexem nr " + index + " jest: " + persons[index].toString());
    }

    public int size() {
        int index = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                index++;
            }
        }
        return index;
    }

    public Person[] getPersons() {
        return persons;
    }


    public void printInfo() {
        for (Person person : persons) {
            System.out.println(person);
        }

    }


}
