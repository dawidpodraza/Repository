public class Main {
    static void main(String[] args) {

        sayHI(5);
        System.out.println(silnia(5));
    }

    private static void sayHI(int number){
        System.out.println("Hi");

        if(number<=1){
            return;
        }
        sayHI(number-1);
    }

    private static int silnia(int n) {
        if (n == 0) {
            return 1; // warunek bazowy
        }
        return n * silnia(n - 1); // rekurencja
    }
}
