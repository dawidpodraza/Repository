public class Game {

    private final String title;
    private final double price;

    public Game(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
