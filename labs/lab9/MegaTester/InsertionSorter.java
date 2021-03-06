/**
   This class sorts an array, using the insertion sort 
   algorithm
*/
import java.util.ArrayList;
import java.util.Collections;

public class InsertionSorter
{
   /**
      Constructs an insertion sorter.
      @param anArray the array to sort
   */   
   public InsertionSorter(ArrayList<Comparable> aList)
   {
      a = aList;
   }

   /**
      Sorts the array managed by this insertion sorter
   */      
   public void sortAscending()
   {
		sortDescending();
		Collections.reverse(a);
	}
   public void sortDescending()
   {
      for (int i = 1; i < a.size(); i++)
      {
         Comparable next = a.get(i);
         // Move all larger elements up
         int j = i;
         while (j > 0 && a.get(j-1).compareTo(next)>0)
         {
            a.set(j, a.get(j-1));
            j--;
         }
         // Insert the element
         a.set(j, next);
      }
   }
   
   private ArrayList<Comparable> a;
}
