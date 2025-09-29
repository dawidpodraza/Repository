package pl.counter;

public class Counter {

    public int countTables(int[] table1, int[] table2) {
        int sum = 0;
        int number1 = 0;
        while (number1 < table1.length) {
            sum = sum + table1[number1] + table2[number1];
            number1++;

        }

        return sum;
    }
}
