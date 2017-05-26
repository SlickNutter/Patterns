package Patterns;

import Patterns.AbstractFactoryWithPrototype.*;
import Patterns.Singleton.*;
import Patterns.Decorator.*;
import Patterns.Flyweight.*;
/**
 * @author SlickNutter
 */
public class Patterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree[] forest = new Tree[3];
        Birch birch = Birch.Instance();
        Oak oak = Oak.Instance();
        for (int i = 0; i < 3; ++i) {
            TreeComon type;
            if(i%2 == 0) {
                type = oak;
            }
            else {
                type = birch;
            }
            forest[i] = new Tree(i, i+2, type);
        }
        for (int i = 0; i < 3; ++i) {
            System.out.println(forest[i].getModel());
        }
    }
    
}
