import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProgramOne {
    static void main(String[] args) {
        List<Integer> generatedNumbers = Stream.iterate(0,x->x+1)
                .limit(1000)
                .toList();

        System.out.println(generatedNumbers);

        List<Integer> sortedList = generatedNumbers.stream()
                .filter(x->x>100 && x<1000 && x%5==0)
                .limit(10)
                .map(x->x*3)
                .toList();

        System.out.println(sortedList);

        // rozwiązanie z JavaStart
        
        Stream.iterate(0,x->x+1)
                .filter(x->x>100 && x<1000 && x%5==0 )
                .limit(10)
                .map(x->x*3)
                .forEach(x-> System.out.print(x+" "));






    }
}
