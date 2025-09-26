public class App {
    static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter.metersToCentimeters(1));
        System.out.println(counter.centimetersToMeters(100));
        System.out.println(counter.metersToCentimeters(1));
        System.out.println(counter.miliMetersToMeters(1000));


        TimeCounter timeCounter = new TimeCounter();
        System.out.println(timeCounter.hourToMinutes(1));
        System.out.println(timeCounter.minutesToSeconds(1));
        System.out.println(timeCounter.secoundsToMiliseconds(1));
    }
}
