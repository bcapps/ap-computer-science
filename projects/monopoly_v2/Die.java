/***************************
 * Brian Capps
 * 10/29/2008
 * Description
 ****************************/

import java.util.Random;

public class Die
{
	private int numSides;
	private Random generator;
	
	public Die(int s)
	{
		numSides = s;
		generator = new Random();
	}
	public int nextRoll()
	{
		return generator.nextInt(numSides)+1;
	}
	public void setNumSides(int s)
	{
		numSides = s;
	}
	public int getNumSides()
	{
		return numSides;
	}
	
}//end class
