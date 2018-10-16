

/**
 * Write a description of interface ListIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ListIterator
{
    /**
     * moves the iterator past the next element
     * @return    the traversed element
     */
    Object next();
    /**
     * tests if there is an element after the interator position
     * @return if there is a element after the iterator psotition
     */
    boolean hasNext();    
    /**
     * Adds an element before the iterator position
     * amd moves the iterator past the inserted element
     * @param element the element to add
     */
    void add(Object element);    
    /**
     * Removes the last traversed element. This method may 
     * only be called after a call to the nect method
     */
    void remove(); 
    boolean alwaysHasNext();
    }
    


