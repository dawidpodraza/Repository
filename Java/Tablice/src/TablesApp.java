import pl.counter.*;


public class TablesApp {
    static void main(String[] args) {
        Counter counter = new Counter();

        int[] table1 = {1, 2, 3};
        int[] table2 = {4, 5, 6};

        int sum = table1[0] + table1[1] + table1[2] + table2[0] + table2[1] + table2[2];
        System.out.println(sum);
        System.out.println("----------");
        System.out.println(counter.countTables(table1, table2));
    }
}
