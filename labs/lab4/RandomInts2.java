/***************************
 * Brian Capps
 * 10/25/2008
 * Description
 ****************************/
import java.util.Random;

public class RandomInts2
{
	public static void main (String [] args)
	{
		int[] nums = new int[10];
		Random gen = new Random();
		for(int i=0; i<10; i++)
		{
			nums[i] = gen.nextInt(100)+1;
			for(int j=i-1; j>=0; j--)
				if (nums[i] == nums[j])
					nums[i] = gen.nextInt(100)+1;
		}
		for(int i=nums.length-1; i>=0; i--)
			System.out.println(nums[i]);
	}//end main
}//end class
