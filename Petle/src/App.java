import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wprowadzić:");
        int numberOfNumbers = scanner.nextInt();
        int sum =0;

        for (int i = 0; i <numberOfNumbers ; i++) {
            System.out.println("Podaj kolejną liczbę:");
            sum = sum +scanner.nextInt();

        }
        System.out.println(sum);



    }
}
