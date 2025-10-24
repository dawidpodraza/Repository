public class Company {
    private Employee[] employees = new Employee[3];
    private int index = 0;

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;

    }

    public void addEmployee(Employee employee){
        if(employees[employees.length-1]!=null){
            System.out.println("Nie można dodaćwięcej użytkowników !");
        }else {

            employees[index] = employee;
            index += 1;
        }

    }

    public void showEmployess(){
        for (int i = 0; i <employees.length ; i++) {
            System.out.println(employees[i]);
        }
    }
    public StringBuilder writePersons(){
        StringBuilder text= new StringBuilder();
        for (int i = 0; i <employees.length ; i++) {
            text.append(employees[i]+"\n");
        }
        return text;
    }
}
