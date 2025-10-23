import java.io.*;

public class Main {
    static void main(String[] args) throws IOException {
        String file = "txtNewFile";
        File create = new File(file);


        try {
            create.createNewFile();
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String nextline= null;

            while((nextline= reader.readLine()) != null){
                System.out.println(nextline);
            }
        } catch (IOException e) {
            System.out.println("Nie działa ...");
        }

    }
}
