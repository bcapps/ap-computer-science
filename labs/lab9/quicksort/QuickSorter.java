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
   public void sort()
   {  
      sort(0, a.size() - 1);
   }

   public void sortDescending(int from, int to)
   {
      if (from >= to) return;
      int p = partition(from, to);
      sortDescending(from, p);
      sortDescending(p + 1, to);
   }
	public void sortAscending(int from, int to)
   {
      sortDescending(from, to);
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
