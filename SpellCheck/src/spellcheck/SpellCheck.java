package spellcheck;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author Thy Tran
 */
public class SpellCheck {
    /**
     * This program checks which words in a file are not present in a dictionary 
     */

    public static void main(String[] args) throws FileNotFoundException 
    {
        //Read the dictionary and the document
        Set<String> dictionaryWords = readWords("words");
        Set<String> documentWords = readWords("alice30.txt");
        
        
        //Print all words that are in the document but not in dictionary
        for(String word : documentWords) {
            if(!dictionaryWords.contains(word)) {
                System.out.println(word);
            }
        }
    }
    
    /**
     * Read all words from a file
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a words is 
     * sequence of upper- and lowercase letter.
     */
    public static Set<String> readWords(String filename) throws FileNotFoundException 
    {
        //Construct the HashSet to store the words
        Set<String> words = new HashSet<String>();
        //Read in the filename
        Scanner in = new Scanner(new File(filename));
        //Use any characters other than a-z and A-Z as delmeter
        in.useDelimiter("[^a-zA-Z]");
        while(in.hasNext())
        {
            words.add(in.next().toLowerCase());
        }
        return words;
    }
}
