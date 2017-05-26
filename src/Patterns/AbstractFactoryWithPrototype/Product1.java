package Patterns.AbstractFactoryWithPrototype;

/**
 * @author SlickNutter
 *
 * Because I'm getting familiar with the keyword 'static', I decided to implement
 * a global counter, that tells us the amountCreated of Product1s that have been created.
 */
public class Product1 implements Product{
    private String message = "Hi gurls!";
    private static int amountCreated = 0;
    
    public Product1(String message) {
        amountCreated++;
        this.message = message;
    }
    public Product1() {
        amountCreated++;
    }
    public String getMessage() {
        return this.message;
    }
    public Product1 clone() {
        Product1 toReturn = new Product1(this.message);
        return toReturn;
    }
    public static int getAmountCreated() {
        return amountCreated;
    }
}
