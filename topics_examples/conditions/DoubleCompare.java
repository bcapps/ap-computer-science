/***************************
 * Brian Capps
 * 10/01/2008
 * Description
 ****************************/
public class DoubleCompare
{
	public static void main (String [] args)
	{
		final double EPSILON = 1E-14;//without this, there is some discrepancy
		
		double root = Math.sqrt(2);
		double result = root*root-2;
		if (Math.abs(result - 0)<=EPSILON)
		//if (Math.abs(x-y) <= EPSILON) --> x is approximately equal to y
			System.out.println("=0");
		else
			System.out.println("not 0 but "+result);
		
	}//end main
}//end class
