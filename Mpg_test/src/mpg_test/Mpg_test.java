/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpg_test;
import java.util.Scanner;
/**
 *
 * @author Thy Tran
 */
public class Mpg_test {

    public static void main(String[] args) {
        
        //Create a scanner to prompt for the user input
        Scanner in = new Scanner(System.in);
        //Prompt the user for entering the miles
        //System.out.println("Enter the number of miles:");
        double miles = in.nextDouble();
        //Prompt the user for entering the gallons
        //System.out.println("Enter the number of gallons:");
        double gallons = in.nextDouble();
        
        if(gallons != 0) {
            //Calculate the miles per gallon
            //double milesPerGallon = miles / gallons;
            System.out.println(miles / gallons);
    } else {
            System.out.println("Can not calculate.");
        }   
    }
}
