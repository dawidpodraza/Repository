
public class PresentResult {
    void presentPerson(Client client) {

        if (client.getFirstName() == null && client.getLastName() != null) {
            System.out.println("Dzień dobry panie " + client.getLastName());
        } else if (client.getFirstName() != null && client.getLastName() == null) {
            System.out.println("Dzień dobry " + client.getFirstName());
        } else if (client.getFirstName() != null && client.getLastName() != null) {
            System.out.println("Dzień dobry " + client.getFirstName());
        } else {
            System.out.println("Dzień dobry");
        }
    }

    void finalPrice(double price) {
        System.out.println("Ostateczna cena po zniżce: " + price);
    }
}



