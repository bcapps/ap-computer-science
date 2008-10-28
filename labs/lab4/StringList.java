/***************************
 * Brian Capps
 * 10/24/2008
 * Description
 ****************************/

import java.util.Scanner;
import java.util.ArrayList;

public class StringList
{
	public static void main (String [] args)
	{
		ArrayList<String> words = new ArrayList<String> ();
		Scanner in = new Scanner(System.in);
		for(int i=0; i<10; i++)
		{
			System.out.print("Please Enter Value #"+(i+1)+": ");
			words.add(in.next());
		}
		for(int i = words.size()-1; i>=0; i--)
			System.out.println(words.get(i));
			
	}//end main
}//end class
