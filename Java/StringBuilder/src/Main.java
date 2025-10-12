public class Main {
    static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        String name = "Janusz ";
        String action = "sprzedaje dom za ";
        double price = 123900;
        char currency = '$';

        stringBuilder.append(name).append(action).append(price).append(currency);

        System.out.println(stringBuilder.toString());
        stringBuilder.insert(7, "Nowak ");

        System.out.println(stringBuilder.toString());
    }
}
