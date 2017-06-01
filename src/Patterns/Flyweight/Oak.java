package Patterns.Flyweight;

/**
 * @author SlickNutter
 */
public class Oak implements TreeComon{
    private static Oak instance;
    private Oak() {
        
    }    
    
    public String getModel() {
        return "Super sturdy Oak model!";
    }
    
    public static Oak Instance() {
        if ( instance == null ) {
            instance = new Oak();
        }
        
        return instance;
    }
}
