public class App {
    static void main(String[] args) {

        Vehicle<String, Integer> car1 = new Vehicle<>("silnik",320);
        Vehicle.show(car1.engine,car1.horsePower);


    }
}
