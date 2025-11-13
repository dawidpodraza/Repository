import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    static void main(String[] args) {
        Random random = new Random();
        List<Integer> listOfNumbers = new ArrayList<>();

        genrateNumbers(listOfNumbers,10,()-> random.nextInt(1000));
        printIfno(listOfNumbers,s-> System.out.println(s));

    }
    public static <T> void genrateNumbers(List<T>list, int toGenerate, Supplier<T> sup){
        for (int i = 0; i < toGenerate; i++) {
            list.add(sup.get());
        }
    }

    public static <T> void printIfno(List<T> list, Consumer<T> consume){
        for(T t :list){
            consume.accept(t);
        }
    }

    // ćwiczyć dalej wyrażenia labda metody z typami generycznymi 
}
