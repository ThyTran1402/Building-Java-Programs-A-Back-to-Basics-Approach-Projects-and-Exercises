/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publixapp;
import java.util.Scanner;
/**
 *
 * @author Thy Tran
 */
class Food implements QualityChecker{
    //four attributes to keep track of with food;
    String name;
    boolean isPerishable, isEdible;
    double price, weight;
    //parent class
    Food(String name, boolean isPerishable, boolean isEdible, double price, double weight){
        this.name = name;
        this.isPerishable = isPerishable;
        this.isEdible = isEdible;
        this.price = price;
        this.weight = weight;
    }
    public boolean isPerishable(){
        return isPerishable;
    }
    public boolean isStillEdible(){
        return isEdible;
    }
    public String toString(){
        return name + " " + price + '\n';
    }
}


class Cereal extends Food{
    //add two more attributes
    String UPC;
    double gramsOfSugar;
    public Cereal(String UPC, double gramsOfSugar, String name, boolean isPerishable, boolean isEdible,
                double price, double weight){
        super(name, isPerishable, isEdible, price, weight);
        this.UPC = UPC;
        this.gramsOfSugar = gramsOfSugar;
    }
    public String toString(){
        return UPC + " " + super.toString();
    }
}


interface QualityChecker{
    public boolean isPerishable();
    public boolean isStillEdible();
}


public class PublixApp 
{
    public static void main(String[] args) 
    {
            //ask the user to add info about Cereal
            Scanner s = new Scanner(System.in);
            System.out.println("Enter UPC");
            String upc = s.next();
            System.out.println("Enter grams of sugar:");
            double gramsSugar = s.nextDouble();
            System.out.println("Enter name:");
            String name = s.next();
            System.out.println("Enter if the product perishable (true or false)");
            boolean edible = s.nextBoolean();
            System.out.println("Enter the product price:");
            double price = s.nextDouble();
            System.out.println("Enter the product weight:");
            double weight = s.nextDouble();
            Cereal c = new Cereal(upc, gramsSugar, name, perishable, edible, price, weight);
            System.out.println(c);
            //show the user the Cereal still edible
        }
    }
    

