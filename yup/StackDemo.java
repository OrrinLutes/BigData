

/**
 * Write a description of class StackDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StackDemo
{
   public static void main(String[] args){
       LinkedListStack s = new LinkedListStack();
       s.push("Apple");
       s.push("Banner");
       s.push("Crabby");
       while(!s.isEmpty())
       {
           System.out.println(s.pop());
        }
    }
}

