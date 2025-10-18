public abstract class Animal {
    String name;
    Size size;

    public Animal(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    abstract void makeSound();
    abstract void printInfo();

}
