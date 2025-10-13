public class TextBlocks {
    static void main(String[] args) {
        String title = "W pustyni i w puszczy";
        int number = 146;

        String sql =
                """
                Tytuł tej książki to:
                    "%s"
                \
                Numer książki:
                    %d
                Koniec wydruku!!
                """;

        System.out.printf(sql,title,number);
    }
}
