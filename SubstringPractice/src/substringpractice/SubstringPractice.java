package substringpractice;

/**
 *
 * @author Thy Tran
 */
public class SubstringPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userAddress = "123 Fake Street";
        for(int i = 0; i < userAddress.length()-1; ++i){
            System.out.println(userAddress.substring(i, i+2));
        }
        System.out.println(userAddress.substring(3)); //one parameter
        if(userAddress.contains("Street"))
            System.out.println("Address has a street.");
        else
            System.out.println("Address does not have a street.");
        String data = "Jorge, Bill, Mary, Todd";
        data = data.replaceAll(",", "");
        //split based off, and space
        //replaceAll and set the new string to data
        //replaceAll cannot run on a string and change it without a new assignment
        //because strings are immutable (can't change them!)
        String [] names = data.split(" ");
        String s = "12345";
        char a = s.charAt(0);
        System.out.println(a + " is the first character.");
        System.out.println(names.length + " names in the list.");
        for(String name : names) {
            if(name.trim().equalsIgnoreCase("Bill"))
                System.out.println("Welcome Bill, it's important that you're here.");
            //trime() eliminates whitespace (leading and trailing)
            //equalsIgnoreCase() does not consider capitalization in comparing strings
            //you do not use == to compare strings
            //split will divide up a string according to a regular expression(,)
        }
    }
    
}
