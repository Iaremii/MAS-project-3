package dziedziczenie_abstract;

import java.util.Map;

/**
 *
 * @author Oleksandr
 */
public class Wegetarianska extends Kanapka {

    private String nazwa;
    private String przystawka;
    private String napoj;

    public Wegetarianska(String nazwa, String pieczywo, int wielkosc, double cena, String przystawka, String napoj) {
        super(pieczywo, wielkosc, cena);
        setPrzystawka(przystawka);
        setNapoj(napoj);
        setNazwa(nazwa);
       

    }

    public String getNapoj() {
        return napoj;
    }

    public void setNapoj(String napoj) {
        this.napoj = napoj;
    }

    public String getPrzystawka() {
        return przystawka;
    }

    public void setPrzystawka(String przystawka) {
        if (przystawka != null) {
            this.przystawka = przystawka;
        } else {
            throw new RuntimeException("Invalid value - przystawka is null");
        }
    }

    public void setNazwa(String nazwa) {
        if (nazwa != null) {
            this.nazwa = nazwa;
        } else {
            throw new RuntimeException("Invalid value - nazwa is null");
        }
    }

    public String getNazwa() {
        return nazwa;
    }

    public int wyliczKaloriiWegetarianskiej() {
        int sumaKalorii = 0;

        for (Map.Entry me : Kanapka.getKalorii().entrySet()) {
            if (getNapoj() == me.getKey()) {
                sumaKalorii += (int) me.getValue();
            }
            if (getPrzystawka() == me.getKey()) {
                sumaKalorii += (int) me.getValue();
            }
            if(getNazwa() == me.getKey()){
                sumaKalorii += (int) me.getValue();
            }

        }
        return sumaKalorii;
    }

    @Override
    public int wypiszKalorii() {
        return wyliczKaloriiWegetarianskiej();
    }

    @Override
    public String toString() {
        return super.toString()  + "nazwa = " + getClass().getSimpleName()  + ", przystawka = " + przystawka + ", napoj = " + napoj + '}';
    }

    

}
