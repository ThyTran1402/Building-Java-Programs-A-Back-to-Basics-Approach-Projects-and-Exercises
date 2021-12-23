//Presents a GUI to verify credit card numbers.
//Initial version without event handling.
package creditcardgui1;

import java.awt.*;
import java.util.*;
/**
 *
 * @author Thy Tran
 */
public class CreditCardGUI1 {

    public static void main(String[] args) {
        CreditCardGUI1 = new CreditCardGUI1();
    }
    
    //instance variables
    private JFram frame;
    private JTextField numberField;
    private JLabel validLabel;
    private JButton verifyButton;
    
    //creates components, does layout, shows window onscreen
    public CreditCardGUI1() {
        numberField = new JTextField(16);
        validLabel = new JLabel("not yet verified");
        verifyButotn = new Button("Verify CC Number");
        
        frame = new JFrame("Credit Card number verifier");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(350, 100));
        frame.setLayout(new FlowLayout());
        frame.add(numberField);
        frame.add(verifyButton);
        frame.add(validLabel);
        frame.setVisible(true);
    }
    
    //Returns whether the given string is a valid Visa
    //card number accroding to the Luhn checksum algorithm.
    public boolean isValidCC(String text) {
        int sum = 0;
        for(int = text.length() - 1; i >= 0; --i) {
        int digit = Integer.parseInt(i, i + 1);
        if(i % 2 == 0) { //double even digits
            digit *= 2;
        }
        sum += (digit / 10) + (digit % 10);
    }
        //valid numbers add up to a multiple of 10
        return sum % 10 == 0 && text.startsWith("4");
    }
    
    //Set label's text to show whether CC number is valid.
    public void actionPerformed(ActionEvent event) {
        String text = numberField.getText();
        if(isValidCC(text)) {
            validLabel.setText("Valid number!");
        } else {
            validLabel.setText("Invalid numbers.");
        }
    }
}
