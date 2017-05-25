package Patterns.AbstractFactoryWithPrototype;

/**
 * @author SlickNutter
 * 
 * Child classes of this Factory are should always return identical instances of
 * a certain type.
 */
abstract public class AbstractFactory {
    protected Product workingCopy;
    abstract public Product createInstance();
}
