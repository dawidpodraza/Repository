import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LetterChanger {


    public static void main(String[] args) {

        int numberOfWords = getNumberOfWords();
        List<String> words = readWords(numberOfWords);
        String change = readChangeString();
        if (change.equals("upper")) {
            changeWordsToUpperCase(words);
        } else if(change.equals("lower")) {
            changeWordsToLowerCase(words);
        } else {
            System.out.println("Nieprawidłowy tekst, zostawiam oryginalny tekst");
        }

        printArray(words);
    }

    private static String readChangeString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chcesz zamienić na małe (lower), czy wielkie litery (upper)?");
        return scanner.nextLine();
    }

    private static void printArray(List<String> array) {
        for (String word : array) {
            System.out.println(word);
        }
    }

    private static void changeWordsToLowerCase(List<String> words) {
        words.replaceAll(String::toLowerCase);
    }

    private static void changeWordsToUpperCase(List<String> words) {

            words.replaceAll(String::toUpperCase);

    }

    private static List<String> readWords(int size) {
        Scanner scanner = new Scanner(System.in);
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Podaj wyraz numer " + (i+1));
            newList.add(scanner.nextLine());
        }
        return newList;

    }

    private static int getNumberOfWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile wyrazów chcesz wczytać?");
        return scanner.nextInt();
    }
}