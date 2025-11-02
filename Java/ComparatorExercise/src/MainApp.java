import java.util.Arrays;
import java.util.Comparator;

public class MainApp {
    static void main(String[] args) {
        Integer[]numbers = {21,2,32,32,1,234,33,22,46,13,55,3,56};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(numbers));


    }
}
