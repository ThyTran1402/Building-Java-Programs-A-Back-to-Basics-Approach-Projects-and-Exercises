/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysandarraylists;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thy Tran
 */
public class Students 
{
    String id;
    String name;
    double moneyOwed;
    public Students(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Students(){
        name = "John Doe";
        id = "FAKEID";
    } //overload method...a constructor is just a method.
    
    public static void main(String[] args)
    {
        Students s = new Students("123f", "Oscar Grouch");
        ArrayList<Students> al = new ArrayList<Students>();
        al.add(s);
        //Ask the user to create students...keep adding
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the name of a student, enter -1 to quit.");
            String name = scanner.nextLine();
            if(name.equals("-1")){
                break;
            }
            System.out.println("Enter the id of the student.");
            String id = scanner.nextLine();
            al.add(new Students(id, name));
        }
        for(Students currentStudent : al){
            System.out.println(currentStudent.name + " " + currentStudent.id);
        }
        //them until the user to quit!
        //Add the student objects to the ArrayList
    }
    public String warnStudent(double moneyOwed)
    {
        this.moneyOwed = moneyOwed;
        if(moneyOwed > 0)
            return "Pay up, deadbeat!";
        else
            return "Thank you student.";
    }
    
}
