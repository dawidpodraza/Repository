import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Data data = new Data();

        String[] tableOfWords = data.takeNumberAndCreateWords();
        StringBuilder lastResult = new StringBuilder();
        String lastOne;



        for (int i = 0; i < tableOfWords.length ; i++) {
            lastOne = tableOfWords[i];
            lastResult.append(lastOne.charAt(lastOne.length()-1));
        }
        System.out.println(lastResult);

    }
}
