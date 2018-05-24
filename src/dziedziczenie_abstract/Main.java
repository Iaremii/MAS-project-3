package dziedziczenie_abstract;
/**
 *
 * @author Oleksandr
 */
public class Main {

    public static void main(String[] args) {
        Kanapka n1 = new Indyk("indyk", "ciemne", 15, 13.5, "kola");
        Kanapka n3 = new Wegetarianska("wegetarianska", "piezs", 15, 12, "jabko", "kola");
        System.out.println(n1);
        System.out.println(n3);
        
        System.out.println( "Indyk: " + n1.wypiszKalorii());
        System.out.println( "Wega: " +n3.wypiszKalorii());
        
      
        
        
    }
    
}

