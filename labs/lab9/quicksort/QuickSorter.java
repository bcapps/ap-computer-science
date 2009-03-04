import java.util.ArrayList;
import java.util.Collections;

public class QuickSorter
{
   public QuickSorter(ArrayList<Comparable> aList)
   {
      a = aList;
   }   

   /**
      Sorts the array managed by this merge sorter
   */
   public void sortDescending()
   {  
      sort(0, a.size() - 1);
   }

   public void sort(int from, int to)
   {
      if (from >= to) return;
      int p = partition(from, to);
      sort(from, p);
      sort(p + 1, to);
   }
	public void sortAscending()
   {
      sortDescending();
		Collections.reverse(a);
   }

   private int partition(int from, int to)
   {
      Comparable pivot = a.get(from);
      int i = from - 1;
      int j = to + 1;
      while (i < j)
      {
         i++; while (a.get(i).compareTo(pivot)<0) i++;
         j--; while (a.get(j).compareTo(pivot)>0) j--;
         if (i < j) swap(i, j); 
      }
      return j;
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
