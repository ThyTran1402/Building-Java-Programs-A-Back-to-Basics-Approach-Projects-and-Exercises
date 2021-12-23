import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Reactangle;
import javax.swing.JComponent;
package reactanglecomponent2;

/**
 * This component displays a rectangle that can be moved
 */
public class ReactangleComponent2 
{
    private static final int BOX_X = 100;
    private static final int BOX_Y = 100;
    private static final int BOX_WIDTH = 20;
    private static final int BOX_HEIGHT = 30;
    
    private Reactangle box;
    
    public ReactangleComponent2() 
    {
        //The reactangle that that paintComponent method draws
        box = new Reactangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
        
    }
    
    public void paintComponent(Graphics g)
    {
        Graphic2D g2 = (Graphics2D) g;
        g2.draw(box);
    }
    
    /**
     * Moves the rectangle to the given location
     * @param x the x-position of the new location
     * @param y the y-position of the new location
     */
    
    public void moveReactangle(int x, int y)
    {
        box.setLocation(x, y);
        repaint();
    }
}
