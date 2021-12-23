/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbershop;
import java.util.ArrayList;
import java.util.Scanner;
class Customer{
    private String name;
    private String hairTypeNotes;
    private String phoneNumber;
    //alt + insert ... then click on constructor
    public String getName() {
        return name;
    }
    
    public Customer() {
    }
    
    public Customer(String name, String hairTypeNotes, String phoneNumber) {
        this.name = name;
        this.hairTypeNotes = hairTypeNotes;
        this.phoneNumber = phoneNumber;
    }
    
}
public class BarberShop 
{
    public static void main(String[] args) 
    {
        ArrayList<Customer> customers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the customer's name:"); //sout + tab
        String cName = scanner.nextLine();
        System.out.println("Enter the customer's hair notes:");
        String cNotes = scanner.nextLine();
        System.out.println("Enter the customer's phone number:");
        String cPhone = scanner.nextLine();
        customers.add(new Customer(cName, cNotes, cPhone));
        System.out.println(customers.get(0).getName());
    }
    
}
