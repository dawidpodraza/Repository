public class TestClass {
    static void main(String[] args) {
        Pair<Integer, String> para1 = new Pair<>(12,"Kamil");
        Pair<Integer, String> para2 = new Pair<>(32,"Justyna");

//        para1.printInfo();
//        para2.printInfo();

        printInfoAboutPair(para1);
        printInfoAboutPair(para2);

    }
    static <T,V> void printInfoAboutPair (Pair<T ,V> pair){
        System.out.println(pair.getPair1().toString() + " "+pair.getPair2().toString());

    }
}
