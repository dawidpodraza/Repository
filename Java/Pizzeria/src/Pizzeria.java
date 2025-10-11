import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza pizza1 = Pizza.MARGHERITA;
        Pizza pizza2 = Pizza.CAPRICIOSA;
        Pizza pizza3 = Pizza.PROSCIUTTO;
        System.out.println(pizza1+" -1");
        System.out.println(pizza2+" -2");
        System.out.println(pizza3+" -3");
        System.out.print("Twój wybór: ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println(Pizza.MARGHERITA.name());
                System.out.println("Przygotowujemy pizze: "+Pizza.MARGHERITA.name());
                break;
            case 2:
                System.out.println(Pizza.CAPRICIOSA.name());
                System.out.println("Przygotowujemy pizze: "+Pizza.CAPRICIOSA.name());
                break;
            case 3:
                System.out.println(Pizza.PROSCIUTTO.name());
                System.out.println("Przygotowujemy pizze: "+Pizza.PROSCIUTTO.name());
                break;
            default:
                System.out.println("Zły wybór");
        }

    }
}
