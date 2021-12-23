/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;
import java.util.Scanner;

/**
 *
 * @author Thy Tran
 */


//Part II
class Car{
    int horsepower;
    boolean operable;
    double cost;

    //Construtor
    public Car(int horsepower, boolean operable, double cost) {
       this.horsepower = horsepower;
       this.operable = operable;
       this.cost = cost;
    }
    
    public int getHorsepower(){
      return horsepower;
    }
    
}
    

public class Test3 {
    
        //Part I
    public int countOh(String word){
        //Declare the length of the string 
        //int len = word.length();
        //Declare the count variable to count the number of "Oh" appears
        int count = 0;
        int countWord = word.indexOf("Oh");
        while(countWord != -1) {
            count++;
            countWord = word.indexOf("Oh", countWord + 1);
        }
        
        return count;
        
    }
    
    //Part III
    public int testNums(int a, int b, int c){
       if(a == 7) {
           return 0;
       } else if(b == 7) {
           return a;
       } else if(c == 7) {
           return a + b;
       } else {
           return a + b + c;
       }
    }
    
    //Part IV
    public int[] pre7(int[] nums) {
        //Length of the original array
        int len = nums.length;
        // Create the new array that contains all the elements without 7
        int[] result;
        //Length of the new array
        //int newLen = result.length;
        for(int i = 0; i < len; i++) {
            if(nums[i] == 7) {
                result = new int[i];
                for(int j = 0; j < result.length; j++) {
                    result[j] = nums[j];
                }
                if(nums[0] != 7) {
                    return result;
                }
            }
        }

        int[] array = new int[0];
        return array;

}


    public static void main(String[] args) {
        
        //Testing
        Scanner scanner = new Scanner(System.in);
        int toTest = scanner.nextInt();
        Test3 test3 = new Test3();
        //Part I
        if(toTest == 1){
        
            scanner.nextLine();
            System.out.println(test3.countOh(scanner.nextLine()));
            //see how many Oh's
        }
        else if(toTest == 2){
        //Part II
        Car c = new Car(scanner.nextInt(), scanner.nextBoolean(), scanner.nextDouble());
        System.out.println(c.getHorsepower());
        }
        else if(toTest == 3){
        //Part III
            System.out.println(test3.testNums(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }
        else if(toTest == 4)
        {
        //Part IV
           int arrToTest[] = new int[5];
           for(int i = 0; i < 5; i++){
               arrToTest[i] = scanner.nextInt();
           }
            int [] result = test3.pre7(arrToTest);
            int sum = 0;
            for(int i : result){
                sum += i;
            }
            System.out.println(sum);
        }

    }
 
    
}
