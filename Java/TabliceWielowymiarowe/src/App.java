public class App {
    static void main(String[] args) {
        double[] tab1 = {1.0, 1.5, 2.0};
        double[] tab2 = {1.5, 2.0, 2.5};
        double[] tab3 = {2.0, 2.5, 3.0};

        double[][] multiTab = {tab1, tab2, tab3};

        double sum1 = multiTab[0][0] * multiTab[1][1] * multiTab[2][2];
        double sum2 = multiTab[0][1] * multiTab[1][1] * multiTab[2][1] * multiTab[1][0] * multiTab[1][1] * multiTab[1][2];
        double sum3 = multiTab[0][0] + multiTab[0][1] + multiTab[0][2] + multiTab[1][2] + multiTab[2][2] +
                multiTab[2][1] + multiTab[2][0] + multiTab[1][0];

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);


    }
}
