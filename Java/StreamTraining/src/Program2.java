import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program2 {
    static void main(String[] args) {

        List<Integer> numbers = Stream.iterate(0, x->x+1)
                .limit(100)
                .map(x->x*x)
                .filter(x->x%2==0 &&x<1000)
                .toList();

        System.out.println(numbers);
    }
}
