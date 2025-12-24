public class Pair <T,K>{
    private T firstPair;
    private K secondPair;

    public Pair(T firstPair, K secondPair) {
        this.firstPair = firstPair;
        this.secondPair = secondPair;
    }

    public T getFirstPair() {
        return firstPair;
    }

    public void setFirstPair(T firstPair) {
        this.firstPair = firstPair;
    }

    public K getSecondPair() {
        return secondPair;
    }

    public void setSecondPair(K secondPair) {
        this.secondPair = secondPair;
    }

}
