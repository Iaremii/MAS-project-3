package dziedziczenie_wieloaspektowe;

public class SamochodBenzynowy extends TypSamochodu {

    private int pojemnoscBaku;

    private final int NA100KM = 85;

    public SamochodBenzynowy(Samochod baza, int pojemnoscBaku, int potegaSilnika) {
        super(baza, potegaSilnika);
        this.pojemnoscBaku = pojemnoscBaku;
    }

    public int getPojemnoscBaku() {
        return pojemnoscBaku;
    }

    public void setPojemnoscBaku(int pojemnoscBaku) {
        this.pojemnoscBaku = pojemnoscBaku;
    }
    
    public void wyliczMoc(){
        System.out.println(getPojemnoscBaku() * NA100KM);
    }

}
