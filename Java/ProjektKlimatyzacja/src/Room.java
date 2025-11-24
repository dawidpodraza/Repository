public class Room {
    private double tempreture;
    private double roomSize;

    public Room(double tempreture, double roomSize) {
        this.tempreture = tempreture;
        this.roomSize = roomSize;
    }

    public double getTempreture() {
        return tempreture;
    }

    public void setTempreture(double tempreture) {
        this.tempreture = tempreture;
    }

    public double getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(double roomSize) {
        this.roomSize = roomSize;
    }
}
