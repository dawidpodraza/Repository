import java.lang.reflect.Array;
import java.util.Arrays;

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


            if (persons[i].equals(p)) {
                persons[i] = null;


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
