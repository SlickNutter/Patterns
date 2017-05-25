package Patterns.AbstractFactoryWithPrototype;

/**
 * @author SlickNutter
 * 
 * Because I like it, the Products being used in the factories as templates, 
 * are implementations of the Prototype Pattern (GoF [page 133]).
 */
public interface Product {
    public Product clone();
}
