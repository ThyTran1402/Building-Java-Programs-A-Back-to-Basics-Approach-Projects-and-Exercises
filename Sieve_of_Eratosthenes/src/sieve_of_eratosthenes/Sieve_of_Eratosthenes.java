/*
 * This is a modification version of the Sieve program to find all the prime numbers
 */
package sieve_of_eratosthenes;
import java.util.Scanner;
import java.util.List;
import java.util.Collection;
import java.lang.Math;
/**
 *
 * @author Thy Tran
 */
public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        System.out.println("This program will tell you all prime.");
        System.out.println("numbers up to a given maximum.");
        System.out.println();
        
        Scanner console = new Scanner(System.in);
        System.out.print("Maximum number? ");
        int max = console.nextInt();
        
        System.out.println("The result is ", sieve(max));
        //Create two linkedlists to store the numbers and primes
        List<Integer> numbers = new LinkedList<Integer>();
        List<Integer> primes = new LinkedList<integer>();
        //add all numbers from 2 to given maximum numbers
        primes.add(2);
        for(int i = 3; i <= max; ++i) {
            if(i % 2 == 1) {
                numbers.add(i);
            }
        }
        
        //use get() method to get the indexes
        int front = numbers.get(0);
        while(!numbers.isEmpty() && front <= Math.sqrt(max)) {
            front = numbers.remove(0);
            primes.add(front);
            Iterator<Integer> itr = numbers.iterator();
            while(itr.hasNext()) {
                int current = itr.next();
                if(current % front == 0) {
                    itr.remove();
                }
            }
        }
        primes.addAll(numbers);
        return primes;
    }
    
}
