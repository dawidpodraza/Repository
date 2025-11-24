public class Program {
    static void main(String[] args) {

        Building building = new Building();
        Conditioner conditioner = new Conditioner();
        building.setRoom1(new Room(23,15));
        building.setRoom2(new Room(20,10));
        building.setRoom3(new Room(21,20));
        building.setRoom4(new Room(25,18));

        System.out.println("Room 1:");
        conditioner.basicAirConditioner(building.getRoom1(),true,18);
        System.out.println("Room 2:");
        conditioner.basicAirConditioner(building.getRoom2(),true,13);
        System.out.println("Room 3:");
        conditioner.basicAirConditioner(building.getRoom3(),true,10);
        System.out.println("Room 4:");
        conditioner.basicAirConditioner(building.getRoom4(),true,15);


    }
}
