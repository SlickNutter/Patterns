package Patterns.Decorator;

/**
 * @author SlickNutter
 */
public class Decorator {
    private ToDecorate t;
    
    public Decorator() {
        this.t = new ToDecorate();
    }
    public void greet() {
        this.t.greet();
        System.out.println("My name is Decorator!");
    }
}
