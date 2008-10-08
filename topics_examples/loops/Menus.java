/***************************
 * Brian Capps
 * 10/07/2008
 * Description
 ****************************/
import java.util.Scanner;

public class Menus
{
	public static void main (String[] args)
	{
		int choice = 0;
		Scanner in = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter 1 to continue or 2 to quit: ");
			choice = in.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Continuing...");
					break;
				case 2:
					System.out.println("Quitting...");
					break;
				default:
					System.out.println("UM, NO");
					break;
			}//end switch
		}//end do
		while(choice ==1);
		
	}//end main
}//end class
