/**
   This class sorts an array, using the merge sort algorithm.
*/
import java.util.*;

public class MergeSorter
{
   /**
      Constructs a merge sorter.
      @param anArray the array to sort
   */
   public MergeSorter(ArrayList<Comparable> aList)
   {
      a = aList;
   }
	public void sortAscending()
	{
		sortDescending();
		Collections.reverse(a);
	}
   
   /**
      Sorts the array managed by this merge sorter.
   */
   public void sortDescending()
   {  
      if (a.size() <= 1) return;
      ArrayList<Comparable> first = new ArrayList<Comparable>();
	  for(int i =0; i<(a.size()/2); i++)
			first.add(a.get(i));
      ArrayList<Comparable> second = new ArrayList<Comparable>();
		for(int i =first.size(); i<a.size(); i++)
				second.add(a.get(i));
	
      MergeSorter firstSorter = new MergeSorter(first);
      MergeSorter secondSorter = new MergeSorter(second);
      firstSorter.sortDescending();
      secondSorter.sortDescending();
      merge(first, second);
   }

   /**
      Merges two sorted arrays into the array managed by this
      merge sorter. 
      @param first the first sorted array
      @param second the second sorted array
   */
   private void merge(ArrayList<Comparable> first, ArrayList<Comparable> second)
   {  
      // Merge both halves into the temporary array

      int iFirst = 0;
         // Next element to consider in the first array
      int iSecond = 0;
         // Next element to consider in the second array
      int j = 0; 
         // Next open position in a

      // As long as neither iFirst nor iSecond past the end, move
      // the smaller element into a
      while (iFirst < first.size() && iSecond < second.size())
      {  
         if (first.get(iFirst).compareTo(second.get(iSecond))<0)
         {  
            a.set(j, first.get(iFirst));
            iFirst++;
         }
         else
         {  
            a.set(j, second.get(iSecond));
            iSecond++;
         }
         j++;
      }
   }

   private ArrayList<Comparable> a;
}
