package dziedziczenie_abstract;

import java.util.HashMap;

/**
 *
 * @author Oleksandr
 */
public abstract class Kanapka {

    private String pieczywo;
    private int wielkosc;
    private double cena;
    public static HashMap<String, Integer> kalorii;
    private static int count = 0;

    public Kanapka(String pieczywo, int wielkosc, double cena) {
        super();
        setPieczywo(pieczywo);
        setWielkosc(wielkosc);
        setCena(cena);
        if (count == 0) {
            przypisKalorii();
            count++;
        }

    }

    public void przypisKalorii() {
        kalorii = new HashMap<>();
        kalorii.put("kurczak", 200);
        kalorii.put("indyk", 300);
        kalorii.put("kola", 70);
        kalorii.put("fanta", 80);
        kalorii.put("jabko", 50);
        kalorii.put("ciasteczko", 40);
        kalorii.put("wegetarianska", 100);
    }

    public static HashMap<String, Integer> getKalorii() {
        return new HashMap<>(kalorii);
    }

   

    public void setPieczywo(String pieczywo) {
        if (pieczywo != null) {
            this.pieczywo = pieczywo;
        } else {
            throw new RuntimeException("Invalid value - pieczywo is null");
        }
    }

    public void setWielkosc(int wielkosc) {
        if (wielkosc >= 15 && wielkosc <= 30) {
            this.wielkosc = wielkosc;
        } else {
            throw new RuntimeException("Kanapka musi byc 15 lub 30 cm"); 
        }
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

   

    public String getPieczywo() {
        return pieczywo;
    }

    public int getWielkosc() {
        return wielkosc;
    }

    public double getCena() {
        return cena;
    }

    public abstract int wypiszKalorii();

    @Override
    public String toString() {
        return "Kanapka{ pieczywo = " + pieczywo + ", wielkosc = " + wielkosc + ", cena = " + cena + "zl, ";
    }

}
