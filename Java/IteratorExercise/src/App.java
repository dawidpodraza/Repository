import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class App {
    static void main(String[] args) {
        Map <String,Person> personsMap = new TreeMap<>();

        personsMap.put("Nowak",new Person("Adam","Nowak",42));
        personsMap.put("Kowalski",new Person("Janusz","Kowalski",22));
        personsMap.put("Abratkiewicz",new Person("Kamil","Abratkiewicz",32));

        System.out.println(personsMap);

        Iterator<Person> stringIterator = personsMap.values().iterator();
        while(stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
    }
}
