public class Main {
    static void main(String[] args) {

        sayHI(5);
    }

    private static void sayHI(int number){
        System.out.println("Hi");

        if(number<=1){
            return;
        }
        sayHI(number-1);
    }
}
