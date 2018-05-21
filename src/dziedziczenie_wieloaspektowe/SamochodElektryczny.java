package dziedziczenie_wieloaspektowe;

public class SamochodElektryczny extends TypSamochodu{

    private int pojemnoscBaterii;
    
    private final int NA100KM = 85;

    public SamochodElektryczny(int pojemnoscBaterii, Samochod baza, int potegaSilnika) {
        super(baza, potegaSilnika);
        this.pojemnoscBaterii = pojemnoscBaterii;
    }

    public void setPojemnoscBaterii(int pojemnoscBaterii) {
        this.pojemnoscBaterii = pojemnoscBaterii;
    }

    public int getPojemnoscBaterii() {
        return pojemnoscBaterii;
    }

    
}
