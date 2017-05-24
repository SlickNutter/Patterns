/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Patterns.AbstractFactoryWithPrototype;

/**
 * @author SlickNutter
 * 
 * 
 */
abstract public class AbstractFactory {
    private Product workingCopy;
    abstract public Product createInstance();
    
}
