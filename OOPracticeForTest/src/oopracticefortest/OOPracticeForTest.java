package oopracticefortest;

/**
 *
 * @author Thy Tran

*/
 class XYZ
 {
      private String s;
    private int i;
    public double d; //d has package level access!
    //getter for s
    public String getS()
    {
        return s;
    }
    //setter for s:
    public String setS(String s)
    {
        this.s = s;
    }
    public int getI()
    {
        return i;
    }
    public void setI(int i)
    {
        this.i = i;
    }
 }
public class OOPracticeForTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        XYZ xyz = new XYZ();
        xyz.setI(101);
        xyz.setS("testing");
        xyz.setI(xyz.getI() * 2);
        System.out.println(xyz.getI());
    }
    
}
