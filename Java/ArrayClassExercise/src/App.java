import java.util.Arrays;

public class App {
    static void main(String[] args) {
        PersonDatabase personDatabase1 = new PersonDatabase();


        personDatabase1.add(new Person("Marek","Nowak","891123334"));
        personDatabase1.add(new Person("Kamil","Kowal","907823123"));
        personDatabase1.add(new Person("Kamil","Kowal","907823123"));
        personDatabase1.add(new Person("Kamil","Kowal","907823123"));
        personDatabase1.printInfo();

        //zastanowic sie jak rozwiazac problem z dodawaniem kolejnych
        // elementow i usuwaniem i potem robic reszte zadania
    }
}
