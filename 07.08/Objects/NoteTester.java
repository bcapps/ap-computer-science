/***************************
 * Brian Capps 
 * 05/13/2008
 * Description
 ****************************/
public class NoteTester
{
	public static void main (String [] args)
	{
		Note note = new Note();
		System.out.println(note);
		note.setMissed(true);
		note.setScored(true);
		note.setIsValid(true);
		System.out.println("\nNew Note has these properties:");
		System.out.println(note);
		
	}//end main
}//end class
