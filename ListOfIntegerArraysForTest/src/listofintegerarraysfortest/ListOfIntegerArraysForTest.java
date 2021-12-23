/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listofintegerarraysfortest;
import java.util.*;
/**
 *
 * @author Thy Tran
 */
public class ListOfIntegerArraysForTest extends ArrayList<Integer[]> {
    {
        this.add(new Integer[] {1, 2, 3, -1, 2, 0 });
        this.add(new Integer[] {0, 1, 1, -1, 0, 0 });
        this.add(new Integer[] {-11, 2, -9, -13, -22, -5});
    
    }
    public ListOfIntegerArraysForTest() {
        super(3);
    }
    
    @Parameterized.Parameters
    public static List<Integer[]> parameters() {
        return new ListOfIntegerArraysForTest();
    }
    
}
