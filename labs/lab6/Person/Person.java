/***************************
 * Brian Capps
 * 11/24/2008
 * Description
 ****************************/
public class Person implements Measurer
{
	private String name;
	private int height;
	
	public Person(String n, int h)
	{
		name = n;
		height = h;
	}
	public double measure(Object anObject)
	{
	    Rectangle aRectangle = (Rectangle) anObject;
	    double area = aRectangle.getWidth() * aRectangle.getHeight();
	    return area;
	}
}//end class
