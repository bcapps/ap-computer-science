/***************************
 * Brian Capps
 * 11/05/2008
 * A Purse to hold coins with some methods to do stuff.
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
	public boolean sameContents(Purse otherPurse)
	{
		if(coins.size()!= otherPurse.coins.size())
			return false;
		for(int i= coins.size()-1; i>=0; i--)
			if(!coins.get(i).getName().equals(otherPurse.coins.get(i).getName()) ||
				coins.get(i).getValue()!=otherPurse.coins.get(i).getValue())
					return false;
		return true;
	}
	//sort() sorts the elements first by value then by String value
	public void sort()
	{
		double maxVal = 0.0;
		int hash = 0;
		for(int i= coins.size()-1; i>=0; i--)
		{
				for(int j= 0; j<coins.size(); j++)
				{
					if(coins.get(i).getValue()>coins.get(j).getValue()&& coins.get(i).getValue()>maxVal)
					{
						coins.add(coins.remove(i));
						maxVal = coins.get(i).getValue();
					}//if
					else if (i!=j && coins.get(i).getValue()==coins.get(j).getValue()&& coins.get(i).getValue()==maxVal)
					{
						if (coins.get(i).getName().hashCode()>coins.get(j).getName().hashCode()&&
							coins.get(i).getName().hashCode()>=hash)
						{
								coins.add(coins.remove(i));
								hash = coins.get(i).getName().hashCode();
						}
						else if (coins.get(i).getName().hashCode()<coins.get(j).getName().hashCode())
						{
								coins.add(j, coins.remove(i));
						}
					}//else if
				}//for j
		}//for i
	}
	public boolean sameCoins(Purse otherPurse)
	{
		sort();
		otherPurse.sort();
		return (sameContents(otherPurse));
	}
	public void reverse()
	{
		ArrayList<Coin> temp = new ArrayList<Coin>();
		for(int i= coins.size()-1; i>=0; i--)
			temp.add(coins.remove(i));
		coins = (ArrayList<Coin>) temp.clone();
	}
	public void transfer(Purse otherPurse)
	{
		for(int i =0; i<otherPurse.coins.size(); i++)
			coins.add(otherPurse.coins.get(i));
		otherPurse.coins = new ArrayList<Coin>();
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
