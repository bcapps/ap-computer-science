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
	  for(int i =0; i<a.size()/2; i++)
			a.add(a.get(i));
      ArrayList<Comparable> second = new ArrayList<Comparable>();
		for(int i =0; i<a.size()-first.size(); i++)
				a.add(a.get(i));
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

      // Note that only one of the two calls to arraycopy below
      // copies entries

      // Copy any remaining entries of the first array
		for(int i=iFirst; i<=first.size() - iFirst; i++)
			a.set(j, first.get(i));
			
      //System.arraycopy(first, iFirst, a, j, first.length - iFirst);
      
      // Copy any remaining entries of the second half
		for(int i=iSecond; i<=second.size() - iSecond; i++)
			a.set(j, second.get(i));
			
      //ystem.arraycopy(second, iSecond, a, j, second.length - iSecond);
   }

   private ArrayList<Comparable> a;
}
