import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static void main(String[] args) throws FileNotFoundException {
        Person firstPerson = new Person("Marek","Nowak",32);
        Person secondPerson = new Person("Janusz","Kowalski",22);

        System.out.println(firstPerson+" i "+secondPerson);

    }
}
