/***************************
 * Brian Capps
 * 11/19/2008
 * Description
 ****************************/
import java.util.Scanner;

public class Input
{
	public static int readInt(Scanner in, String prompt, String error, int min, int max)
	{
		boolean isValid = false;
		int num;
		do
		{
			System.out.println(prompt);
			num = in.nextInt();
			if(num > min && num < max)
				System.out.println("Not in valid range");
			else
				{
					System.out.println("Number is within range");
					isValid = true;
				}
		}
		while(!isValid);
		
		return num;
	}//end method
}//end class
