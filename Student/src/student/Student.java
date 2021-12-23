/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;
/**
 *
 * @author Thy Tran
 * Create a Student class that can keep track of the name of the student as well as the scores for three tests.
 * Provide a constructor that sets all instance values based on parameter values.  Overload the constructor such that each test score is set to zero.
 * Provide a method called setTestScore that accepts two parameters: the test number (1 through 3) and the score.
 * Also provide a method called getTestScore that accepts the test number and returns the appropriate score.
 * Provide a method average that computes and returns the average test score for this student.
 */

public class Student {

    //Creates instance variables
    private String name; //name of the students
    private double testNumber1; //the number of the test
    private double testNumber2; //the test score of the student
    private double testNumber3; //the test number 3 of the student

    //Create a constructor with parameter values
    public Student (double testNumber1, double testNumber2, double testNumber3, String name) {
        this.name = name;
        this.testNumber1 = testNumber1;
        this.testNumber2 = testNumber2;
        this.testNumber3 = testNumber3;
    }

    //Overload the constructor so that the test score is set to 0
    public Student (String name) {
        this.name = name;
        this.testNumber1 = 0;
        this.testNumber2 = 0;
        this.testNumber3 = 0;
    }

    //Create a setTestScore method that takes two parameters: the test number and the score
    public void setTestScore(int testNums, double scores) {
        if(testNums == 1) {
            this.testNumber1 = scores;
        }
        else if(testNums == 2) {
            this.testNumber2 = scores;
        }
        else {
            this.testNumber3 = scores;
        }
    }

    //Create a getTestScore method that takes the test number and returns the appropriate score
    public double getTestScore(int numTest) {
        if(numTest == 1) {
            return this.testNumber1;
        } 
        else if(numTest == 2) {
            return this.testNumber2;
        }
        else {
            return this.testNumber3;
        }
    }

    //Create Avarage method that computes and returns the average test score for this student
    public double average() {
        //Computes the average of the 3 test scores of the student
        double average = (this.testNumber1 + this.testNumber2 + this.testNumber3) / 3;
        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("If you know the three test scores, enter 1.");
        while(!scanner.hasNextInt()) scanner.next();
        int userInput = scanner.nextInt();
        Student student;
        if(userInput == 1){
            System.out.println("Enter the three test scores:");
            while(!scanner.hasNextDouble()) scanner.next();
            double test1 = scanner.nextDouble();
            while(!scanner.hasNextDouble()) scanner.next();
            double test2 = scanner.nextDouble();
            while(!scanner.hasNextDouble()) scanner.next();
            double test3 = scanner.nextDouble();
            student = new Student(test1, test2, test3, name);
        }
        else{
            student = new Student(name);
        }
        System.out.println("Enter 1 to change a test score.");
        while(!scanner.hasNextInt()) scanner.next();
        userInput = scanner.nextInt();
        if(userInput == 1){
            System.out.println("Enter the test score to change:");
            while(!scanner.hasNextInt()) scanner.next();
            int testChange = scanner.nextInt();
            System.out.println("Enter the new score:");
            while(!scanner.hasNextDouble()) scanner.next();
            double newScore = scanner.nextDouble();
            student.setTestScore(testChange, newScore);
        }
        System.out.println("Enter 1 to view a test score.");
        while(!scanner.hasNextInt()) scanner.next();
        userInput = scanner.nextInt();
        if(userInput == 1){
            System.out.println("Enter the test score to view:");
            while(!scanner.hasNextInt()) scanner.next();
            int testScore = scanner.nextInt();
            System.out.println(student.getTestScore(testScore));
        }
        System.out.println("Average " + student.average());
        System.out.println();
    }
}
