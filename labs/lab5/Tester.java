/***************************
 * Brian Capps
 * 11/05/2008
 * Description
 ****************************/
public class Tester
{
	public static void main (String [] args)
	{
		Purse p = new Purse();
		Purse p2 = new Purse();
		p.addCoin(new Coin("a", 1.0));
		p.addCoin(new Coin("b", 2.0));
		p.addCoin(new Coin("e", 3.0));
		p.addCoin(new Coin("c", 3.0));
		p.addCoin(new Coin("d", 4.0));
		
		p2.addCoin(new Coin("d", 4.0));
		p2.addCoin(new Coin("a", 1.0));
		p2.addCoin(new Coin("b", 2.0));
		p2.addCoin(new Coin("c", 3.0));
		p2.addCoin(new Coin("e", 3.0));
		
		System.out.println(p);
		System.out.println(p2);
		
		p.sort();
		System.out.println(p);
		p2.sort();
		System.out.println(p2);
		
		if (p.sameCoins(p2))
			System.out.println("THE SAME COINS.");
		//p.reverse();
		//System.out.println(p);
		///p.transfer(p2);
		//System.out.println(p);
		//System.out.println(p2);
	}//end main
}//end class
