package pl.application;

import pl.logic.PointController;
import pl.point.Point;

import java.util.Scanner;

public class PointApplication {
    static void main(String[] args) {
        Point point = new Point(0, 0);


        PointController pointController = new PointController();

        System.out.println(point.getX() + "  " + point.getY());

        pointController.addX(point);

        System.out.println(point.getX() + "  " + point.getY());

        pointController.addX(point);

        System.out.println(point.getX() + "  " + point.getY());

        // DRUGA CZĘŚĆ PROGRAMU Z INSTRUKCJĄ SWITCH

        Point point2 = new Point(0,0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("L - przesuń o 1 w lewo ");
        System.out.println("P - przesuń o 1 w prawo ");
        System.out.println("G - przesuń o 1 w góre ");
        System.out.println("D - przesuń o 1 w dół ");

        String userChoice = scanner.nextLine();

        switch (userChoice){
            case "L" -> pointController.minusX(point2);
            case "P" -> pointController.addX(point2);
            case "G" -> pointController.addY(point2);
            case "D" -> pointController.minusY(point2);
            default -> System.out.println("Nieprawidłowe dane...");
        }

        System.out.println(point2.getX()+" "+ point2.getY());

    }

}
