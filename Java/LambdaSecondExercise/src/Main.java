import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    static void main(String[] args) {
        Random random = new Random();
        List<Integer> listOfNumbers = new ArrayList<>();

        genrateNumbers(listOfNumbers,10,()-> random.nextInt(1000));
        printIfno(listOfNumbers,s-> System.out.print(s+" "));
        System.out.println("\n");
        deleteDivideBy2Numbers(listOfNumbers,element -> element%2 ==0);
        printIfno(listOfNumbers,s-> System.out.print(s+" "));

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

    public static <T> void deleteDivideBy2Numbers(List<T>list, Predicate<T> predicate){
        Iterator<T> iterator = list.iterator();

        while(iterator.hasNext()){
            T element = iterator.next();
            if(predicate.test(element)){
                iterator.remove();
            }
        }
    }

    // wykonać jeszcze przykład z interfacem funkcyjnym Function !!!
}
