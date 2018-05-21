package dziedczenie_dynamic;

public class Komedia {
    private String komediaLicencja;
    private Film film;

    public Komedia(Film film ,String komediaLicencja) {
        if (film == null) {
            throw new IllegalArgumentException("Film cant be null");
        }
        this.film = film;
    }
     public String getLicencja() {
        return komediaLicencja;
    }
    

    public void setLicencja(String licencja) {
        if(licencja == null){
            throw new IllegalArgumentException("Film license can't be null");
        }
        this.komediaLicencja = licencja;
    }

    public Film getFilm() {
        return film;
    }
    public String obejrz() {
        return "Wylącz telefon !";
    }

    @Override
    public String toString() {
        return "Komedia{" + "komediaLicencja=" + getLicencja() + ", film=" + getFilm() + '}';
    }
    

    
    

}
