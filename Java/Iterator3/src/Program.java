import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    static void main(String[] args) {
        Person person1 = new Person("Hanna","Nowak",31);
        Person person2 = new Person("Kamil","Kowalsi",41);
        Person person3 = new Person("Janusz","Christ",13);
        Person person4 = new Person("Anna","Lost",19);
        Person person5 = new Person("Wiktoria","Wartoń",29);

        Map<String,Person> personsMap = new TreeMap<>();

        personsMap.put(person1.getLastName(),person1);
        personsMap.put(person2.getLastName(),person2);
        personsMap.put(person3.getLastName(),person3);
        personsMap.put(person4.getLastName(),person4);
        personsMap.put(person5.getLastName(),person5);

        Collection<Person> values = personsMap.values();
        Iterator<Person> iterator = values.iterator();

        while(iterator.hasNext()){
            if(iterator.next().getAge()<18){
                iterator.remove();
            }
        }

        for (Person value : values) {
            System.out.println(value);
        }
    }
}
