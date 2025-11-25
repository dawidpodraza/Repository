public class Program {
    static void main(String[] args) {

        Building building = new Building();
        BasicConditioner basicConditioner = new BasicConditioner();
        ProConditioner proConditioner = new ProConditioner();

        building.setRoom1(new Room(23,15));
        building.setRoom2(new Room(20,10));
        building.setRoom3(new Room(21,20));
        building.setRoom4(new Room(25,18));

        System.out.println("Room 1:");
        basicConditioner.turnON(building.getRoom1(),true,18);
        System.out.println("Room 2:");
        basicConditioner.turnON(building.getRoom2(),true,13);
        System.out.println("Room 3:");
        basicConditioner.turnON(building.getRoom3(),true,10);
        System.out.println("Room 4:");
        proConditioner.turnON(building.getRoom4(),true,15);

        System.out.println(building.getRoom2()+" po włączeniu klimatyzacji ma temperaturę "+building.getRoom2().getTemperature()+" stopni C");


    }
}
