public enum Pizza {
    MARGHERITA(true,true,false,false),
    CAPRICIOSA(true,true,true,false),
    PROSCIUTTO(true,true,false,true);

    private final boolean sosPomidorowy;
    private final boolean ser;
    private final boolean mushrooms;
    private final boolean szynka;

    Pizza(boolean sosPomidorowy, boolean ser, boolean mushrooms, boolean szynka) {
        this.sosPomidorowy = sosPomidorowy;
        this.ser = ser;
        this.mushrooms = mushrooms;
        this.szynka = szynka;
    }

    @Override
    public String toString() {
        if(ser){
            System.out.print("Ser ");
        }
        if(sosPomidorowy){
            System.out.print("Sos pomidorowy ");
        }
        if(mushrooms){
            System.out.print("Pieczarki ");
        }
        if(szynka){
            System.out.print("Szynka ");
        }
        return name();
    }
}
