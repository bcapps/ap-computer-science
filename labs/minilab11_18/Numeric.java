/***************************
 * Brian Capps
 * 11/19/2008
 * Description
 ****************************/
public class Numeric
{
	public static double intPower(double x, int n)
	{
		if(n==0)
			return 1.0;
		else if(n<0)
			return 1.0/(Math.pow(x, -1.0*n));
		else
			if(n%2 == 0)
				return Math.pow((Math.pow(x, n/2.0)), 2);
			else
				return Math.pow(x, n-1.0);
	}//end main
}//end class
