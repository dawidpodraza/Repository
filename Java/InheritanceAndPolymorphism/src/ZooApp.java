public class ZooApp {
   public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Lion("Simba",10);
        animals[1] = new Elephant("Gary",18);
        animals[2] = new Monkey("Kali",4);
        animals[3] = new Lion("Mufasa",11);
        animals[4] = new Elephant("Faty",24);

       for (Animal animal : animals) {
           animal.makeSound();
           animal.printInfo();
       }
    }
}

