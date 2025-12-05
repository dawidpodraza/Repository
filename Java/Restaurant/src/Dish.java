public record Dish(
        String type,
        String name,
        double price
        ) {

    @Override
    public String toString() {
        return type + " "+name+ " "+ price;
    }
}
