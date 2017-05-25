/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Patterns.AbstractFactoryWithPrototype;

/**
 * @author SlickNutter
 */
abstract public class AbstractSingletonFactory extends AbstractFactory {
    private static AbstractSingletonFactory factory = null;
    
    protected final static boolean isInstanced() {
        return factory != null;
    }
    
    protected AbstractSingletonFactory(Product product) {
        factory = this;
        this.workingCopy = product;
    }
    
    /**
     * The implementation of this function are suposed to either return the already 
     * instatiated factory, or instantiate the factory and return it.
     * 
     * @param product
     * @return 
     */
    abstract public AbstractSingletonFactory instance(Product product);
    
}
