/**
   This class sorts an array, using the selection sort 
   algorithm
*/
import java.util.ArrayList;

public class SelectionSorter
{
   /**
      Constructs a selection sorter.
      @param anArray the array to sort
   */
   public SelectionSorter(ArrayList<Comparable> aList)
   {
      a = aList;
   }

   /**
      Sorts the array managed by this selection sorter.
   */
   public void sortAscending()
   {  
      for (int i = 0; i < a.size() - 1; i++)
      {  
         int maxPos = maxPosition(i);
         swap(maxPos, i);
      }
   }
	public void sortDescending()
   {  
      for (int i = 0; i < a.size() - 1; i++)
      {  
         int minPos = minimumPosition(i);
         swap(minPos, i);
      }
   }

   /**
      Finds the smallest element in a tail range of the array.
      @param from the first position in a to compare
      @return the position of the smallest element in the
      range a[from] . . . a[a.length - 1]
   */
   private int minimumPosition(int from)
   {  
      int minPos = from;
      for (int i = from + 1; i < a.size(); i++)
         if (a.get(i).compareTo(a.get(minPos))<0) minPos = i;
      return minPos;
   }
	private int maxPosition(int from)
   {  
      int maxPos = from;
      for (int i = from + 1; i < a.size(); i++)
         if (a.get(i).compareTo(a.get(maxPos))>0) maxPos = i;
      return maxPos;
   }

   /**
      Swaps two entries of the array.
      @param i the first position to swap
      @param j the second position to swap
   */
   private void swap(int i, int j)
   {
      Comparable temp = a.get(i);
      a.set(i, a.get(j));
      a.set(j, temp);
   }

   private ArrayList<Comparable> a;
}
