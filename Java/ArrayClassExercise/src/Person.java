import java.util.Objects;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private String pesel;

    public Person(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(o==null){
            return 0;
        }
        return this.firstName.compareTo(o.firstName);
    }
}
