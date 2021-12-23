//A GUI to compute a person's body mass index (BMI).
//Final version with event handling.

package bmigui3;
import java.awt.*;
import java.awt.event.*;
import java.swing.*;
/**
 *
 * @author Thy Tran
 */
public class BmiGui3 implements ActionListener{
    //BmiGui3 is its own runnable client program
    public static void main(String[] args) {
        BmiGui3 = new BmiGui3();
    }
    
    //onscreen components stored as fields
    private JFrame frame;
    private JTextField heightField;
    private JTextField weightField;
    private JLabel bmiLabel;
    private JButton computeButton;
    
    public BmiGui3() {
        //set up components
        heightField = new JTextField(5);
        weightField = new JTextField(5);
        bmiLabel = new JButton("Compute");
        
        //attempt GUI as event to Compute button
        computeButton.addActionListener(this);
        
        //layout
        JPanel north = new JPnael(new GridLayout(2, 2));
        north.add(new JLabel("Height: "));
        north.add(heightField);
        north.add(new JLabel("Weight: "));
        north.add(weightField);
        
        //overall frame
        frame = new JFrame("BMI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(north, BorderLayout.NORTH);
        frame.add(bmiLabel, BorderLayout.CENTER);
        frame.add(computeButton, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
    
    //Handles clicks on Compute button by computing the BMI.
    public void actionPerformed(ActionEvent event) {
        //read height/weight infor from text fields
        String heightText = heightField.getText();
        double height = Double.parseDouble(heightText);
        String weightText = weightField.getText();
        double weight = Double.parseDouble(weightText);
        
        //Compute BMI and display it onscreen
        double bmi = weight / (height * height) * 703;
        bmiLabel.setText("BMI: " + bmi);
    }
    
}
