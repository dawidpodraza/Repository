public class LoopTestClass {
    static void main(String[] args) {
        int repetitions = 100000;

        // test dla zwykłego Stringa
        long startTime = System.nanoTime();
        String text = " ";

        for (int i = 0; i < repetitions; i++) {
            text = text + "a";
        }
        long endTime = System.nanoTime();
        long finishTime = endTime - startTime;

        System.out.println(finishTime);

        // test dla String Buildera
        startTime = System.nanoTime();
        StringBuilder text2 = new StringBuilder();

        for (int i = 0; i < repetitions; i++) {
            text2.append("a");
        }
        endTime = System.nanoTime();
        long finishTime2 = endTime - startTime;

        System.out.println(finishTime2);


    }
}
