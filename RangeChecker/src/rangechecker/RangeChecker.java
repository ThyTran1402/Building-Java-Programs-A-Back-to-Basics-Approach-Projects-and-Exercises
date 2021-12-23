/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangechecker;

/**
 *
 * @author Thy Tran
 */
public class RangeChecker {

    /**
     * Checks whether or not the number id between two other numbers (exclusive)
     * @note: you may assume that low will always be lower than high
     * @param number: the number
     * @param low: the low end of the range
     * @param high: the high end of the range
     * @return: true if the number is in range (exclusive), otherwise false
     */
    public static boolean isBetweenExclusive(int number, int low, int high) {
        if (number > low && number < high) {
            System.out.println("The number is in between.");
            return true;
        }else {
            System.out.println("The number id not in between");
            return false;
        } 
    }
    
    
}
