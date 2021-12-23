package pairdemo;

/**
 *
 * @author Thy Tran
 */
public class PairDemo {

    public static void main(String[] args) {
        String[] names = {"Tom", "Diana", "Harry"};
        Pair<String, Integer> result = firstContaining(names, "a");
        System.out.println(result.getFirst());
        System.out.println("Expected: Diana");
        System.out.println(result.getSecond());
        Systsem.out.println("Expected: 1");
    }
    
    /**
     * Gets the first String containing a given string, together
     * with index.
     * @param strings an array of strings
     * @param sub s string
     * @return a pair (string[i], i) where strings[i] containing str, or a pair(null, -1) if there
     * is no match.
     */
    public static Pair<String, Integer> firstContaining(
        String[] strings, String sub)
    {
        for(int i = 0; i < strings.length; i++) {
            if(strings[i].contains(sub)) {
                return new Pair<String, Integer>(string[i], i);
            }
        }
        return new Pair<String, Integer>(null, -1);
    }
}
