import java.util.*;

/**
   This program demonstrates the binary search algorithm.
*/
public class BinarySearchDemo
{  
   public static void main(String[] args)
   {  
		ArrayList<Comparable> a = new ArrayList<Comparable>();
			a.add("a");
			a.add("c");
			a.add("b");
			a.add("f");
			a.add("d");

      SelectionSorter s = new SelectionSorter(a);
		s.sortDescending();
      System.out.println(a);
      BinarySearcher searcher = new BinarySearcher(a);
      Scanner in = new Scanner(System.in);

      boolean done = false;
      while (!done)
      {
         System.out.print
               ("Enter number to search for, -1 to quit:");
         Comparable n = in.next();
         try
		{
         	if (Integer.parseInt(n.toString()) == -1) 
            	done = true;
		}
		catch(Exception e)
		{
            int pos = searcher.search(n);
            System.out.println("Found in position " + pos);
         }
      }
   }
}
