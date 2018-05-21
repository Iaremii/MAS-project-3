package dziedziczenie_wielokrotne;

public abstract class Film {

    private String nazwa;
    private String kraj;
    private String rok;

    public final int CENABILETA = 5;

    public Film(String nazwa, String kraj, String rok) {
        super();
        this.nazwa = nazwa;
        this.kraj = kraj;
        this.rok = rok;
    }

    
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public String getRok() {
        return rok;
    }

    public void setRok(String rok) {
        this.rok = rok;
    }

    public abstract float getZarobek();

    @Override
    public String toString() {
        return "Film{" + "nazwa = " + nazwa + ", kraj = " + kraj + ", rok = " + rok + ", cena Bileta = " + CENABILETA + "$, ";
    }

}
