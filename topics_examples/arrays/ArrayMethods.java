/***************************
 * Brian Capps
 * 11/03/2008
 * Description
 ****************************/
public class ArrayMethods
{
	public static void main (String [] args)
	{
		int a = 5;
		int evens = new int[10];
		for (int i = 1; i<=10; i++)
			int evens[i-1] = i*2;
		
		System.out.print("BEFORE:\na = "+a+"\n{"+evens[0]);
		for(int i=1; i<evens.length; i++)
			System.out.println(", "+evens[i]);
			
		
	}//end main
	public static void doubleNums(int b, int[] values)
	{
		b*=2;
		for(int i=0; i<values.length; i++)//loops thru and doubles all values
			values[i] *= 2;
	}//end doubleNum method
	
}//end class
