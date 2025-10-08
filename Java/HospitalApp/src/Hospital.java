import java.util.Scanner;

public class Hospital {
    public Person[] employees = new Person[3];

    public void getInfo(){
        System.out.println("Pracownicy szpitala:");
        for (int i = 0; i < employees.length; i++) {
            employees[i].getInfo();
        }
    }


}
