public class Monkey extends Animal{

    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Ooh ohh !");
    }
    public void printInfo() {
        super.printInfo();
    }
}
