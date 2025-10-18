public class Lion extends Animal {

    public Lion(String name, Size size) {
        super(name, size);
    }

    @Override
    void makeSound() {
        System.out.println("ROARR");
    }

    @Override
    void printInfo() {
        System.out.println("To zwierze ma na imie "+name+" i ma rozmiar "+size);
    }
}
