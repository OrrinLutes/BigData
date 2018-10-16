public class QueueTester
{
   public static void main(String[] args)
   {
      CircularArrayQueue q = new CircularArrayQueue();
      q.add("Tom");
      q.add("Diana");
      q.add("Harry");
      //q.firstToLast();
      q.lastToFirst();
      while (!q.empty())
      {
         System.out.print(q.remove() + " ");
      }
      System.out.println();
      System.out.println("Expected: Diana Harry Tom");
   }
}
