/***************************
 * Brian Capps
 * 11/05/2008
 * Description
 ****************************/

import java.util.ArrayList;

public class Purse
{
	private ArrayList<Coin> coins;
	
	public Purse()
	{
		coins = new ArrayList<Coin>();
	}
	public Purse(ArrayList<Coin> c)
	{
		coins = (ArrayList<Coin>) c.clone();
	}
	
	public void addCoin(Coin n)
	{
		coins.add(n);
	}
	public void reverse()
	{
		ArrayList<Coin> temp = new ArrayList<Coin>();
		for(int i= coins.size()-1; i>=0; i--)
			temp.add(coins.remove(i));
		coins = (ArrayList<Coin>) temp.clone();
	}
	
	public String toString()
	{
		String result = "Purse contents: [ ";
		for(Coin c :coins)
			result+= c.getName()+" ";
		result+="]";
		return result;
	}
}//end class
