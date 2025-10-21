import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) throws IOException {
        String fileName = "txtFile";
        File file = new File(fileName);

        Scanner scanner= new Scanner(file);

        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }


    }
}
