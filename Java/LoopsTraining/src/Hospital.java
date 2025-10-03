import java.util.Scanner;

public class Hospital {

    Patient[] patients = new Patient[3];
    private int index=0;

    public int getIndex() {
        return index;
    }

    void add() {
        Patient patient = new Patient();


            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj imie:");
            patient.setFirstName(scanner.nextLine());
            System.out.println("Podaj nazwiwko:");
            patient.setLastName(scanner.nextLine());
            System.out.println("Podaj pesel:");
            patient.setPesel(scanner.nextLine());
            patients[index] = patient;
            index++;

    }

    void showQueue() {
        System.out.println("Tak wygląda kolejka pacjentów: ");
        for (Patient i : patients) {
            System.out.println(i.getLastName());
        }
    }
}
