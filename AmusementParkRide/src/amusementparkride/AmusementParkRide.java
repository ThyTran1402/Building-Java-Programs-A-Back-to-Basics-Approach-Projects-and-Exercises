/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amusementparkride;

/**
 *
 * @author Thy Tran
 */
public class AmusementParkRide {

    /**
     * Checks if the person is eligible to ride this roller coaster.
     * @param age: the rider's age in years
     * @param height: the rider's height in inches
     * @return: true if the person is eligible for the ride, otherwise false
     */
    public static boolean checkRider(int age, int height) {
        if(age >= 12 && height >= 41) {
            System.out.println("The person is eligible for the ride.");
            return true;
        }else {
            System.out.println("The person is not eligible for the ride.");
            return false;
        }
    }
    
    /**
     * Checks if the person is eligible to ride this roller coaster.
     * @param age: the rider's age in years
     * @param height: the rider's height in inches
     * @param withAdult: whether or not the person is with an adult
     * @return: true if the person is eligible for the ride, otherwise false
     */
    public static boolean checkRider2(int age, int height, boolean withAdult) {
        
        if(age >= 12 && height >= 41 || withAdult) {
            System.out.println("The person is not eligible for the ride.");
            return true;
        }else {
            return false;
        }
    }
}