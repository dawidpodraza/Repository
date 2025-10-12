public class SpecialOrder extends Order{
    private boolean hasExtra;

    public SpecialOrder(String customerName, DrinkType drinkType, boolean hasExtra) {
        super(customerName, drinkType);
        this.hasExtra = hasExtra;
    }

    public boolean isHasExtra() {
        return hasExtra;
    }

    public void setHasExtra(boolean hasExtra) {
        this.hasExtra = hasExtra;
    }

    @Override
    public double calculatePrice() {
        double first = super.calculatePrice();
        if(hasExtra){
            first+=2;
        }
        return first;
    }
}
