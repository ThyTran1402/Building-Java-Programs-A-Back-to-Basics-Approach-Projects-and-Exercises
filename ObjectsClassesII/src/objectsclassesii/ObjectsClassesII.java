/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsclassesii;
import java.util.Scanner;
/**
 *
 * @author Thy Tran
 */
class A{
    int i;
    String s;
    double d;
    //alt + insert automatically add a constructor
    
    public A(int i, String s, double d) {
        this.i = i;
        this.s = s;
        this.d = d;
    }
    public A(){
        //a way to make the A with no i, s, or d!
    }
    //as many constructors as you'd like 
    @Override
    public String toString() {
        return "A{" + "i=" + i + ", s=" + s + ", d=" + d + '}';
    } //the purpose of a toString is to display info about the object!
    public A makeA(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number:");
        System.out.println("Enter a word:");
        System.out.println("Enter a fractional number:");
        return new A(scanner.nextInt(), scanner.next(), scanner.nextDouble());
    } //returning an A object from the method
}
public class ObjectsClassesII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        public static void main(String[] args) {
            A a = new A(100, "Testing", 123.5);
            //read in info from user:
            A b = new A().makeA();
            System.out.println(b);
        }
    }
    
}
