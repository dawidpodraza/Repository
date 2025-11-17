import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {
    static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>();
        Random random = new Random();

        generateNumbers(listOfNumbers,()-> random.nextInt(10),10);

        printInfo(listOfNumbers,s-> System.out.print(s+" "));

        deleteNumbers(listOfNumbers,num->num%2==0);
        System.out.println();

        printInfo(listOfNumbers,s-> System.out.print(s+" "));

    }
    public static<T> void generateNumbers(List<T> list, Supplier<T> supplier,Integer index){
        for (int i = 0; i < index ; i++) {
            list.add(supplier.get());
        }

    }
    public static <T> void printInfo(List<T>list, Consumer<T>consumer){
        for (T t : list) {
            consumer.accept(t);
        }
    }

    public static<T> void deleteNumbers(List<T>list, Predicate<T> predicate){
        Iterator<T> iterator = list.iterator();
        while(iterator.hasNext()){
            T num = iterator.next();
            if(predicate.test(num)){
                iterator.remove();
            }
        }

    }
}
