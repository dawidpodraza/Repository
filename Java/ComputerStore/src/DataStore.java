public class DataStore {
    //    public static int COMPUTERS_MAX_NUMBER = 1;
//    public static Computer[] computers = new Computer[COMPUTERS_MAX_NUMBER];
//
//    public void add(Computer computer){
//        computers[COMPUTERS_MAX_NUMBER-1]= computer;
//        COMPUTERS_MAX_NUMBER +=1;
//    }
    public Computer[] computers = new Computer[0];

    public void add(Computer computer) {
        // Tworzymy nową tablicę o jeden element większą
        Computer[] newComputers = new Computer[computers.length + 1];

        // Kopiujemy stare dane
        for (int i = 0; i < computers.length; i++) {
            newComputers[i] = computers[i];
        }

        // Dodajemy nowy komputer na końcu
        newComputers[computers.length] = computer;

        // Zamieniamy starą tablicę na nową
        computers = newComputers;
    }

    public void showComputers() {
        for (Computer c : computers) {
            System.out.println(c);
        }
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void showComputersInStore() {
        for (Computer computer : computers) {
            System.out.println(computer.toString());
        }
    }

    public void checkAvailability(Computer computer) {
        int sameComputersInStore = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computer.equals(computers[i])) {
                sameComputersInStore += 1;
            }
        }
        System.out.println("Liczba komputerów tego modelu w sklepie: " + sameComputersInStore);
    }
}
