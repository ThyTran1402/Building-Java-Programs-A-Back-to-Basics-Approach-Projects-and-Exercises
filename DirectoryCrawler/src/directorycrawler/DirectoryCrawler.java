/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directorycrawler;
import java.util.*;
import java.io.*;


/**
 *
 * @author Thy Tran
 */
public class DirectoryCrawler {
    public static void main(String[] args) {
        //Create a scanner to read in the data
        Scanner console = new Scanner(System.in);
        System.out.print("directory or file name?");
        //Prompt the user for enter the file's name or directory'name
        String name = console.nextLine();
        //Declare a File object
        File f = new File(name);
        if(!f.exists()) {
            System.out.println("No such file/directory");
        } else {
            print(f, 0);
        }
    }
    //Prints information for the given file/directory using the
    //given level of indentation
    public static void print(File f, int level) {
        for (int i = 0; i < level; ++i) {
            System.out.println("  ");
        }
        System.out.println(f.getName());
        if (f.isDirectory()) {
            //Use for each loop to iterate though all the file and
            //subfile in the listFiles
            if(f.isDirectory()) {
                for (File subF : f.listFiles()) {
                    print(subF, level + 1);
                }
            }
        }
    }
}
