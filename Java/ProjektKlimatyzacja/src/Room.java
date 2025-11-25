public class Room {
    private double temperature;
    private double roomSize;

    public Room(double temperature, double roomSize) {
        this.temperature = temperature;
        this.roomSize = roomSize;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(double roomSize) {
        this.roomSize = roomSize;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Pokój o wielkości "+roomSize;
    }
}
