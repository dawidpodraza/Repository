public class Order {
    private String customerName;
    private DrinkType drinkType;

    public Order(String customerName, DrinkType drinkType) {
        this.customerName = customerName;
        this.drinkType = drinkType;
    }

    public double calculatePrice(){
        return switch(drinkType){
            case COFFEE -> 18;
            case TEA -> 10;
            case WATER -> 8;
            case JUICE -> 16;

        };
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }
}
