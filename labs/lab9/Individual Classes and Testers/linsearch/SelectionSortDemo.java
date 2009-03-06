import java.util.*;

/**
   This program demonstrates the selection sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class SelectionSortDemo
{  
   public static void main(String[] args)
   {  
      ArrayList<Comparable> a = new ArrayList<Comparable>();
		a.add("a");
		a.add("c");
		a.add("b");
		a.add("f");
		a.add("d");

      System.out.println(a);
		
      LinearSearcher searcher = new LinearSearcher(a);

		Scanner in = new Scanner(System.in);
		
		boolean done = false;
      while (!done)
      {
         System.out.print("Enter Comparable to search for, -1 to quit: ");
         Comparable n = (Comparable) in.next();
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

   
