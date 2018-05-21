package dziedczenie_dynamic;

enum RodzajFilmu {
    Horror, Komedia, Wojenny;
};

public class Film {

    private String nazwa;
    private String kraj;
    private String rok;

    private Horror horror;
    private Komedia komedia;
    private Wojenny wojenny;

    public Film(String nazwa, String kraj, String rok, RodzajFilmu rodzaj, String komediaLicensja, String horrorLicensja) {
        setNazwa(nazwa);
        setKraj(kraj);
        setRok(rok);
        if (rodzaj == RodzajFilmu.Horror) {
            this.horror = new Horror(this, horrorLicensja);
            this.komedia = null;
            this.wojenny = null;
        } else if (rodzaj == RodzajFilmu.Komedia) {
            this.horror = null;
            this.wojenny = null;
            this.komedia = new Komedia(this, komediaLicensja);
        } else if (rodzaj == RodzajFilmu.Wojenny) {
            this.horror = null;
            this.komedia = null;
            this.wojenny = new Wojenny(this);
        } else {
            this.horror = null;
            this.komedia = null;
            this.wojenny = null;
        }
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if (nazwa == null) {
            throw new IllegalArgumentException("Film musi miec nazwe");
        }
        this.nazwa = nazwa;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        if (kraj == null) {
            throw new IllegalArgumentException("Film musi miec kraj");
        }
        this.kraj = kraj;
    }

    public String getRok() {
        return rok;
    }

    public void setRok(String rok) {
        if (rok == null) {
            throw new IllegalArgumentException("Film musi miec rok");
        }
        this.rok = rok;
    }

    public String obejrz() {
        if (czyHorror()) {
            return getHorror().obejrz();
        } else if (czyKomedia()) {
            return getKomedia().obejrz();
        } else if (czyWojenny()) {
            return getWojenny().obejrz();
        } else {
            return "Nie oglądasz filmu";
        }
    }

    public void przepiszNaHorror(String licensja) {
        if (!czyHorror()) {
            this.horror = new Horror(this, licensja);
            usunKomedie();
            usunWojenny();
        }
    }

    public void przepiszNaKomedie(String licensja) {
        if (!czyKomedia()) {
            this.komedia = new Komedia(this, licensja);
            usunWojenny();
            usunHorror();
        }
    }

    public void przepiszNaWojenny() throws Exception {
        if (!czyWojenny()) {
            this.wojenny = new Wojenny(this);
            usunHorror();
            usunKomedie();
        }
    }

    public void usunHorror() {
        if (czyHorror()) {
            this.horror = null;
        }
    }

    public void usunWojenny() {
        if (czyWojenny()) {
            this.wojenny = null;
        }
    }

    public void usunKomedie() {
        if (czyKomedia()) {
            this.komedia = null;
        }
    }

    public boolean czyHorror() {
        if (this.horror == null) {
            return false;
        }
        return true;
    }

    public boolean czyWojenny() {
        if (this.wojenny == null) {
            return false;
        }
        return true;
    }

    public boolean czyKomedia() {
        if (this.komedia == null) {
            return false;
        }
        return true;
    }

    public Horror getHorror() {
        if (!czyHorror()) {
            throw new IllegalArgumentException("Isn't a horror!");
        }
        return horror;
    }

    public void setHorror(Horror horror) {
        this.horror = horror;
    }

    public Komedia getKomedia() {
        if (!czyKomedia()) {
            throw new IllegalArgumentException("Isn't a komedia!");
        }
        return komedia;
    }

    public void setKomedia(Komedia komedia) {
        this.komedia = komedia;
    }

    public Wojenny getWojenny() {
        if (!czyWojenny()) {
            throw new IllegalArgumentException("Isn't a wojenny!");
        }
        return wojenny;
    }

    public void setWojenny(Wojenny wojenny) {
        this.wojenny = wojenny;
    }

    public void setHorrorLicense(String licensja) {
        getHorror().setLicencja(licensja);
    }

    public void setKomediaLicensja(String licensja) {
        getKomedia().setLicencja(licensja);
    }

    public String getKomediaLicensja() {
        return getKomedia().getLicencja();
    }

    public String getHorrorLicensja() {
        return getHorror().getLicencja();
    }

    @Override
    public String toString() {
        return getNazwa() + "  " + getKraj() + "  " + getRok() + "\n" + "Horror: " + czyHorror() + "\n" + "Komedia: " + czyKomedia()
                + "\n" + "Wojenny: " + czyWojenny() + "\n" + (czyHorror() ? getHorror().getLicencja() : "")
                + (czyKomedia() ? getKomediaLicensja() : "");

    }

}
