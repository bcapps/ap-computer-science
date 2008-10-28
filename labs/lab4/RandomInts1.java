/***************************
 * Brian Capps
 * 10/25/2008
 * Description
 ****************************/
import java.util.Random;

public class RandomInts1
{
	public static void main (String [] args)
	{
		int[] nums = new int[10];
		Random gen = new Random();
		for(int i=0; i<10; i++)
		{
			nums[i] = gen.nextInt(100)+1;
			System.out.println(nums[i]);
		}
		
	}//end main
}//end class
