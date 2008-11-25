/***************************
 * Brian Capps
 * 11/05/2008
 * A coin object with a name and a value
 ****************************/

public class Coin implements Comparable
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
	public int compareTo(Object c)
	{
		if( ((Coin)c).getValue() > getValue() )
			return 1;
		else if ( ((Coin)c).getValue() < getValue() )
			return -1;
		else
			return 0;
	}
}//end class
