//A simple interface for drawing persostent images.
//Initial version without events.

package drawingpanel;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

/**
 *
 * @author Thy Tran
 */
public class DrawingPanel {
    //Instance variables
    private JFrame frame; //overall window frame
    private JPanel panel; //drawing surface
    private Graphic g; //drawing pen
    
    //construct a drawing panel of given size
    public DrawingPanel(int width, int height) {
        //sets up the empty image onto which we will draw
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        g = image.getGraphics();
        g.setColor(Color.BLACK);
        
        //set up the JFrame
        frame = new JFrame("Drawing Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    
    //obtains the Graphic object to draw on the panel
    public Graphics getGraphics() {
        return g;
    }
    
    //set the background color of the drawing panel
    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}
