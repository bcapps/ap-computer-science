/***************************
 * Brian Capps
 * 01/29/2009
 * FileIO
 ****************************/
import java.util.*;
import java.io.*;

public class FileIO
{
	private static int chars, words, lines=0;
	
	public static void main(String[] args)
	      throws FileNotFoundException, IOException
	{
		boolean keepGoing = true;
	 	Scanner fileName = new Scanner(System.in);
		while(keepGoing)
		{
	    	System.out.print("Input file: ");
	    	String inputFileName = fileName.next();
			FileReader reader = null;
	
			try
			{
				reader = new FileReader(inputFileName);
				Scanner in = new Scanner(reader);
				readData(in);
				System.out.println("Total chars: "+chars+" words: "+words+" lines: "+lines);
			}
			catch(Exception e)
			{
				System.out.println("ERROR");
				keepGoing= false;
			}
			finally
			{
				if (reader!=null)
					reader.close();
			}
		}//end while
	}
	public static void readData(Scanner in)
	{
		while (in.hasNextLine())
    	{
       		String line = in.nextLine();
			lines++;
       		chars+= line.toCharArray().length;
			String[] wordArray = line.split(" ");//splits by spaces
			
			for(int i = 0; i <wordArray.length;i++)//checks for extra spaces b4 adding words
				if(!wordArray[i].equals(" "))
					words++;
    	}
	}
}//end class
