import java.util.NoSuchElementException;
import java.util.*;
public class Linked_List
{
    /** description of instance variable x (add comment for each instance variable) */
    private Node first;
    private Node last;

    class Node
    {
        // old school
        //Any object into and out of our linked list
        //cast to type the object as we remove it
        public Object data;
        public Node next;
    }

    /**
     * Default constructor for objects of class Linked_List
     */
    public Linked_List()
    {
        // initialise instance variables
        first = null;
    }

    /**
     * adds an element to the front of the LL
     * @param element the element to add
     */
    public void addFirst(Object element){
        Node newNode = new Node();
        newNode.data = element;// points to object
        newNode.next = first;
        first = newNode;
    }

    public void addFirstWrong(Object element){
        Node newNode = new Node();
        first = newNode;
        newNode.data = element;// points to object
        newNode.next = first;
    }

    /**
     * Returns the first element in the LL
     * @return the first element in the LL
     */
    public Object getFirst(){
        if (first == null){throw new NoSuchElementException();}
        return first.data;
    }

    /**
     * removes the first element in the LL
     * @return the removed element
     */
    public Object removeFirst()
    {
        if (first == null){throw new NoSuchElementException();}
        Node temp = first;
        first = first.next;
        return temp;
    }

    public ListIterator listIterator(){
        return new LinkedListIterator();
    }

    public void reverse (){
        Stack<Node> backywacky = new Stack<>();
        Node temp = first;
        while(temp != null)
        {
            backywacky.push(temp);
            temp=temp.next;
        }
        Node noodle = backywacky.pop();
        first = noodle;
        while(backywacky.size() > 0)
        {
            noodle.next=backywacky.pop();
            noodle = noodle.next;
        }
        noodle.next = temp;

    }
    
    public void realReverse(){
        if (first == null){return;}
        Node prev = first;
        Node curr = first.next;
        first.next = null;
        while (curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        first = prev;
    }

    public String toString(){
        Node temp = first;
        String ping = "{";
        while (temp != null)
        {
            ping = ping + temp.data + ", ";
            temp = temp.next;

        }
        return ping.substring( 0 ,ping.length()-2) + "}";
    }

    public int size (){
        Node temp = first;
        int count =1 ;
        if(first == null){
            return 0;    
        }
        while(temp.next != null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    public Object get(int n){
        Node temp = getNode(n);
        return temp;
    }  
    public void set(int n, Object newElement){
        Node temp = getNode(n);
        temp.data = newElement;
    }
    private Node getNode(int n){
        Node temp;
        temp = first;
        for (int i = 1; n == i; i++){
            temp = temp.next;
        }
        return temp;
    }
        class LinkedListIterator implements ListIterator
        {
            private Node position;
            private Node previous; //remove
            private boolean isAfterNext;
            public LinkedListIterator(){
                position = null;
                previous = null;
                isAfterNext = false;

            }

            public Object next()
            {
                if(!hasNext()) {throw new NoSuchElementException();}
                previous = position; //can remove item
                isAfterNext = true;

                if(position == null){
                    position = first; // dddress/ref to Objercts
                }
                else{
                    position = position.next;
                }
                return position.data;
            }

            /**
             * tests if there is an element after the interator position
             * @return if there is a element after the iterator psotition
             */
            public boolean hasNext(){
                if(position == null){
                    return first != null;
                }
                else{
                    return position.next != null;
                }
            }
            
            public boolean alwaysHasNext(){
             return position != null;}

            /**
             * Adds an element before the iterator position
             * amd moves the iterator past the inserted element
             * @param element the element to add
             */
            public void add(Object element){
                if (position == null){
                    addFirst(element);
                    position = first;
                }
                else{
                    Node newNode = new Node();
                    newNode.data = element;
                    newNode.next = position.next;
                    position.next = newNode;
                    position = newNode;
                }

            }   

            /**
             * Removes the last traversed element. This method may 
             * only be called after a call to the nect method
             */
            public void remove(){
                if(!isAfterNext) {throw new IllegalStateException();}
                if (position == first){
                    removeFirst();
                }
                else{
                    previous.next = position.next;
                }
                position = previous;
                isAfterNext = false;

            }
        }
    }