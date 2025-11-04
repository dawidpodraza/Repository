import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        Calculator calculate1 = new Calculator();

        calculate1.generateNumbers();
        System.out.println(calculate1.numbers);
        System.out.println(calculate1.sumNumbers());

    }
}
