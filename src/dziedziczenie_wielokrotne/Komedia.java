package dziedziczenie_wielokrotne;

public class Komedia extends Film implements IKomedia {

    private int wiek;
    private int iloscBiletowNaKomedie;

    public Komedia( String nazwa, String kraj, String rok, int wiek, int iloscBiletowNaKomedie) {
        super(nazwa, kraj, rok);
        this.wiek = wiek;
        this.iloscBiletowNaKomedie = iloscBiletowNaKomedie;
    }

    @Override
    public int getWiek() {
        return wiek;
    }

    public int getIloscBiletowNaKomedie() {
        return iloscBiletowNaKomedie;
    }

    public void setIloscBiletowNaKomedie(int iloscBiletowNaKomedie) {
        this.iloscBiletowNaKomedie = iloscBiletowNaKomedie;
    }


    public float zarobekNaKomedii() {
        return getIloscBiletowNaKomedie() * CENABILETA;
    }
    @Override
    public float getZarobek() {
        return zarobekNaKomedii();
    }

    @Override
    public String toString() {
        return super.toString() + " kategoria = " + getClass().getSimpleName()  + ", wiek = " + wiek + "+, iloscBiletowNaKomedie = " + iloscBiletowNaKomedie + "sztuk }";
    }
    
    

}
