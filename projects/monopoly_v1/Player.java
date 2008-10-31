/***************************
 * Brian Capps
 * 10/29/2008
 * Description
 ****************************/
public class Player
{
	private String name;
	private int space, money, doubles, whichPiece;
	private boolean inJail;
	
	public Player(String n)
	{
		name = n;
		space = 0;
		money = 0;
		whichPiece = 1;
		doubles = 0;
		inJail = false;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
	public int getSpace()
	{
		return space;
	}
	public void setSpace(int s)
	{
		space = s;
	}
	public int movePiece(int numSpaces)
	{
		space += numSpaces;
		return space;
	}
	public void addDoubles()
	{
		doubles += 1;
	}
	public int getDoubles()
	{
		return doubles;
	}
	public void resetDoubles()
	{
		doubles = 0;
	}
	public boolean isInJail()
	{
		return inJail;
	}
	public int getPiece()
	{
		return whichPiece;
	}
	public int getMoney()
	{
		return money;
	}
	public void setMoney(int m)
	{
		money += m;
	}
}//end class
