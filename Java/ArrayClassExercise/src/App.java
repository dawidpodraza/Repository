import java.util.Arrays;

public class App {
    static void main(String[] args) {
        PersonDatabase personDatabase1 = new PersonDatabase();
        Person person1 = new Person("Marek","Nowak","891123334");
        Person person2 = new Person("Kamil","Kowal","907823123");
        Person person3 = new Person("Janusz","Kowalski","12312323");
        Person person4 = new Person("Arek","Zamet","123323123");


        personDatabase1.add(person1);
        personDatabase1.add(person2);
        personDatabase1.add(person3);
        personDatabase1.add(person4);

        personDatabase1.printInfo();
        personDatabase1.get(2);
        System.out.println(personDatabase1.size());
        personDatabase1.remove(person1);
        personDatabase1.printInfo();

        // dorobić remove ze wprowadzenie Comparator lub Comparable !!!
    }
}
