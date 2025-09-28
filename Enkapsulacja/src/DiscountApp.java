public class DiscountApp {
    static void main(String[] args) {
        Client client1 = new Client("Jan","Kowalski",false);
        Client client2 = new Client("David","Nowak",true);

        double price = 1100;

        DiscountService discountService = new DiscountService();
        PresentResult presentResult = new PresentResult();

        presentResult.presentPerson(client1);
        presentResult.finalPrice(discountService.discountPrice(client1,price));

        presentResult.presentPerson(client2);
        presentResult.finalPrice(discountService.discountPrice(client2,price));


    }
}
