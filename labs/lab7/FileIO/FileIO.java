/***************************
 * Brian Capps
 * 01/29/2009
 * FileIO
 ****************************/
public class FileIO
{
	private int chars, nums, words=0;
	public static void main(String[] args)
	      throws FileNotFoundException
	{
		boolean keepGoing = true;
	 	Scanner in = new Scanner(System.in);
		while(keepGoing)
		{
	    	System.out.print("Input file: ");
	    	String inputFileName = in.next();

	    	FileReader reader = new FileReader(inputFileName);
			try
			{
				Scanner in = new Scanner(reader);
				readData(in);
			}
	    	finally
			{
	    		int lineNumber = 1;
			}

	    	while (in.hasNextLine())
	    	{
	       		String line = in.nextLine();
	       		out.println("/* " + lineNumber + " */ " + line);
	       		lineNumber++;
	    	}
		}

	    out.close();
	}
	public void readData(Scanner in)
	{
		
	}
}//end class
