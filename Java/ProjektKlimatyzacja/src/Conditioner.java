interface Conditioner {


    void turnON(Room room, boolean active, double setTemp);


    default void countTemperature(Room room, double x, double setTemp, boolean active) {
        double tempToDecrease = room.getRoomSize() * x;
        double actualTemp = room.getTemperature();
        while (actualTemp > setTemp && active) {
            actualTemp = Math.max(decreaseTempMethod(tempToDecrease, actualTemp), setTemp);
            room.setTemperature(actualTemp);
            System.out.println(Math.round((actualTemp * 100) / 100));
        }
    }

    private double decreaseTempMethod(double tempToDecrease, double actualTemp) {
        double actualTemperature = actualTemp;

        actualTemperature -= tempToDecrease;
        return actualTemperature;


    }
}
