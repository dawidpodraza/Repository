import java.util.Scanner;

public class InputNumber {
    private static final int[] numbers = new int[10];
    private static int sum =0;

    public void add(){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj liczbę: ");

            int choice = scanner.nextInt();
            if(choice<100){
                numbers[i]=choice;
            }else{
                break;
            }
        }

    }

    public void count(){
        for (int i = 0; i < numbers.length ; i++) {
            sum= sum + numbers[i];
        }
    }

    public void printSum(){
        if(sum %2==0){
            System.out.println("Suma parzysta");
        }else{
            System.out.println("Suma nieparzysta");
        }
    }
}
