package dziedziczenie_wieloaspektowe;

public class Coupe extends Samochod {

    private int iloscDzwi;

    public Coupe(int iloscDzwi, String marka, String model, String nrRejestracyjny, SamochodBenzynowy benzynowy, int pojemnoscBaku, int potegaSilnika) {
        super(marka, model, nrRejestracyjny, benzynowy, pojemnoscBaku, potegaSilnika);
        this.iloscDzwi = iloscDzwi;
        setLiczbaMiejsc(2);
        
    }

    public Coupe(int iloscDzwi, String marka, String model, String nrRejestracyjny, SamochodElektryczny elektryczny, int pojemnoscBaterii, int potegaSilnika) {
        super(marka, model, nrRejestracyjny, elektryczny, pojemnoscBaterii, potegaSilnika);
        this.iloscDzwi = iloscDzwi;
        setLiczbaMiejsc(2);
    }


    
    public double wyliczCene() {
        return (getLiczbaMiejsc() * CENAZAMIEJSCE) / iloscDzwi;
    }

    @Override
    public double getCena() {
        return wyliczCene();
    }

    @Override
    public String toString() {
        return super.toString() + "Coupe{" + "iloscDzwi=" + iloscDzwi + '}';
    }

}
