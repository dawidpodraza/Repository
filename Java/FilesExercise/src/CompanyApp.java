import java.io.*;
import java.util.Scanner;

public class CompanyApp {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee.askForPersonalData();
        Employee employee1 = new Employee(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble());
        scanner.nextLine();
        Employee.askForPersonalData();
        Employee employee2 = new Employee(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble());
        scanner.nextLine();
        Employee.askForPersonalData();
        Employee employee3 = new Employee(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble());

        Company company1 = new Company();
        company1.addEmployee(employee1);
        company1.addEmployee(employee2);
        company1.addEmployee(employee3);
        company1.showEmployess();

        String employess = "employess.txt";
        FileWriter file;
        try {
            //Zapis do pliku
            file = new FileWriter(employess);
            file.write(String.valueOf(company1.writePersons()));
            file.close();

            // Odczyt z pliku
            FileReader fileReader = new FileReader(employess);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readAllAsString());
            file.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
