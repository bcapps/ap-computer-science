/***************************
 * Brian Capps
 * 10/08/2008
 * TESTING 4 TEH FIB NUMS
 ****************************/

import java.util.Scanner;

public class FibonacciTester
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number to get Fib Nums!: ");
		int num = in.nextInt();
		FibonacciGenerator mattBischoff = new FibonacciGenerator(num);
		while (mattBischoff.getCurrent() > 0)
		{
			System.out.println(mattBischoff.nextNumber());
		}	
		
	}//end main
}//end class
