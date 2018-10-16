


public class QueueDemo
{
    public static void main(String[] args)
    {
        LinkedListQueue q = new LinkedListQueue();
        q.add("Tom");
        q.add("Diana");
        q.add("harry");
        q.firstToLast();
        while (!q.empty()){
            System.out.println(q.remove() + " ");
        }
        System.out.println();
        //System.out.println("Expected: Tom Harry Diana");
    }
}
