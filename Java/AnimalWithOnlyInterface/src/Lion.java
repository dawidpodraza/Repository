public class Lion implements Creature{
    private final String name;
    private final Size size;

    public Lion(String name,Size size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Biega");
    }

    @Override
    public void makeNoise() {
        System.out.println("ROARR");
    }

    @Override
    public String toString() {
        return "LEW "+getName()+" rozmiar "+size;
    }
}
