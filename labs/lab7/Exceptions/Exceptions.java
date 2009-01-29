/***************************
 * Brian Capps
 * 01/29/2009
 * Exceptions?!?!?
 ****************************/
import java.util.*;

public class Exceptions
{
	public static void main (String [] args)
	{
		boolean keepGoing = true;
		int numTries = 0;
		double sum = 0;
		Scanner in = new Scanner(System.in);
		
		while(keepGoing)
		{
			System.out.print("\nHey yo broski, Enter a number: ");
			try
			{
				sum += Double.parseDouble(in.next());
				System.out.print("Sum: "+sum+"\n");
				numTries = 0;
			}
			catch(Exception e)
			{
				numTries+=1;
				if (numTries==2)
				{
					System.out.println("\nYOU ENTERED 2 INCORRECT VALUES YOU MOTHERFCKVFDING IDIOT.\n"+
										"THE PROGRAM WILL NOW QUIT BECAUSE IT CANT HANDLE THIS MUCH"+
										" STUPIDITY.");
					System.out.println("You are the weakest link, goodbye.");
					keepGoing = false;
				}
				else
					System.out.println("\nIncorrect value, please retry.");
					
			}//end catch
		}//end while
		
		
	}//end main
}//end class
