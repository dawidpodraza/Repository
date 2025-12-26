import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Program {
    static void main(String[] args) {

        Random random = new Random();

        List<Integer> list = new ArrayList<>();

        generate(list,10,()->random.nextInt(100));
        print(list,number-> System.out.print(number+" "));
        System.out.println();
        System.out.println(">>>>>>>> After action");
        deleteItem(list,number->number%2==0);
        print(list,number-> System.out.print(number+" "));
    }
    public static <T> void generate(List<T> list,int numberToGenerate, Supplier<T> supplier) {
        for (int i = 0; i < numberToGenerate; i++) {
            list.add(supplier.get());
        }
    }
    public static <T> void print(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
    public static <T> void deleteItem(List<T> list, Predicate<T> predicate) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (predicate.test(iterator.next())) {
                iterator.remove();
            }
        }
    }


}
