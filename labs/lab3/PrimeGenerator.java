/***************************
 * Brian Capps
 * 10/08/2008
 * Gen some primes!
 ****************************/
public class PrimeGenerator
{
	private int num, current;
	private boolean done;
	
	public PrimeGenerator(int n)
	{
		num = n;
		current=1;
		done = false;
	}
	public int nextPrime()
    {
		current ++;
		while (current<num )
		{
			boolean prime = true;
			for(int j=2; j<current; j++)
			{
				if(current%j == 0)
				{
					prime = false;
				}
			}
			if(prime)
				return current;
			else
				current++;
		}//end while
		return current;
    }//end nextPrime
	public boolean isDone()
	{
		int oldCurrent = current;
		
		if(nextPrime()>=num)
			return true;
		else
		{
			current = oldCurrent;
			return (current >= num);
		}
	}//end isDone
}//end class
