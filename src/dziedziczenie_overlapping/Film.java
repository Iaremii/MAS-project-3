package dziedziczenie_overlapping;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

enum FilmyRodzaje {
    Horror, Komedia
};

public class Film {

    private long id;
    private String nazwa, kraj, rok, horrorLicensja, komediaLicensja;
    private EnumSet<FilmyRodzaje> rodzaje;
    private static ArrayList<Film> filmy = new ArrayList<>();

    public Film(long id, String nazwa, String kraj, String rok, String horrorLicensja, String komediaLicensja, EnumSet<FilmyRodzaje> rodzaje) {
        this.rodzaje = rodzaje;
        if (nazwa == null || kraj == null || rok == null) {
            throw new IllegalArgumentException("Sprawdz dane");
        } else {
            this.id = id;
            this.nazwa = nazwa;
            this.kraj = kraj;
            this.rok = rok;
        }
        if (rodzaje.contains(FilmyRodzaje.Horror)) {
            setHorrorLicensja(horrorLicensja);
        }
        if (rodzaje.contains(FilmyRodzaje.Komedia)) {
            setKomediaLicensja(komediaLicensja);
        }
        filmy.add(this);

    }

    public boolean czyHorror() {
        if (this.rodzaje.contains(FilmyRodzaje.Horror)) {
            return true;
        }
        return false;
    }

    public boolean czyKomedia() {
        if (this.rodzaje.contains(FilmyRodzaje.Komedia)) {
            return true;
        }
        return false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHorrorLicensja() {
        if (!czyHorror()) {
            throw new IllegalArgumentException("Isn't a horror!");
        }
        return horrorLicensja;
    }

    public void setHorrorLicensja(String horrorLicensja) {
        if (horrorLicensja == null) {
            throw new IllegalArgumentException("License can't be null!");
        }
        if (!czyHorror()) {
            throw new IllegalArgumentException("Isn't a horror!");
        }
        this.horrorLicensja = horrorLicensja;
    }

    public String getKomediaLicensja() {
        if (!czyKomedia()) {
            throw new IllegalArgumentException("Isn't a komedy!");
        }
        return komediaLicensja;
    }

    public void setKomediaLicensja(String komediaLicensja) {
        if (komediaLicensja == null) {
            throw new IllegalArgumentException("License can't be null!");
        }
        if (!czyKomedia()) {
            throw new IllegalArgumentException("Isn't a komedy!");
        }
        this.komediaLicensja = komediaLicensja;
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

    public static ArrayList<Film> getFilmy() {
        return new ArrayList<>(filmy);
    }

    public EnumSet<FilmyRodzaje> getFilmyRodzaje() {
        EnumSet<FilmyRodzaje> typ = this.rodzaje;
        return typ;
    }

    @Override
    public String toString() {
        return "Film{" + "id=" + id + ", nazwa=" + nazwa + ", kraj=" + kraj + ", rok=" + rok + ", horrorLicensja=" + horrorLicensja + ", komediaLicensja=" + komediaLicensja + ", rodzaje=" + rodzaje + '}';
    }

    void usunRodzaj(FilmyRodzaje filmyRodzaje) {
        if (rodzaje.contains(filmyRodzaje)) {
            rodzaje.remove(filmyRodzaje);

        } else {
            throw new IllegalArgumentException("Nieznany rodzaj filmu");
        }

    }

}
