public class Conditioner {


    public void basicAirConditioner(Room room,boolean active,double setTemp){
        double tempToDecrease = room.getRoomSize()*0.1;
        double actualTemp =  room.getTempreture();
        while(actualTemp>setTemp && active){
            actualTemp = decreaseTempMethod(tempToDecrease,actualTemp);
            System.out.println(Math.round((actualTemp*100)/100));
        }
    }

    public void proAirCondtioner(Room room,boolean active,double setTemp){
        double tempToDecrease = room.getRoomSize()*0.2;
        double actualTemp =  room.getTempreture();
        while(actualTemp>setTemp && active){
            actualTemp = decreaseTempMethod(tempToDecrease,actualTemp);
            System.out.println(Math.round((actualTemp*100)/100));
        }
    }

    private double decreaseTempMethod(double tempToDecrease, double actualTemp){
        double actualTempreture = actualTemp;

        actualTempreture-= tempToDecrease;
        return actualTempreture;


    }
}
