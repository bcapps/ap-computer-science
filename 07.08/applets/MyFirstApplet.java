/**
 * Our first Applet>FD'snbdfjhgkjfsdhg
 */
import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.Random;

public class MyFirstApplet extends Applet
{
	//Declare any global variables here
	private Line2D.Double line1;
	private Line2D.Double line2;
	private Line2D.Double line3;
	DieComponent component;
	
	public void init()
	{
		//initiaize any and all values for the Applet
		line1 = new Line2D.Double(50,50, 300, 300);
		line2 = new Line2D.Double(300,300, 50, 300);
		line3 = new Line2D.Double(50,300, 50, 50);
	}
	
	public void paint (Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(line1);
		g2.draw(line2);
		g2.draw(line3);
		//Dice
		Random gen = new Random ();

	    Color newColor = new Color (gen.nextInt (256),  //Amount of red
	                                  gen.nextInt (256),  //Amount of green
	                                  gen.nextInt (256)); //Amount of blue
	    Color black = Color.BLACK;

	    // Construct a rectangle and draw it
	    DieGraphic die1 = new DieGraphic(getWidth()/2 - 105, getHeight()/2 - 50, 100, 100,
	                                            gen.nextInt (6)+1);

	    die1.paint (g2);
	    DieGraphic die2 = new DieGraphic(getWidth()/2 - 50  + 55, getHeight()/2 - 50, 100, 100,
	                                            gen.nextInt (6)+1);

	    die2.paint (g2);
		if (die1.getNumDots() == die2.getNumDots() )
		{
			String doubles = new String("Doubles");
			g2.drawString(doubles, getWidth()/2 - 30, getHeight()/2 + 70);
		}//end if
		//end Dice
		g2.setColor(newColor);
		g2.setFont(new Font("Arial", 0, 64));
		g2.drawString("Woooooaaaaahhhhh", 20, 200);
	}
}