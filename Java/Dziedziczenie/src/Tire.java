public class Tire extends Part{
    private String size;
    private double width;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Tire(String size, double width,int idNumber,String producer) {
        this.size = size;
        this.width = width;
        setIdNUmber(idNumber); // z klasy matki
        setProducer(producer); // z klasy matki
    }

    @Override
    public String toString() {
        return "Tire{" +
                "size='" + size + '\'' +
                ", width=" + width +
                '}';
    }
}
