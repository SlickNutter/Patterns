package Patterns.Flyweight;

/**
 * @author SlickNutter
 */
public class Birch implements TreeComon{
    private static Birch birch = null;
    private Birch() {
        birch = this;
    }
    private static boolean isInstanced() {
        return birch != null;
    }
    
    public String getModel() {
        return "Super kewl Birch model!";
    }
    public static Birch Instance() {
        if (isInstanced()) {
            return birch;
        }
        else {
            return new Birch();
        }
    }
}
