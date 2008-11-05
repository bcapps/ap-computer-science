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
	
	public  void addCoin(Coin n)
	{
		coins.add(n);
	}
}//end class
