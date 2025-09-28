public class DiscountApp {
    static void main(String[] args) {
        Client client1 = new Client("Jan","Kowalski",false);

        double price = 1100;

        DiscountService discountService = new DiscountService();

        System.out.println(discountService.discountPrice(client1,price));

        Client client2 = new Client("David","Nowak",true);
        System.out.println(discountService.discountPrice(client2,price));

    }
}
