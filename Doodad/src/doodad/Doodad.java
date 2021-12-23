/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
package doodad;

/**
 *
 * @author Thy Tran
 */

import java.util.*;
public class Doodad {
    //Declare the instance variables for the Doodad object
   int number1;
   int number2;
   String word1;
   String word2;
   //Constructor for Doodad class
   public Doodad(int number1, int number2, String word1, String word2) {
    this.number1 = number1;
    this.number2 = number2;
    this.word1= word1;
    this.word2 = word2;
}
    // Allow other classes to read and
   //return the number1 
    public int getNumber1() {
        return number1;
    }
    //Allow other classes to read and
    //return the number2 
    public int getNumber2() {
        return number2;
    }
    //Allow other classes to read and
    //return the String1
    public String getWord1() {
        return word1;
}
    //Allow other classes to read and
    //return the String2 
    public String getWord2() {
        return word2;
    }
    //Set the number1 
    public void setNumber1(int number1) {
        number1 = this.number1;
    }
    //Set the number2
    public void setNumber2(int number2) {
        number2 = this.number2;
    }
    //Set the word1
    public void setWord1(String word1) {
        word1 = this.word1;
    }
    //Set the word2
    public void setWord2(String word2) {
        word2 = this.word2;
    }

    public static void main(String[] args) {
        //Create the Doodad array and initialize it 100
        Doodad[] myDoodads = new Doodad[100];
        char answer = ' ';
        int n = 0; //Innitalize n 
        int num1, num2;
        String text1, text2;
        //Create a scanner to read in the input
        Scanner in = new Scanner(System.in);
        do {
        //Prompt the user for the number1
        System.out.println("Enter number 1 ");
        num1 = in.nextInt();
        //Prompt the user for the number2
        System.out.println("Enter number 2 ");
        num2 = in.nextInt();
        //Prompt the user for string1
        System.out.println("Enter word 1");
        text1 = in.next();
        //Prompt the user for string2
        System.out.println("Enter word 2");
        text2 = in.next();
        //Prompt the user for quitting the program
        System.out.println("Enter q to quit.");
        answer = in.next().charAt(0);
        //Construct a new Doodad object
        Doodad d = new Doodad(num1, num2, text1, text2);
        //Assign the array of Doodad object to Doodad
        myDoodads[n] = d;
        //Increment n to keep track of the object array
        n++;
      }while(answer != 'q' && answer == 'n' );
        //For loop to keep track of the numbers and the strings are entered.
        for(int i = 0; i < n; ++i) {
            System.out.println(myDoodads[i].getNumber1() + " " + myDoodads[i].getWord1());
        }    
      
    }
}

