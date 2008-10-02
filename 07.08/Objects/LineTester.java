/***************************
 * Brian Capps 
 * 05/13/2008
 * Description
 ****************************/
import java.util.*;

public class LineTester
{
	public static void main (String [] args)
	{
		Line line = new Line(100, "01010");
		//params: (the time the line appears within the song in milliseconds, and the state of each
		//note in the line ["1" if it should be pressed and "0" if it should not be])
		for (int i =0; i<line.getNotes().size(); i++)
		{
			if(line.getNotes().get(i).getIsValid())
				System.out.println("Note "+(i+1)+" is valid");
			else
				System.out.println("Note "+(i+1)+" is NOT valid");
		}
		System.out.println(line);
		
	}//end main
}//end class
