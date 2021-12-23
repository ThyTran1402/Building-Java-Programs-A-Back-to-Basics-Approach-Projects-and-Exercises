/**
 * This class collects a pair of elements of different types.
 */
package pair;
/**
 *
 * @author Thy Tran
 */
public class Pair<T, S>
{
    private T first;
    private S second;
}

/**
 * Construct a pair containing two given elements.
 * @param firstElement the first element
 * @param secondElement the second element
 */
public Pair(T firstElement, S secondElement)
{
    first = firstElement;
    second = secondElement;
}
/**
 * Gets the first element of the pair.
 * @return the first element
 */
public T getFirst() {reutrn first;}

/**
 * Get the second element of the pair.
 * @return the second element
 */
public S getSecond() {return second;}

public String toString() {return "(" + first + ", " + second + ")";}