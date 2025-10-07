public class Animal {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makeSound(){
        System.out.println("Animal sound....");
    }
    public void printInfo(){
        System.out.println("Name: "+getName()+" Age: "+getAge());
    }
}
