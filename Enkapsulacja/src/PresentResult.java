
public class PresentResult {
    void presentPerson(Client client){
        System.out.println("Oto wynik obliczeń dla "+client.getFirstName()+ " "+client.getLastName());
    }

    void finalPrice(double price){
        System.out.println("Ostateczna cena po zniżce: "+price);
    }
}



