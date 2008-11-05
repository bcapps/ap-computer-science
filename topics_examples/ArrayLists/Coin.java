/***************************
 * Brian Capps
 * 11/05/2008
 * Description
 ****************************/

public class Coin
{
	private String name;
	private double value;
	
	public Coin(String n, double v)
	{
		name = n;
		value = v;
	}
	public String getName()
	{
		return name;
	}
	public double getValue()
	{
		return value;
	}
}//end class
