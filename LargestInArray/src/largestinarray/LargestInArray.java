package largestinarray;
import java.util.Scanner;
/**
 *
 * @author Thy Tran
 */
public class LargestInArray {

    public static void main(String[] args) {
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSize = 0;
        
        //Read inputs
        
        System.out.println("Please enter values, Q to quit:");
        Scanner in = new Scanner(System.in);
        while(in.hasNextDouble() && currentSize < values.length);
        {
            values[currentSize] = in.nextDouble();
            currentSize++;
        }
        
        //Find the largest
        
        double largest = values[0];
        for(int i = 1; i < currentSize; ++i)
        {
            if(values[i] > largest) {
                largest = values[i];
            }
        }
        //Print all values, marking the largest
        
        for(int i = 0; i < currentSize; ++i) {
            System.out.println(values[i]);
            if(values[i] == largest) {
                System.out.println("<==");
            }
            System.out.println();
        }
    }
}
