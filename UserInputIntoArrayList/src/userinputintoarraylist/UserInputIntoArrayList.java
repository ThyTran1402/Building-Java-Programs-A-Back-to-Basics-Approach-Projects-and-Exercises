/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinputintoarraylist;

/**
 *
 * @author Thy Tran
 */
import java.util.ArrayList;
import java.util.Scanner;
public class UserInputIntoArrayList 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        ArrayList<String> userTime = new ArrayList<>();
        //while the user wants to continue..keep asking!
        boolean moreInput = true;
        while(moreInput)
        {
            System.out.println("What time did this happen? hh:mm");
            userTime.add(s.next());
            System.out.println("Do you wish to continue? true or false");
            moreInput = s.nextBoolean();
        }
        //store their answer in an ArrayList of Strings
        for(String string : userTime) {
            System.out.println(string);
        }
        //enter the current time
        //after the user wished to quit..print out all the times
    }
    
}
