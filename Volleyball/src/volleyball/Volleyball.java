/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volleyball;
import java.util.Scanner;
/**
 *
 * @author Thy Tran
 */
public class Volleyball {
    public static void main(String[] args) {
     //Initialze the score of team A
     int scoreA = 0;
     //Initialize the score of team B
     int scoreB = 0;
     String teamName = " ";
     Scanner scan = new Scanner(System.in);
     while(true) {
       teamName = scan.next();
       if(teamName.equals("A")) {
         scoreA += 1;
       } else if(teamName.equals("B")) {
         scoreB += 1;
       } else if(teamName.equals("end")) {
         //System.out.println("End game");
         break;
       }
     }
     
     if(scoreA >= 21 && (scoreA-scoreB) >= 2) {
       System.out.println("Team A won! ("+scoreA+"-"+scoreB+")");
     } else if(scoreB >= 21 && (scoreB-scoreA) >= 2) {
       System.out.println("Team B won! ("+scoreB+"-"+scoreA+")");
     } else {
       System.out.println("The game was a draw.");
     }
     
     //System.exit(0);
    }
    
}
