public class Building {
        private Room room1;
        private Room room2;
        private Room room3;
        private Room room4;

    public Building() {
    }

    public Building(Room room1, Room room2, Room room3, Room room4) {
        this.room1 = room1;
        this.room2 = room2;
        this.room3 = room3;
        this.room4 = room4;
    }

    public Room getRoom1() {
        return room1;
    }

    public void setRoom1(Room room1) {
        this.room1 = room1;
    }

    public Room getRoom2() {
        return room2;
    }

    public void setRoom2(Room room2) {
        this.room2 = room2;
    }

    public Room getRoom3() {
        return room3;
    }

    public void setRoom3(Room room3) {
        this.room3 = room3;
    }

    public Room getRoom4() {
        return room4;
    }

    public void setRoom4(Room room4) {
        this.room4 = room4;
    }
}
