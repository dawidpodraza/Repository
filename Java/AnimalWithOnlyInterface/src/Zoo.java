public class Zoo {
    static void main(String[] args) {
        Creature lion1 = new Lion("Simba",Size.HUGE);
        lion1.run();
        lion1.makeNoise();
        System.out.println(lion1);
    }
}
