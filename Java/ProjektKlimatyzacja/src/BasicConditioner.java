public class BasicConditioner implements Conditioner {

    @Override
    public void turnON(Room room, boolean active, double setTemp) {
        countTemperature(room, 0.1, setTemp, active);
    }

}
