public class Car extends Vehicle implements Drivable{
    private int horsePower;

    public Car(String name, int horsePower) {
        super(name);
        this.horsePower=horsePower;
    }

    @Override
    public void drive(int distance) {

        System.out.println("Jade " + distance);
    }

    @Override
    void getMaxSpeed() {
        System.out.println("Moja prędkość maksymalna to "+ (horsePower + 100));
    }
}
