/***************************
 * Brian Capps
 * 10/06/2008
 * Description
 ****************************/
import java.util.Scanner;

public class TrianglePrinter
{
	public static void main(String args[])
	{
		Scanner mattBischoff = new Scanner (System.in);
		int sideLength = 0;
	
		System.out.println("Enter length: ");
		sideLength = mattBischoff.nextInt();
		//for (int k = 1; k<=sideLength; k++)
		//{
			for(int i=0; i<sideLength; i++)
			{
				for (int j=0; j<=i; j++)
					System.out.print("[]");
			
				System.out.println();
			
			}
			for (int i = sideLength; i>=0; i--)
			{
				for (int j=0; j<=i; j++)
					System.out.print("[]");
					
				System.out.println();
			}
		//}//end for
	}//end main method
	
}//end class