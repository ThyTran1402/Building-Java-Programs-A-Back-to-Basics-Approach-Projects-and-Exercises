/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Thy Tran
 */
public class Corvette extends Car
{
    public static void main(String[] args) {
        Corvette c = new Corvette(true, true, "Corvette", 210, 400);
        c.carGo();
        System.out.println(c.toString());
        //ask the user for the informatio about a corvette...
        //add the corvette object to an arraylist!
    }
    @Override
    public void carGo(){
        System.out.println("VRRRRRRRRRRRRRRRRRRRRROOM!!!! VRRRROM!!!");
    }
    private boolean isConvertible;
    private boolean isManual;
    public Corvette(boolean isConvertible, boolean isManual, string brand, double MPH, int hp)
    {
        super(brand, MPH, hp); //sending this info fixes the class!
        this.isConvertible = isConvertible;
        this.isManual = isManual;
    }
    @Override
    public String toString() {
        return "Corvette{" + "isConvertible=" + isConvertible + ", isManual=" + isManual + '}'
                + super.toString();
    }
    
}
