/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;
import java.util.ArrayList;
/**
 *
 * @author Thy Tran
 */
public class Pizza 
{
    ArrayList<String> toppings;
    int diameterInInches;
    double costOfPizza;
    
    public Pizza(ArrayList<String> toppings, int diameterInInches)
    {
        this.toppings = toppings;
        this.diameterInInches = diameterInInches;
    }
    public Pizza(int diameterInInches)
    {
        this.diameterInInches = diameterInInches;
    }
    @Override
    public String toString() {
        return "Pizza{" + "toppings=" + toppings + ", diameterInInches=" + 
                diameterInInches + ", costOfPizza=" + costOfPizza + '}';
    }
    
    public double calcCost(){
        this.costOfPizza = diameterInInches * 1.5;
        if(toppings != null)
        this.costOfPizza += toppings.size() * 2;
        return costOfPizza;
    }
    public static void main(String[] args) 
    {
        Pizza p;
        //reference
        p = new Pizza(10);
        System.out.println(p.calcCost());
    }
    
}
