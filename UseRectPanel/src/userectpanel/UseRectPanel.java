//Demonstrates the RectPanel class by placing on into a GUI.
package userectpanel;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Thy Tran
 */
public class UseRectPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setTitle("A panel with reactangles");
        
        RectPanel panel = new RectPanel();
        panel.setBackgorund(Color.WHITE);
        frame.add(panel);
        
        frame.setVisible(true);
    }
}
