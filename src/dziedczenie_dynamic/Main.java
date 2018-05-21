package dziedczenie_dynamic;

/**
 *
 * @author Oleksandr
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Film terminator = new Film("Terminator", "PL", "1995", RodzajFilmu.Horror, "rr2213", "c21");
        System.out.println(terminator);
        terminator.przepiszNaKomedie("c22");
        System.out.println(terminator);
        terminator.przepiszNaWojenny();
        System.out.println(terminator.obejrz());
        
       
        

        
    }

}
