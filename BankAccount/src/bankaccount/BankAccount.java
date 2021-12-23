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
public class BankAccount extends Object
{
    //every Object in Java is a subclass of class Object
    //toString is defined in Object equals is defined in Object.
    public static void main(String[] args) {
        protected String accountHolder;
        private String accountNumber;
        private double balance;
        
        public double getBalance(){
            return balance;
        }
        
        public BankAccount(String acctHolder, double balance){
            this.accountHolder = acctHolder;
            this.balance = balance;
        }
        
        public static void main(String[] args) 
        {
            BankAccount b1 = new BankAccount("Jon Smith", 3000);
            System.out.println(b1.getBalance());
        }
    }
    
}
