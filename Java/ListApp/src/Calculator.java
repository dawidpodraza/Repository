import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public List<Integer> numbers = new ArrayList<>();

    public void generateNumbers(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        String generatedNumber = scanner.nextLine();
        if(!generatedNumber.equals("exit")) {
            numbers.add(Integer.valueOf(generatedNumber));
            generateNumbers();
        }else{
            System.out.println("Koniec programu");
        }
    }

    public Integer sumNumbers(){
        int sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }
        return sum;
    }
}
