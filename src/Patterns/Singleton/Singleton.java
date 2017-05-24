package Patterns.Singleton;

/**
 * @author SlickNutter
 * 
 * This is an implementation of the GoFs singleton pattern.
 */
public class Singleton {
    private static Singleton singleton = null;
    private String message;
    
    private Singleton() {
        singleton = this;
        this.message = "Default";
    }
    private static boolean isInstanced() {
        return singleton != null;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
    public static Singleton instance() {
        if (isInstanced()) {
            return singleton;
        }
        else {
            return new Singleton();
        }
    }
}
