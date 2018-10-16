/**
   Add a method firstToLast to this implementation of a queue.
   The method moves the element at the head of the queue to
   the tail of the queue. The element that was second in line
   will now be at the head.
*/
public class LinkedListQueue
{
   private Node head;
   private Node tail;

   /**
      Constructs an empty queue.
   */
   public LinkedListQueue()
   {
      head = null;
      tail = null;
   }

   /**
      Moves the head of the queue to the tail.
   */
   public void firstToLast()
   {
      . . .



   }

   /**
      Checks whether this queue is empty.
      @return true if this queue is empty
   */
   public boolean empty()
   {
      return head == null;
   }

   /**
      Adds an element to the tail of this queue.
      @param newElement the element to add
   */
   public void add(Object newElement)
   {

   }

   /**
      Removes an element from the head of this queue.
      @return the removed element
   */
   public Object remove()
   {

   class Node
   {
      public Object data;
      public Node next;
   }
}
