/***************************
 * Brian Capps
 * 10/10/2008
 * STORE + ACCESS SOME INFOZ
 ****************************/
public class Card
{
	private String card, cardInfo;
	public Card(String c)
	{
		card = c;
		cardInfo = new String();
		init();
	}
	
	public void init()
	{
		String cardKind = card.substring(0, card.length()-1);
		try
		{
			String kind = "" + Integer.parseInt(cardKind);
			if (Integer.parseInt(cardKind) < 11 && Integer.parseInt(cardKind) > 1)
				cardInfo += kind;
			else
				throw new Exception();
		}//end try
		catch(Exception e)
		{
			if(cardKind.equals("J"))
				cardInfo += "Jack";
			else if(cardKind.equals("Q"))
				cardInfo += "Queen";
			else if(cardKind.equals("K"))
				cardInfo += "King";
			else if(cardKind.equals("A"))
				cardInfo += "Ace";
			else
				cardInfo += "The first part you typed in was wrong";
		}//end catch
		String cardType = card.substring(card.length()-1);
		if(cardType.equals("S"))
			cardInfo += " of Spades";
		else if(cardType.equals("H"))
			cardInfo += " of Hearts";
		else if(cardType.equals("C"))
			cardInfo += " of Clubs";
		else if(cardType.equals("D"))
			cardInfo += " of Diamonds";
		else
			cardInfo += ", except that the second part you typed in was"+
			" absolutely wrong. Why don't you learn how to follow directions?!?!";
	}//end init()
	
	public String getDescription()
	{
		return cardInfo;
	}
}//end class
