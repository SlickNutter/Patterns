package Patterns;

import Patterns.Singleton.Singleton;

/**
 * @author SlickNutter
 */
public class Patterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singleton sg = Singleton.instance();
        System.out.println(sg.getMessage());
        Singleton vg = Singleton.instance();
        vg.setMessage("Changed");
        System.out.println(sg.getMessage());
    }
    
}
