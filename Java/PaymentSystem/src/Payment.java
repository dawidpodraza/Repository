import java.util.Scanner;

public class Payment implements Payable{
     ChoiceOptions choiceOptions1 = ChoiceOptions.CARD;
     ChoiceOptions choiceOptions2 = ChoiceOptions.BLIK;

    private void payByCard() {
        System.out.println("Wybrałeś karte");
    }

    private void payByBlik(){
        System.out.println("Wybrałeś BLIK");
    }

    private void printQuestion(){
        System.out.println("Wybierz opcje płatności:");
    }

    @Override
    public void choicePaymentMethod() {
        Scanner scanner = new Scanner(System.in);
        printQuestion();
        String choice = scanner.nextLine();


    }

}
