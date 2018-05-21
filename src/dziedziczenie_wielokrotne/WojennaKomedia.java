package dziedziczenie_wielokrotne;

public class WojennaKomedia extends Wojenny implements IKomedia {

    public Komedia komedia;

    public WojennaKomedia(String nazwa, String kraj, String rok, int iloscBitw, int iloscBiletowNaWojenny, int wiek, int iloscBiletowNaKomedie) {
        super(nazwa, kraj, rok, iloscBitw, iloscBiletowNaWojenny);
        komedia = new Komedia(null, null, null, wiek, iloscBiletowNaKomedie);

    }

    @Override
    public float getZarobek() {
        return super.getZarobek() + komedia.zarobekNaKomedii();
    }

    @Override
    public int getWiek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() + " kategoria = " + komedia.getClass().getSimpleName() + ", iloscBiletowNaKomedie = " + komedia.getIloscBiletowNaKomedie() + ", wiek = " + komedia.getWiek() + "+";
    }

}
