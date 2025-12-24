public class Program {
    static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1123, "xxxx");
        Pair<Car, String> pair2 = new Pair<>(new Car("BMW", "E60"), "xxx");
        Pair<Integer, Integer> pair3 = new Pair<>(312, 432);

        printInfo(pair1);
        printInfo(pair2);
        printInfo(pair3);
    }
    public static <T,K> void printInfo(Pair <T,K> pair){
        System.out.println("Twoja para to:");
        System.out.println(pair.getFirstPair()+ " "+pair.getSecondPair());

    }
}
