package dziedziczenie_abstract;

import java.util.Map;

/**
 *
 * @author Oleksandr
 */
public class Indyk extends Kanapka {

    private String mieso, napoj;

    public Indyk(String nazwa, String pieczywo, int wielkosc, double cena, String mieso, String napoj) {
        super( pieczywo, wielkosc, cena);
        setMieso(mieso);
        setNapoj(napoj);

    }

    public String getMieso() {
        return mieso;
    }

    public void setMieso(String mieso) {
        if (mieso != null) {
            this.mieso = mieso;
        } else {
            throw new RuntimeException("Invalid value - mieso is null");
        }
    }

    public String getNapoj() {
        return napoj;
    }

    public void setNapoj(String napoj) {
        if (napoj != null) {
            this.napoj = napoj;
        } else {
            throw new RuntimeException("Invalid value - napoj is null");
        }
    }

    public int wyliczKaloriiIndyka() {

        int sumaKalorii = 0;

        for (Map.Entry me : Kanapka.getKalorii().entrySet()) {
            if (getNapoj() == me.getKey()) {
                sumaKalorii += (int) me.getValue();
            }
            if (getMieso() == me.getKey()) {
                sumaKalorii += (int) me.getValue();
            }

        }
        return sumaKalorii;
    }

    @Override
    public int wypiszKalorii() {
        return wyliczKaloriiIndyka();
    }

    @Override
    public String toString() {
        return super.toString() + "nazwa = " + getClass().getSimpleName() + ", mieso = " + mieso + ", napoj = " + napoj + '}';
    }

}
