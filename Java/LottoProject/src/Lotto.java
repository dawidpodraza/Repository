import java.util.*;

public class Lotto {
    private final List<Integer> ListOfNumbersGenerated = new ArrayList<>();
    private final List<Integer> listOfFirstSixNumbersFromGenerated = new ArrayList<>();
    private final List<Integer> listOfUserSixChosenNumbers = new ArrayList<>();

    public void generateList() {
        int index = 1;
        do {
            ListOfNumbersGenerated.add(index);
            index++;
        } while (index < 50);
        //System.out.println("Wygenerowanie listy  " + ListOfNumbersGenerated);
    }

    public void randomize() {
        Collections.shuffle(ListOfNumbersGenerated);
        //System.out.println("Pomieszanie listy  " + ListOfNumbersGenerated);
    }

    public void addFirstSixNumbersToNewList() {
        for (int i = 0; i < 6; i++) {
            Integer numberToAdd = ListOfNumbersGenerated.get(i);
            listOfFirstSixNumbersFromGenerated.add(numberToAdd);
        }
        //System.out.println("Lista pierwszych 6 liczb  " + listOfFirstSixNumbersFromGenerated);
    }


    public void askForSixNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 6 liczb (od 1 do 49) :");
        for (int i = 0; i < 6; i++) {
            listOfUserSixChosenNumbers.add(scanner.nextInt());
        }
        System.out.println("Wybrane liczby :" + listOfUserSixChosenNumbers);
    }

    public void checkResult() {
        int index = 0;
        int frequency = 0;
        while (index != 6) {
            frequency = frequency +Collections.frequency(listOfUserSixChosenNumbers, listOfFirstSixNumbersFromGenerated.get(index));
            index++;

        }
        System.out.println("Liczba trafionych liczb : "+frequency);
        System.out.println("Liczby wylosowane przez maszyne losującą to : "+listOfFirstSixNumbersFromGenerated);
    }

}
