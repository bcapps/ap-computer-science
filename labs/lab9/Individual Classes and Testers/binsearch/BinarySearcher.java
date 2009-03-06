/**
   A class for executing binary searches through an array.
*/
import java.util.*;

public class BinarySearcher
{  
   /**
      Constructs a BinarySearcher.
      @param anArray a sorted array of integers
   */
   public BinarySearcher(ArrayList<Comparable> aList)
   {
      a = aList;
   }
   
   /**
      Finds a value in a sorted array, using the binary
      search algorithm.
      @param v the value to search
      @return the index at which the value occurs, or -1
      if it does not occur in the array
   */
   public int search(Comparable c)
   {  
      int low = 0;
      int high = a.size() - 1;
      while (low <= high)
      {
         int mid = (low + high) / 2;
         //int diff = a[mid] - v;
      
         if (a.get(mid).compareTo(c)==0) // a[mid] == v
            return mid;
         else if (a.get(mid).compareTo(c)<0) // a[mid] < v 
            low = mid + 1;
         else
            high = mid - 1;         
      }
      return -1;
   }
   private ArrayList<Comparable> a;
}

