/**
 * Our first Applet>FD'snbdfjhgkjfsdhg
 */
import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.Random;
import java.awt.event.*;

public class AnimationApplet extends Applet implements Runnable, KeyListener
{
	//Declare any global variables here
	private Line2D.Double line;
	
	private Thread animator;//thread will control animation
	private int delay;//time pasued/sleeping between threads (in ms)
	private LineShape line1;

	
	public void init()
	{
		//initiaize any and all values for the Applet
		
		line = new LineShape(50, 100, 150, 65, 1, 1, 1, 
							 1 1, -1, 1, -1);
		delay = 10;
		
		this.setFocusable(true);
		this.addKeyListener(this);
	}
	
	public void start()
	{
		animator = new Thread(this);
		animator.start();
	}
	
	public void stop()
	{
		animator = null;
	}
	
	public void paint (Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		line.setLine(x1,y1,x2,y2);
		g2.draw(line);
	}
	public void run()
	{
		while(Thread.currentThread() == animator)
		{
			line1.setX1 (line1.getX1() + line1.getX1Run*line1.getX1Dir())
			y1 += y1Rise*y1Dir;
			x2 += x2Run*x2Dir;
			y2 += y2Rise*y2Dir;
			
			if (x1 < 0)
			{
				x1=0;
				x1Dir *= -1;
			}
			else if (x1>this.getWidth())
			{
				x1=this.getWidth();
				x1Dir *= -1;
			}
			if (y1 < 0)
			{
				y1=0;
				y1Dir *= -1;
			}
			else if (y1>this.getWidth())
			{
				y1=this.getWidth();
				y1Dir *= -1;
			}
			if (x2 < 0)
			{
				x2=0;
				x2Dir *= -1;
			}
			else if (x2>this.getWidth())
			{
				x2=this.getWidth();
				x2Dir *= -1;
			}
			if (y2 < 0)
			{
				y2=0;
				y2Dir *= -1;
			}
			else if (y2>this.getWidth())
			{
				y2=this.getWidth();
				y2Dir *= -1;
			}
			
			repaint();
			
			try
			{
				Thread.sleep(delay);//sleep for delay time
			}
			catch(InterruptedException e)
			{
				System.exit(-1);
			}
		}//end while
	}//end run
	public void keyReleased(KeyEvent e){}
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode()==KeyEvent.VK_UP)
		{
			y1Rise++;
			if(y1Rise >=20)
				y1Rise=20;
		}//end if
	}//end keyPressed
	public void keyTyped(KeyEvent e){}
}