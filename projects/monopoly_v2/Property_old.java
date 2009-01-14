/***************************
 * Brian Capps
 * 10/28/2008
 * Description
 ****************************/
public class Property
{
	private String name, color;
	private int owner, type, cost, rent, mortgage, space;
	
	public Property (String n, int o, int t, String col, int cos, int r, int m, int s)
	{
		name = n;
		owner = o;
		type = t;
		color = col;
		cost = cos;
		rent = r;
		mortgage = m;
		space = s;
	}
	public String getName()
	{
		return name;
	}
	public int getOwner()
	{
		return owner;
	}
	public void setOwner(int o)
	{
		owner = o;
	}
	public int getType()
	{
		return type;
	}
	public String getColor()
	{
		return color;
	}
	public int getCost()
	{
		return cost;
	}
	public int getRent()
	{
		return rent;
	}
	public int getMortgage()
	{
		return mortgage;
	}
	public int getSpace()
	{
		return space;
	}
	public String toString()
	{
		return name+"\n\nCost: $"+cost+", Rent: $"+rent+"\n\n"+
				"Mortgage: $"+mortgage;
	}

}//end class
