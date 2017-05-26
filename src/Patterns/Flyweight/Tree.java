package Patterns.Flyweight;

/**
 * @author SlickNutter
 */
public class Tree {
    private int position_x;
    private int position_y;
    private TreeComon comon = null;
    
    public Tree(int x, int y, TreeComon my_comon) {
        this.position_x = x;
        this.position_y = y;
        comon = my_comon; 
    }
    public int[] getPosition() {
        int[] position = {this.position_x, this.position_y};
        return position;
    }
    public String getModel() {
        return comon.getModel();
    }
}
