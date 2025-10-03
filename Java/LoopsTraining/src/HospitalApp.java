void main() {
    Scanner scanner = new Scanner(System.in);
    Hospital hospital = new Hospital();

    while (true) {
        IO.println("Witaj! Wybierz opcję:");
        IO.println("0 - Wyjście");
        IO.println("1 - Wpisz pacjenta do kolejki");
        IO.println("2 - Pokaż pacjentów");

        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                IO.println("Do widzenia!");
                System.exit(0);
                break;

            case 1:
                if (hospital.getIndex() < 3) {
                    hospital.add();
                } else {
                    IO.println("Brak miejsc w kolejce!");
                }
                break;

            case 2:
                hospital.showQueue();
                break;

            default:
                IO.println("Niepoprawny wybór, spróbuj ponownie.");
        }
    }
}