/***************************
 * Brian Capps
 * 11/19/2008
 * Alternating adding and  subtracting
 ****************************/
import java.util.Scanner;

public class AlternatingSum
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("\nNumber of values to enter: ");
		int numLoops = in.nextInt();
		
		int total = 0;
		for (int i =0; i< numLoops; i++)
		{
			System.out.print("\nPlease Enter a Number: ");
			int num = in.nextInt();
			if (i % 2 == 0)
			   	total += num;
			else
			    total -= num;
		}//end for
		
		System.out.println("\nThe final total is: "+total);
		
	}//end main
}//end class
