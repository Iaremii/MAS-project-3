package dziedziczenie_wieloaspektowe;

import java.util.HashSet;

public abstract class TypSamochodu {

    private int potegaSilnika;
    private Samochod baza;
    private static HashSet<TypSamochodu> ekstensja;

    public TypSamochodu(Samochod baza, int potegaSilnika) {
        setPotegaSilnika(potegaSilnika);
        setBaza(baza);
        ekstensja.add(this);
    }

    private void sprawdzNaDublikaty(Samochod baza) {
        for (TypSamochodu typSamochodu : ekstensja) {
            if (typSamochodu.getBaza().equals(baza)) {
                throw new RuntimeException("Baza juz ma przydzielony typ samochodu");
            }

        }

    }

    public int getPotegaSilnika() {
        return potegaSilnika;
    }

    public void setPotegaSilnika(int potegaSilnika) {
        this.potegaSilnika = potegaSilnika;
    }

    public Samochod getBaza() {
        return baza;
    }

    public void setBaza(Samochod baza) {
        if (baza == null) {
            try {
                sprawdzNaDublikaty(baza);
                this.baza = baza;
                baza.setTyp(this);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }
}
