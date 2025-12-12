import java.util.Scanner;

public class GameMachineController {

    public String askForTitle(){
        System.out.println("Podaj tytuł gry:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public double askForPrice(){
        System.out.println("Zapłać : (wpisz kwote)");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

}
