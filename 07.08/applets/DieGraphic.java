/***************************
 * Brian Capps  
 * 02/28/2008
 * Description
 ****************************/
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class DieGraphic extends Rectangle2D.Double
{
	private int numDots;
	private ArrayList<Ellipse2D.Double> dots;
	private double dotRadius;
	
	public DieGraphic (double x, double y, double w, double h, int nD)
	{
		super(x, y, w, h);
		dots = new ArrayList<Ellipse2D.Double>();
		numDots = nD;
		dotRadius = w/10;
		setDots();
	}
	
	public void paint(Graphics2D g2)
	{
		g2.setColor(Color.WHITE);
		g2.fill(this);
		
		g2.setColor(Color.BLACK);
		g2.draw(this);
		for(Ellipse2D.Double nextDot : dots)
		{
			g2.fill(nextDot);
		}
	}
	
	public void setDots()
	{
		dots = new ArrayList<Ellipse2D.Double> ();
		
		switch(numDots)
		{
			case 0:
				return;
			case 5:
				dots.add(centerSmall());
			case 4:
				dots.add(topRight());
				dots.add(bottomLeft());
			case 2:
				dots.add(topLeft());
				dots.add(bottomRight());
				break;
			case 1:
				dots.add(centerLarge());
				break;
			case 3:
				dots.add(topRight());
				dots.add(bottomLeft());
				dots.add(centerSmall());
				break;
			case 6:
				dots.add(topLeft());
				dots.add(bottomRight());
				dots.add(topRight());
				dots.add(bottomLeft());
				dots.add(leftCenter());
				dots.add(rightCenter());
				break;
		}
		return;
	}
	private Ellipse2D.Double centerSmall()
	{
		return new Ellipse2D.Double((getX()+ getWidth() / 2  - dotRadius), 
									(getY()+ getHeight() / 2  - dotRadius), 
									dotRadius *2, dotRadius*2);//x,y,width,height
	}
	private Ellipse2D.Double topRight()
	{
		return new Ellipse2D.Double((getX()+ 3*getWidth() / 4  - dotRadius), 
									(getY()+ getHeight() / 4  - dotRadius), 
									dotRadius *2, dotRadius*2);//x,y,width,height	
	}
	private Ellipse2D.Double bottomLeft()
	{
		return new Ellipse2D.Double((getX()+ getWidth() / 4  - dotRadius), 
									(getY()+ 3*getHeight() / 4  - dotRadius), 
									dotRadius *2, dotRadius*2);//x,y,width,height
	}
	private Ellipse2D.Double topLeft()
	{
		return new Ellipse2D.Double((getX()+ getWidth() / 4  - dotRadius), 
									(getY()+ getHeight() / 4  - dotRadius), 
									dotRadius *2, dotRadius*2);//x,y,width,height
	}
	private Ellipse2D.Double bottomRight()
	{
		return new Ellipse2D.Double((getX()+ 3*getWidth() / 4  - dotRadius), 
									(getY()+ 3*getHeight() / 4  - dotRadius), 
									dotRadius *2, dotRadius*2);//x,y,width,height	
	}
	private Ellipse2D.Double centerLarge()
	{
		return new Ellipse2D.Double((getX()+ getWidth() / 2  - dotRadius*1.5), 
									(getY()+ getHeight() / 2  - dotRadius*1.5), 
									dotRadius *3, dotRadius*3);//x,y,width,height
	}
	private Ellipse2D.Double leftCenter()
	{
		return new Ellipse2D.Double((getX()+ getWidth() / 4  - dotRadius), 
									(getY()+ getHeight() / 2  - dotRadius), 
									dotRadius *2, dotRadius*2);//x,y,width,height		
	}
	private Ellipse2D.Double rightCenter()
	{
		return new Ellipse2D.Double((getX()+ 3*getWidth() / 4  - dotRadius), 
									(getY()+ getHeight() / 2  - dotRadius), 
									dotRadius *2, dotRadius*2);//x,y,width,height
	}

	public int getNumDots() 
	{
		return numDots;
	}
}//end class
