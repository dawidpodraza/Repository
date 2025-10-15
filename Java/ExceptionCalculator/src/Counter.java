import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;

public class Counter {
    private double firstNumber;
    private double secondNumber;
    private String actionChoice;
    private double result;


    public void askForNumbers() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj pierwszą liczbę: ");
            firstNumber = scanner.nextDouble();
            System.out.println("Podaj drugą liczbę");
            secondNumber = scanner.nextDouble();
        } catch (NoSuchElementException e) {
            System.out.println("Miałeś podać liczbę!");
        }
    }

    public void actionChoiceMethod() throws UnknownOperatorException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj działanie: + - * /");
        actionChoice = scanner.nextLine();
        if(!actionChoice.equals("+") || !actionChoice.equals("-") || !Objects.equals(actionChoice, "*") || actionChoice!="/")
            throw new UnknownOperatorException();

    }

    public void countAndShowResult() {

        switch (actionChoice) {

            case "+" -> result = firstNumber + secondNumber;
            case "-" -> result = firstNumber - secondNumber;
            case "*" -> result = firstNumber * secondNumber;

            case "/" -> {
                if (secondNumber == 0) {
                    throw new ArithmeticException("Nie dzielimy przez ZERO!");
                } else {
                    result = firstNumber / secondNumber;
                }
            }

        }

        System.out.println("Wynik działania: " + result);
    }


}
