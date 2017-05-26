package Patterns.Flyweight;

/**
 * @author SlickNutter
 */
public class Oak implements TreeComon{
    private static Oak oak = null;
    private Oak() {
        oak = this;
    }
    private static boolean isInstanced() {
        return oak != null;
    }
    
    public String getModel() {
        return "Super sturdy Oak model!";
    }
    public static Oak Instance() {
        if (isInstanced()) {
            return oak;
        }
        else {
            return new Oak();
        }
    }
}
