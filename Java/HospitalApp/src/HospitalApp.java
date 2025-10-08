public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.employees[0] = new Doctor("Jan","Nowak",12000,6000);
        hospital.employees[1] = new Nurse("Janina","Kowalska",7000,5);
        hospital.employees[2] = new Nurse("Kamila","Rycka",6700,4);

        hospital.getInfo();


        // Hospital - przechowuje informacje o pracownikach szpitala w tablicy. Powinna w niej istnieć metoda add() pozwalająca dodać nowego pracownika do tablicy pracowników.

    }
}
