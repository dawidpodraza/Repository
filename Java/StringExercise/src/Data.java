import java.util.Scanner;

public class Data {

    public String[] takeNumberAndCreateWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość wyrazów:");
        int choice = scanner.nextInt();
        scanner.nextLine();
        String[] words = new String[choice];

        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.nextLine();

        }
        return words;

    }
}
