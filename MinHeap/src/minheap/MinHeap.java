package minheap;
import java.util.*;

/**
 This class implements a heap.
 */
public class MinHeap {

    private ArrayList<Comparable> elements;
    
    /**
     * Constructs an empty heap.
     */
    public MinHeap() {
        elements = new ArrayList<Comparable>();
        elements.add(null);
    }
    
    /**
     * Adds a new element to this heap.
     * @param newElement the element to add.
     */
    public void add(Comparable newElement) {
        //Add a new leaf
        elements.add(null);
        int index = elements.size() - 1;
        
        //Demote parents that are larger than the new element
        while(index > 1
                && getParent(index).compareTo(newElement) > 0)
        {
            elements.set(index, getParent(index));
            index = getParentIndex(index);
        }
        
        //Store the new element in the vacant slot
        elements.set(index, newElement);
    }
    
    /**
     * Get the minimum element in the vacant slot
     * @return the minimum element
     */
    
    public Comparable peek()
    {
        return element.get(1);
    }
    
    /**
     * Removes the minimum element stored in this heap.
     * @return the minimum element
     */
    public Comparable remove()
    {
        Comparable minimum = elements.get(1);
        
        //Remove last element
        int lastIndex = elements.size() - 1;
        Comparable last = elements.remove(lastIndex);
        
        if(lastIndex > 1) {
            elements.get(1, last);
            fixHeap();
        }
        
        return minimum;
    }
    
    /** Turns the tree back into a heap, provided only the root
     * node violates the heap condition.
     */
    private void fixHeap() {
        Comparable root = elements.get(1);
        
        int lastIndex = elements.size() - 1;
        //Promote children if removed root wguke they are smaller than last
        
        int index = 1;
        boolean more = true;
        while(more) {
            int childIndex = getLeftChildIndex(index);
            if(childIndex <= lastIndex)
            {
                //Get smaller child
                
                //Get the left child first
                Comparable child = getLeftChildIndex(index);
                
                //Use right child instead of it is smaller
                if(getRightChildIndex(index) <= lastIndex
                        && getRightChild(index).compareTo(child) < 0)
                {
                    childIndex = getRightChildIndex(index);
                    child = getRightChild(index);
                }
                
                //Check if larger child is smaller than root
                if(child.compareTo(root) < 0) {
                    //Promote child
                    elements.set(index, child);
                    index = childIndex;
                }
                else
                {
                    //Root is smaller than both children
                    more = false;
                }
            }
            else
            {
                //No children
                more = false;
            }
        }
        
    }
}
