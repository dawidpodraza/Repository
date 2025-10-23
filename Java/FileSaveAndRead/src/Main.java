import java.io.*;
import java.util.Scanner;

public class Main {
    static void main(String[] args) throws IOException {
        String fileName = "txtFile";

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));
        fileWriter.write("Ania");
        fileWriter.newLine();
        fileWriter.write("Kaisa");
        fileWriter.newLine();
        fileWriter.write("Basia");
        fileWriter.close();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

    }
}
