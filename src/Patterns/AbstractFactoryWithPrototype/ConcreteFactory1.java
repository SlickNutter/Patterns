package Patterns.AbstractFactoryWithPrototype;

/**
 * @author SlickNutter
 */
public class ConcreteFactory1 extends AbstractFactory {
    protected Product1 workingCopy = null;
    
    public ConcreteFactory1(String message) {
        this.workingCopy = new Product1(message);
    }

    public Product1 createInstance() {
        return this.workingCopy.clone();
    }
    
}
