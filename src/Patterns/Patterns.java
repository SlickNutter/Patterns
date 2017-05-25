package Patterns;

import Patterns.Singleton.Singleton;
import Patterns.AbstractFactoryWithPrototype.*;
/**
 * @author SlickNutter
 */
public class Patterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product1 pr1 = new Product1();
        System.out.println(Product1.getAmountCreated());
        ConcreteFactory1 cf1 = new ConcreteFactory1("Teh lulz is here!");
        Product1 pr2 = cf1.createInstance();
        Product1 pr3 = cf1.createInstance();
        System.out.println(Product1.getAmountCreated());
        System.out.println(pr1.getMessage()+ " Product 1");
        System.out.println(pr2.getMessage()+ " Product 2");
        System.out.println(pr3.getMessage()+ " Product 3");
    }
    
}
