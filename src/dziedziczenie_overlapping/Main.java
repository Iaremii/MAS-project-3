package dziedziczenie_overlapping;

import java.util.EnumSet;

/**
 *
 * @author Oleksandr
 */
public class Main {

    public static void main(String[] args) {

        Film test = new Film(1, "Harry Poter", "PL", "1002", "EC2212", "ES2212", EnumSet.of(FilmyRodzaje.Horror, FilmyRodzaje.Komedia));
        System.out.println(test);
        test.usunRodzaj(FilmyRodzaje.Komedia);
        System.out.println(test);

    }

}
