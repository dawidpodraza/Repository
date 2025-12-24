import java.security.Key;
import java.util.*;

public class Program {
    static void main(String[] args) {

        List<Person> personsList = new ArrayList<>();

        Person person1 = new Person("Jan", "Kowalski", 42);
        Person person2 = new Person("Maria", "Cygan", 32);
        Person person3 = new Person("Justyna", "Kozioł", 21);
        Person person4 = new Person("Kamil", "Maser", 17);
        Person person5 = new Person("Janusz", "Nowak", 56);


        personsList.add(person1);
        personsList.add(person2);
        personsList.add(person3);
        personsList.add(person4);
        personsList.add(person5);

        Iterator<Person> iterator = personsList.iterator();

        while(iterator.hasNext()){
            if(iterator.next().getLastName().equals("Cygan")){
                iterator.remove();
            }
        }

        System.out.println(personsList);
    }
}
