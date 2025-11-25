public class ProConditioner implements Conditioner {

    @Override
    public void turnON(Room room, boolean active, double setTemp) {
        countTemperature(room, 0.2, setTemp, active);
    }


}
