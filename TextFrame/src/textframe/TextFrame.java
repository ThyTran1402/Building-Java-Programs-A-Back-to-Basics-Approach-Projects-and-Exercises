//Demonstrates the JTextArea components
package textframe;
import java.awt.*;
import java.swing.*;
/**
 *
 * @author Thy Tran
 */
public class TextFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(new Dimension(300, 150));
        frame.setTitle("Text frame");
        
        JTextArea area = new JTextArea(5, 20);
        frame.add(area);
        
        frame.setVisible(true);
    }
    
}
