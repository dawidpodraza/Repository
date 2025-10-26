import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    static void main(String[] args) {

        String fileName = "liczby.txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("123\n");
            fileWriter.write("1234\n");
            fileWriter.write("12345\n");
            fileWriter.write("123456789123456789\n");
            fileWriter.write("987654321987654321");
            fileWriter.close();

            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);


            BigInteger first = new BigInteger(bufferedReader.readLine());
            BigInteger second = new BigInteger(bufferedReader.readLine());
            BigInteger third = new BigInteger(bufferedReader.readLine());

            int a = first.intValue();
            int b =second.intValue();
            int c= third.intValue();


            BigInteger fourth = new BigInteger(bufferedReader.readLine());
            BigInteger fifth = new BigInteger(bufferedReader.readLine());


            int sum1 = a+b+c;
            System.out.println(sum1);

            BigInteger sum2 = fourth.add(fifth);
            System.out.println(sum2);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
