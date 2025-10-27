public class Vehicle<T,V>{
    T engine;
    V horsePower;

    public Vehicle(T engine, V horsePower) {
        this.engine = engine;
        this.horsePower = horsePower;
    }

    public static <T,V>void show(T engine, V horsePower){
        System.out.println(engine);
        System.out.println(horsePower);
    }
}
