/**
   A class for executing linear searches through an array.
*/
import java.util.*;

public class LinearSearcher
{  
   /**
      Constructs the LinearSearcher.
      @param anArray an array of integers
   */
   public LinearSearcher(ArrayList<Comparable> aList)
   {
      a = aList;
   }

   /**
      Finds a value in an array, using the linear search 
      algorithm.
      @param v the value to search
      @return the index at which the value occurs, or -1
      if it does not occur in the array
   */
   public int search(Comparable c)
   {  
      for (int i = 0; i < a.size(); i++)
      {  
         if (a.get(i).equals(c))
            return i;
      }
      return -1;
   }

   private ArrayList<Comparable> a;
}
