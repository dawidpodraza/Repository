import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {


    private List<Dish> orders ;


    public List<Dish> placeOrder(){
        List<Dish> userOrders = new ArrayList<>();
        boolean finish = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wybierz nr zamówienia");
            System.out.println("1 - Pizza");
            System.out.println("2 - Lasagne");
            System.out.println("3 - Fish");
            System.out.println("4 - END OF ORDER");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> userOrders.add(new Dish("Pizza", "Margherita", 12));
                case "2" -> userOrders.add(new Dish("Lasagne", "Rivera", 10));
                case "3" -> userOrders.add(new Dish("Fish", "Merion", 8));
                case "4" -> finish = true;
            }
        }while(!finish);
        return userOrders;
    }
    public double countPrice(List<Dish> orders){
        double sum = 0;
        for (Dish order : orders) {
            sum = sum+ order.price();
        }
        return sum;
    }

    public double countCostOfService(double ordersSumPrice){
        if(ordersSumPrice<100){
            return ordersSumPrice * 0.15;
        }else{
            return ordersSumPrice * 0.05;
        }
    }
    public void printCostOfService(){
        System.out.println("Koszt serwisu :"+countCostOfService(countPrice(orders)));
    }

    public void printPrice(List<Dish> orders){
        System.out.println("Cena : "+ countPrice(orders));
    }

    public List<Dish> getOrders() {
        return orders;
    }

    public void setOrders(List<Dish> orders) {
        this.orders = orders;
    }
}
