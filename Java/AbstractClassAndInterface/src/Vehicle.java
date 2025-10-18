public abstract class Vehicle implements Drivable{
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    void info(){
        System.out.println("Marka "+name);
    }
    abstract void getMaxSpeed();
}
