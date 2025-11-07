import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Company {
    Map<String,Employee> employeesMap = new HashMap<>();


    private void addEmployee(Employee employee){
        employeesMap.put(employee.getLastName(), employee);
    }

    private void askForEmployeeData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wypłate: ");
        String salary = scanner.nextLine();

        addEmployee(new Employee(firstName,lastName,Integer.parseInt(salary)));
    }

    private void searchForEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwisko pracownika którego szukasz: ");
        String lastName = scanner.nextLine();
        printEmployeeInfoByLastName(lastName);

    }

    private void printEmployeeInfoByLastName(String lastName){
        System.out.println(employeesMap.get(lastName));

    }
    public void choiceAction(){

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Dodanie pracownika 1 \nWyszukaj pracownika 2 \nWyjdź z programu 3");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> askForEmployeeData();
                case 2 -> searchForEmployee();
                case 3 -> System.exit(0);
                default -> choiceAction();
            }
        }while(true);
    }



}
