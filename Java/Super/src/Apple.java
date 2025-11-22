public class Apple extends Fruit {
    private String variation;
    public static final String TYPE = "jabłkowaty";

    public Apple(double weight,String variation) {
        super(weight,TYPE);
        this.variation = variation;

    }

    public String getVariation() {
        return variation;
    }

    public void setVariation(String variation) {
        this.variation = variation;
    }

    @Override
    void getInfo() {
        super.getInfo();
        System.out.println("Odmiana owocu: "+getVariation());
    }
}
