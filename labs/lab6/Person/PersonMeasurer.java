/***************************
 * Brian Capps
 * 11/25/2008
 * Description
 ****************************/
public class PersonMeasurer implements Measurer
{
	public double measure(Object p)
	{
		return ((Person)p).getHeight();
	}
}//end class
