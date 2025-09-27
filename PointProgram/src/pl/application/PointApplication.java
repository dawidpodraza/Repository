package pl.application;

import pl.logic.PointController;
import pl.point.Point;

public class PointApplication {
    static void main(String[] args) {
        Point point = new Point(0, 0);


        PointController pointController = new PointController();

        System.out.println(point.getX() + "  " + point.getY());

        pointController.addX(point);

        System.out.println(point.getX() + "  " + point.getY());

        pointController.addX(point);

        System.out.println(point.getX() + "  " + point.getY());

    }

}
