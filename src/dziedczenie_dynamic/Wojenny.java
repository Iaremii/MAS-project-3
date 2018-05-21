package dziedczenie_dynamic;

public class Wojenny {

    private Film film;

    public Wojenny(Film film) {
        if (film == null) {
            throw new IllegalArgumentException("Film can't be null");
        }
        this.film = film;
    }

    public String obejrz() {
        return "Bedzie gorąco";
    }

    public Film getFilm() {
        return film;
    }

    @Override
    public String toString() {
        return "Wojenny{" + "film=" + film + '}';
    }
    
}

