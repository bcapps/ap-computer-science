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
		p.addCoin(new Coin("a", 1.0));
		p.addCoin(new Coin("b", 2.0));
		p.addCoin(new Coin("c", 3.0));
		System.out.println(p);
		p.reverse();
		System.out.println(p);
		p.reverse();
		System.out.println(p);
	}//end main
}//end class
