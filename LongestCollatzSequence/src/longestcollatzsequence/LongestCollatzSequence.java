/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestcollatzsequence;
import java.util.Arrays;
/**
 *
 * @author Thy Tran
 */
public class LongestCollatzSequence {

    /**
     * @param args the command line arguments
     */
    static int upperLimit = 120000;
  
  static int advance(int n)
  {
    if (n % 2 == 0) return n/2;
    else return 3*n + 1;
  }
  
  static int determineLength(int n)
  {
    int length = 1;
    while (n!=1){
      n = advance(n);
      length++;
    }
    return length;
  }
  
  public static void main(String[] args)
  {
    int[] chain = new int[upperLimit + 1];
    for (int i=0; i<chain.length; i++)
      chain[i] = 1;
    
    int maxLength = 0;
    int maxN = 0;
    for (int i=2; i < upperLimit; i++){
      if (chain[i] == 1){
        ArrayList<Integer> step = new ArrayList<Integer>();
        int n = i;
        while (n!=1){
          n = advance(n);
          if (n < upperLimit){
            if (chain[n] > 1){
              chain[i] += chain[n];
              break;
            } else {
              chain[i]++;
              step.add(n);
            }
          } else {
            chain[i]++;
            step.add(n);
          }
        }
        if (maxLength < chain[i]){
          maxLength = chain[i];
          maxN = i;
          System.out.println(maxN + " " + maxLength + " " + determineLength(maxN));
        }
        
        for (int j=0; j<step.size(); j++){
          if (step.get(j)<upperLimit){
            chain[step.get(j)] = chain[i] - j - 1;
          }
        }
      }
//      System.out.println(i + " " + chain[i] + " " + determineLength(i));
    }
    
    System.out.println(maxN + " " + maxLength + " " + determineLength(maxN));
  }
    
}
