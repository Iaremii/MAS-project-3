package dziedziczenie_wieloaspektowe;

public abstract class Samochod {

    private String marka;
    private String model;
    private String nrRejestracyjny;
    private TypSamochodu typSamochodu;

    protected static int liczbaMiejsc = -1;
    public static double CENAZAMIEJSCE = 2000;

    public Samochod(String marka, String model, String nrRejestracyjny) {
        this.marka = marka;
        this.model = model;
        this.nrRejestracyjny = nrRejestracyjny;
    }

    public Samochod(String marka, String model, String nrRejestracyjny, SamochodElektryczny elektryczny, int pojemnoscBaterii, int potegaSilnika) {
        this.marka = marka;
        this.model = model;
        this.nrRejestracyjny = nrRejestracyjny;
        elektryczny = new SamochodElektryczny(pojemnoscBaterii, this, potegaSilnika);
    }

    public Samochod(String marka, String model, String nrRejestracyjny, SamochodBenzynowy benzynowy, int pojemnoscBaku, int potegaSilnika) {
        this.marka = marka;
        this.model = model;
        this.nrRejestracyjny = nrRejestracyjny;
        
        benzynowy = new SamochodBenzynowy(this, pojemnoscBaku, potegaSilnika);
    }

    public void setTyp(TypSamochodu typSamochodu) {
        if (typSamochodu == null) {
            typSamochodu.setBaza(this);
            this.typSamochodu = typSamochodu;
        }

    }

    public abstract double getCena();

    public static int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public static void setLiczbaMiejsc(int liczbaMiejsc) {
        if (liczbaMiejsc == -1) {
            Samochod.liczbaMiejsc = liczbaMiejsc;
        }
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public void setNrRejestracyjny(String nrRejestracyjny) {
        this.nrRejestracyjny = nrRejestracyjny;
    }

    @Override
    public String toString() {
        return "Samochod{" + "marka=" + marka + ", model=" + model + ", nrRejestracyjny=" + nrRejestracyjny + '}';
    }

}
