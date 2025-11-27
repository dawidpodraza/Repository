import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    static void main(String[] args) {

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Marek",22,2));
        listOfStudents.add(new Student("Janusz",21,4));
        listOfStudents.add(new Student("Malwina",20,3));

        System.out.println(listOfStudents);

        listOfStudents.sort(Comparator.comparing(Student::grade).reversed());
        System.out.println(listOfStudents);

    }
}
