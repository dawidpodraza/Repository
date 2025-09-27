package pl.logic;

import pl.point.*;

public class PointController {
    public Point addX(Point pointX) {
        pointX.setX(pointX.getX() + 1);
        return pointX;
    }

    public Point minusX(Point pointX) {
        pointX.setX(pointX.getX() - 1);
        return pointX;
    }

    public Point addY(Point pointY) {
        pointY.setY(pointY.getY() + 1);
        return pointY;
    }

    public Point minusY(Point pointY) {
        pointY.setY(pointY.getY() - 1);
        return pointY;
    }


}
