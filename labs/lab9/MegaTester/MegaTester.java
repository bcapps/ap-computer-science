/***************************
 * Brian Capps 
 * 03/05/2009
 * Tests all the algorithms
 ****************************/
import java.util.*;

public class MegaTester
{
	public static void main (String [] args)
	{
		StopWatch timer = new StopWatch();
		
		ArrayList<Comparable> a = new ArrayList<Comparable>();
		a.add("a");
		a.add("c");
		a.add("b");
		a.add("f");
		a.add("d");
		a.add("h");
		a.add("z");
		a.add("w");
		a.add("t");
		a.add("r");
		a.add("p");
		a.add("g");
		a.add("i");
		a.add("o");
		a.add("j");
		a.add("k");
		a.add("q");
		a.add("l");
		a.add("e");
		a.add("v");
		
		ArrayList<Comparable> b = (ArrayList<Comparable>) a.clone();
		ArrayList<Comparable> c = (ArrayList<Comparable>) a.clone();
		ArrayList<Comparable> d = (ArrayList<Comparable>) a.clone();
		ArrayList<Comparable> e = (ArrayList<Comparable>) a.clone();
		
		System.out.println("The original array:\n"+a);
		
		SelectionSorter selSorter = new SelectionSorter(a);
		InsertionSorter insSorter = new InsertionSorter(b);
		QuickSorter quickSorter = new QuickSorter(c);
		MergeSorter mergeSorter = new MergeSorter(d);
		
		timer.start();
		selSorter.sortDescending();
		timer.stop();
		System.out.println("\nSelection-Sorted Array: "+a+"\nSorted in: "+timer.getElapsedTime()+"ns");
		timer.reset();
		
		timer.start();
		insSorter.sortDescending();
		timer.stop();
		System.out.println("\nInsertion-Sorted Array: "+a+"\nSorted in: "+timer.getElapsedTime()+"ns");
		timer.reset();
		
		timer.start();
		quickSorter.sortDescending();
		timer.stop();
		System.out.println("\nQuick-Sorted Array: "+a+"\nSorted in: "+timer.getElapsedTime()+"ns");
		timer.reset();
		
		timer.start();
		mergeSorter.sortDescending();
		timer.stop();
		System.out.println("\nMerge-Sorted Array: "+a+"\nSorted in: "+timer.getElapsedTime()+"ns");
		timer.reset();
		
		System.out.println("----------------------");
		
		BinarySearcher bSearcher = new BinarySearcher(a);
		LinearSearcher lSearcher = new LinearSearcher(a);
		
		Scanner in = new Scanner(System.in);

	  	boolean done = false;
	  	while (!done)
	 	{
	   		System.out.print("\nEnter Comparable to search for, -1 to quit:");
	      	Comparable n = (Comparable) in.next();
	       	try
			{
	      		if (Integer.parseInt(n.toString()) == -1) 
	          		done = true;
			}
			catch(Exception exception)
			{
				timer.start();
	           	int posL = lSearcher.search(n);
				timer.stop();
	            System.out.println("\nLinear Search found it in position " + posL+
									"\nElapsed time: "+timer.getElapsedTime()+"ns");
				timer.reset();
				
				timer.start();
	           	int posB = bSearcher.search(n);
				timer.stop();
	            System.out.println("Binary Search found it in position " + posB+
									"\nElapsed time: "+timer.getElapsedTime()+"ns");
				timer.reset();
	         }
	      }
	}//end main
}//end class
