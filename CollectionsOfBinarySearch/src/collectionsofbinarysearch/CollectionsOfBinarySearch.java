package collectionsofbinarysearch;

import java.util.Arrays;

/**
 *
 * @author Thy Tran
 */
public class CollectionsOfBinarySearch {

    public static void main(String[] args) {
        //binary search on an array
        int[] numbers = {-3, 2, 8, 12, 17, 29, 44, 58, 79};
        int index = Arrays.binarySearch(numbers, 29);
        System.out.print("29 is found at index " + index);
        
        //demonstrate the Arrays.sort method
        String[] strings = {"c", "b", "g", "h", "d", "f", "e", "a"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        
        //demonstrate the Collections.sort method
        List<String> list = new ArrayList<String>();
        list.add("c");
        list.add("b");
        list.add("g");
        list.add("h");
        list.add("d");
        list.add("f");
        list.add("e");
        list.add("a");
        Collections.sort(list);
        System.out.println(list);
        
        //Shuffle
        String[] ranks = {"2", "3", "4", "5", "6". "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        List<String> deck = new ArrayList<String>();
        for(String rank : ranks) {      //build sorted deck
            for(String suit : suits) {
                deck.add(rank + " of " + suit);
            }
        }
        Collections.shuffle(deck);
        System.out.println("Top card = " + deck.get(0));
        
        //Sort Strinfs using case-insesitive Comparator
        String[] strings = {"Foxtrot", "alpha", "echo", "golf", "bravo", "hotel", "Charlie", "DELTA"};
        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(strings));
    }
    
}
