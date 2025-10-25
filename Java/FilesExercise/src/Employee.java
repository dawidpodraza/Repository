public class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Pracownik:" +
                " " + getFirstName() + " " + getLastName() + " | Wypłata " + salary;
    }

    public static void askForPersonalData() {
        System.out.println("Podaj imie nazwisko i wypłate");
    }
}
