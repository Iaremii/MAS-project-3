package dziedziczenie_wielokrotne;

/**
 *
 * @author Oleksandr
 */
public class Main {

    public static void main(String[] args) {
        Film terminator = new Wojenny("Sa", "pl", "1993", 192, 100);
        Film harryPoter = new Komedia("Harry", "USA", "1993", 18, 200);
        
        System.out.println(terminator);
        System.out.println(harryPoter);
        
        System.out.println(terminator.getZarobek());
        System.out.println(harryPoter.getZarobek());
        
        Film aa = new WojennaKomedia("NowaKOmediaWojenna", "pl", "1003", 122, 130, 12, 11); 
        System.out.println(aa);
        
        
//        System.out.println(terminator.getZarobek());
//        System.out.println(aa.getZarobek());
//        System.out.println(terminator);
//        System.out.println(aa);
    }

}
