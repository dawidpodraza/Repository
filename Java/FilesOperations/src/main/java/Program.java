import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Program {
    static void main(String[] args) {

        try {

            List<String> content = Files.readAllLines(Path.of("example.txt"));
            for (String item : content) {
                System.out.println(item);

            }
            Path source = Path.of("example.txt");
            Path destination = Path.of("src/main/example.txt");
            Files.move(source,destination);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
