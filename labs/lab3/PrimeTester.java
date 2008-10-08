/***************************
 * Brian Capps
 * 10/08/2008
 * Description
 ****************************/
import java.util.Scanner;

public class PrimeTester
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		PrimeGenerator mattBischoff = new PrimeGenerator(num);
		while(!mattBischoff.isDone())
		{
			System.out.println(mattBischoff.nextPrime());
		}
	}//end main
}//end class
