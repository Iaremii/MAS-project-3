package dziedziczenie_wielokrotne;

public class Wojenny extends Film {

    private int iloscBitw;
    private int iloscBiletowNaWojenny;

    public Wojenny(String nazwa, String kraj, String rok, int iloscBitw, int iloscBiletow) {
        super(nazwa, kraj, rok);
        this.iloscBitw = iloscBitw;
        this.iloscBiletowNaWojenny = iloscBiletow;
    }

    public int getIloscBitw() {
        return iloscBitw;
    }

    public void setIloscBitw(int iloscBitw) {
        this.iloscBitw = iloscBitw;
    }

    public int getIloscBiletow() {
        return iloscBiletowNaWojenny;
    }

    public float zarobekNaWojenny() {
        return getIloscBiletow() * CENABILETA;
    }

    @Override
    public float getZarobek() {
        return zarobekNaWojenny();
    }

    @Override
    public String toString() {
        return super.toString() + " kategoria = " + getClass().getSimpleName() + "iloscBitw = " + iloscBitw + ", iloscBiletowNaWojenny = " + iloscBiletowNaWojenny + "sztuk }";
    }

}
