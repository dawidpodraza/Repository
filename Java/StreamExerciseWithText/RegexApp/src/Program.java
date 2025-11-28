public class Program {
    static void main(String[] args) {

        String email = "podrazad@gmail.com";

        String regex = "(\\w+)@(\\w+)\\.com";

        boolean matches = email.matches(regex);

        System.out.println(matches);
    }
}
