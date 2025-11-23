import java.time.*;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
//        Instant i1 = Instant.now();
//        for (int i = 0; i < 10000000; i++) {
//            System.out.println(i);
//        }
//        Instant i2 = Instant.now();
//        Duration durationBetween = Duration.between(i1,i2);
//        System.out.println(durationBetween.getSeconds());

//        LocalDate now = LocalDate.now();
//        LocalDate ageOfPerson = LocalDate.of(1989,11,20);
//
//        Period age = Period.between(ageOfPerson,now);
//        System.out.println(age.getYears()+" "+age.getDays());


        Scanner scanner = new Scanner(System.in);

        System.out.println("Start - ENTER");
        String click1 = scanner.nextLine();
        Instant start = Instant.now();

        System.out.println("Stop - ENTER");
        String click2 = scanner.nextLine();
        Instant end = Instant.now();

        Duration duration = Duration.between(start,end);
        System.out.println("Wynik : "+duration.getNano());




    }
}
