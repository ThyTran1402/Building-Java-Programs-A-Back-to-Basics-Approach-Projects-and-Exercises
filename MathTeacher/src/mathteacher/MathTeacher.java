/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathteacher;
import java.util.Scanner;
/**
 *
 * @author Thy Tran
 */
public class MathTeacher {
    public static int addNumbers(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
    }
    
    public static int subtractNumbers(int n1, int n2) {
		int subtract = n1 - n2;
		return subtract;
    }
    
    public static int multiplyNumbers(int n1, int n2) {
		int multiply = n1 * n2;
		return multiply;
    }
    
    public static int divideNumbers(int n1, int n2) {
	int division = n1 / n2;
	return division;
    }


    public static void main(String[] args) {
        //Declare two integers 
        int n1 = 0, n2 = 0;
	String answer = "";
	//Create a Scanner object
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to *Mental Math Practice* where you can test your addition, subtraction, multiplication, and division.");
	do {
            System.out.println("Enter two integers: ");
            while(!sc.hasNextInt()) {
                sc.next();
            }
            n1 = sc.nextInt();
            
            while(!sc.hasNextInt()) {
                sc.next();
            }
            n2 = sc.nextInt();
        System.out.println("Enter 1 to add the two numbers.");
        System.out.println("Enter 2 to subtract the second number from the first number.");
	System.out.println("Enter 3 to multiply the two numbers.");
	System.out.println("Enter 4 to divide the first number by the second number.");
	//Read in the choice number
        int choice = sc.nextInt();
	switch(choice) {
	case 1:
	System.out.println(MathTeacher.addNumbers(n1, n2));
	break;
	case 2:
	System.out.println(MathTeacher.subtractNumbers(n1, n2));
	break;
	case 3:
	System.out.println(MathTeacher.multiplyNumbers(n1, n2));
	break;
	case 4:
	System.out.println(MathTeacher.divideNumbers(n1, n2));
	break;
	default:
	System.out.println("Enter a valid choice.");
        break;
	}
            System.out.println("Enter 'Quit' to end the program.");
            sc.nextLine();
            answer = sc.nextLine();
	} while(!answer.equals("Quit"));

    }
    
}
