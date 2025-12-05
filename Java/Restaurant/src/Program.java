public class Program {
    static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.setOrders(restaurant.placeOrder());
        restaurant.countPrice(restaurant.getOrders());
        restaurant.printPrice(restaurant.getOrders());
        restaurant.printCostOfService();

    }
}
