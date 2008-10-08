/***************************
 * Brian Capps
 * 10/08/2008
 * Gen some primes!
 ****************************/
public class PrimeGenerator
{
	private int num, current;
	public PrimeGenerator(int n)
	{
		num = n;
		current=1;
	}
	public int nextPrime()
    {
		current ++;
		for(int i=2; i<8; i++)
		{
			if(current%i == 0 && current!=i )
			{
				if(current<=num)
					current++;
			}
			else 
		}//end for
		return current;
    }
	public boolean isDone()
	{
		return (current >= num);
	}
}//end class
