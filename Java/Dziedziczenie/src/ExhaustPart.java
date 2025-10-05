public class ExhaustPart extends Part {
    private boolean euroStandard;

    public boolean isEuroStandard() {
        return euroStandard;
    }

    public void setEuroStandard(boolean euroStandard) {
        this.euroStandard = euroStandard;
    }

    public ExhaustPart(boolean euroStandard,int idNUmber,String producer,String model,int serialNumber) {
        this.euroStandard = euroStandard;
        setModel(model);
        setIdNUmber(idNUmber);
        setProducer(producer);
        setSerialNumber(serialNumber);

    }

    @Override
    public String toString() {
        return "ExhaustPart{" +
                "euroStandard=" + euroStandard +
                '}';
    }
}
