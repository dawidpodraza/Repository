public class Test {
    static void main(String[] args) {
        Tire tire1 = new Tire("145/55",12,33333,"Michelin");
        ExhaustPart exhaustPart1 = new ExhaustPart(true,3214,"Mercedes","Gtfvx",42245);

        System.out.println(tire1.toString());
        System.out.println(exhaustPart1.toString());

    }
}
