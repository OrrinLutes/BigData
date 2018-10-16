
/**
 * Write a description of class TestDataList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestDataList
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * 
     */
    public static void main(String args[]){
        Linked_List s = new Linked_List ();
        String word = "New";
        String word2;
        s.addFirst(word);
        s.addFirst(new String("Two"));
        s.addFirst("yup");

        //old school - must cast the object when it comes out

        word2 = (String) s.getFirst();//this returns an Object
        
        System.out.println(s);
        s.set(3, "One");
        System.out.println(s);
        //System.out.println(s.size());
        //System.out.println(word2);
    }
    
    public static void yourFault(){
     Linked_List s = new Linked_List ();
        String word = "New";
        String word2;
        s.addFirstWrong(word);
        s.addFirstWrong(new String("Two"));
        s.addFirstWrong("yup");
       
        ListIterator lit = s.listIterator();
        if(lit.next() == lit.next())
        {
            System.out.println("your a dog");
        }
    }
    
    public static void ListTest()
    {
        Linked_List s = new Linked_List ();
        String word = "New";
        String word2;
        s.addFirst(word);
        s.addFirst(new String("Two"));
        s.addFirst("yup");
        
        ListIterator lit = s.listIterator();
        lit.next();
        lit.next();
        if(lit.alwaysHasNext() != false)
        {
            System.out.println("your broke your list iterator too?");
        }
        //if(it.alwayshasNext()
    }
}
