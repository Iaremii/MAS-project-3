package dziedczenie_dynamic;

public class Horror {

    private String horroLicensja;
    private Film film;

    public Horror(Film film,String licencja)  {
        if (film == null) {
            throw new IllegalArgumentException("Film cant be null");
        }
        this.film = film;
        setLicencja(licencja);
        
    }
    
    public String obejrz() {
        return "Wypij kole przed począkiem";
    }

    public String getLicencja() {
        return horroLicensja;
    }
    

    public void setLicencja(String licencja) {
        if(licencja == null){
            throw new IllegalArgumentException("Film license can't be null");
        }
        this.horroLicensja = licencja;
    }

    public Film getFilm() {
        return film;
    }
    

    @Override
    public String toString() {
        return "Horror{" + "licencja=" + getLicencja() + ", film=" + getFilm() + '}';
    }
    

    

}
