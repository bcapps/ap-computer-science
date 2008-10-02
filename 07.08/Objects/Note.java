/***************************
 * Brian Capps 
 * 04/28/2008
 * Description
 ****************************/
//there was an import here but it's a surprise for friday...

public class Note
{
	float r, g, b;
	boolean missedNote, scored, isValid;//if was missed, don't draw, got note, if the note exists
	public Note()//if no color specified, values are initialized as 0
	{
		r = 0f;
		g = 0f;
		b = 0f;
		missedNote = false;
		scored = false;
		isValid = false;
	}
	public Note(float red, float green, float blue)//rgb values from 0 to 255
	{
		r = red;
		g = green;
		b = blue;
		missedNote = false;
		scored = false;
		isValid = false;
	}
	public void setColors(float red, float green, float blue)//rgb values from 0 to 255
	{
		r = red;
		g = green;
		b = blue;
	}
	public void draw()
	{
		//this method is a surprise to be revealed friday...
	}
	public void drawBar()
	{
		//contents hidden for your safety - gov't is trackingt his transmission
	}
	public void setMissed(boolean m)
	{
		missedNote = m;
	}
	public boolean getMissed()
	{
		return missedNote;
	}
	public void setScored(boolean s)
	{
		scored = s;
	}
	public boolean getScored()
	{
		return scored;
	}
	public void setIsValid(boolean v)
	{
		isValid = v;
	}
	public boolean getIsValid()
	{
		return isValid;
	}
	public String toString()
	{
		return ("r = "+r+"\ng = "+g+"\nb = "+b+"\nmissedNote = "+missedNote+
		"\nscored = "+scored+"\nisValid = "+isValid);
	}
}//end class
