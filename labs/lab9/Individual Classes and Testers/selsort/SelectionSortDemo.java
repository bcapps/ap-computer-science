import java.util.Arrays;
import java.util.ArrayList;

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
		
      SelectionSorter sorter = new SelectionSorter(a);
      sorter.sortAscending();
      System.out.println(a);
		sorter.sortDescending();
		System.out.println(a);
		
   }
}

   
