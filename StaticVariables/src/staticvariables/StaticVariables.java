/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticvariables;

/**
 *
 * @author Thy Tran
 */
class Reactangle {
    double len, width;
    public static int statNum = 0;
    //calc area
    public double calcArea() {
        return len * width;
    } //we want to use fields
    public Reactangle(double len, double width) {
        this.len = len;
        this.width = width;
        statNum++;
        System.out.println(statNum + " is the static number.");
    } //a constructor is not mandatory
    //if you leave it out the Java compiler will set you with a default constructor
}
public class StaticVariables {

    public static void main(String[] args) {
            Reactangle r1 = new Reactangle(5, 7);
            Reactangle r2 = new Reactangle(10,11);
            System.out.println(r1.calcArea());
            System.out.println(r2.calcArea());
            System.out.println(Reactangle.statNum);
        }
    }
    

