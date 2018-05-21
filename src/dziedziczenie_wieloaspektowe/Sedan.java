package dziedziczenie_wieloaspektowe;

public class Sedan extends Samochod {

    private int iloscDzwi;

    public Sedan(int iloscDzwi, String marka, String model, String nrRejestracyjny, SamochodBenzynowy benzynowy, int pojemnoscBaku, int potegaSilnika) {
        super(marka, model, nrRejestracyjny, benzynowy, pojemnoscBaku, potegaSilnika);
        this.iloscDzwi = iloscDzwi;
         setLiczbaMiejsc(2);
    }

    public Sedan(int iloscDzwi, String marka, String model, String nrRejestracyjny, SamochodElektryczny elektryczny, int pojemnoscBaterii, int potegaSilnika) {
        super(marka, model, nrRejestracyjny, elektryczny, pojemnoscBaterii, potegaSilnika);
        this.iloscDzwi = iloscDzwi;
        setLiczbaMiejsc(2);
    }

   
    

    private double wyliczCene() {
        return (getLiczbaMiejsc() * CENAZAMIEJSCE) / iloscDzwi;
    }

    @Override
    public double getCena() {
        return wyliczCene();
    }

}
