/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author Thy Tran
 */
public class SavingsAccount extends BankAccount 
{
    //this is the syntax to create a sublass
    //BankAccount is the parent
    //SavingsAccount is the child
    //add a new field for interest rate
    private double interestRate;
    public SavingsAccount(String ach, double b, double ir){
        super(ach, b);
        this.interestRate = ir;
        //when the parameter name is the same as the field name this. must be used
        //otherwise it's optional.
        
    }
    
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("Joh Doe", 2000, 1.5);
        System.out.println(s1.getBalance());
        //getBalance was defined in BankAccount.
    }
    
}
