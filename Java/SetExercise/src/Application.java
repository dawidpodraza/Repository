import java.io.*;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Application {
    static void main(String[] args) {
        String fileName = "namespl.txt";
        File file1 = new File(fileName);

        TreeSet<String> names = new TreeSet<>(Comparator.reverseOrder());
        try {
            FileReader fileReader = new FileReader(file1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String nextLine = null;
            int lines =0;
            while((nextLine = bufferedReader.readLine())!=null){
                names.add(nextLine);
                lines++;

            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.first());
        System.out.println(names.last());

    }
}
