public class Program {
    static void main(String[] args) {

        String email = "podrazad@gmail.com";

        String regex = "([a-z0-9]+)@([a-z0-9]+)\\.com";

        boolean matches = email.matches(regex);

        System.out.println(matches);
    }
}
