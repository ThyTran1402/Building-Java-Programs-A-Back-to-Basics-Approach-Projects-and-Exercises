package vendingmachine;

/**
 *
 * @author Thy Tran
 */
public class VendingMachine {

    /**
     * Operates the vending machine and displays messages based o=n the outcomes.
     * @param keypad: the number entered by the customer on the keypad
     * @param payment: the amount of money in dollars the customer paid
     */
    public static void vend(int keypad, double payment) {
        boolean itemWanted = true;
        if(keypad < 1 || keypad > 9) {
            System.out.println("Selected an invalid item.");
            itemWanted = false;
        }else {
            System.out.println("Selected a valid item.");
            if(keypad > 6) {
                if(payment >= 1.50) {
                    System.out.println("Payment was enough.");
                } else {
                    System.out.println("Payment was not enough.");
                    itemWanted = false;
                } 
            }
            else if(keypad <= 6) {
                if(payment >= 1.25) {
                    System.out.println("Payment was enough.");
                } else {
                    System.out.println("Payment was not enough.");
                    itemWanted = false;
                }
            } 
        }
    
        if(itemWanted == true) {
            System.out.println("Here is your item.");
        } else {
            System.out.println("You get nothing.");
        }
    }
}
