/*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets
 *
 *    Name:  Brian Capps
 *    Date:  11/30/08
 *    Filename: Lab6Applet.java
 *    Description: Applet guy with resizable jauns and movable things
 *
 Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*/

import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class Lab6Applet extends Applet implements Runnable, 
										MouseListener, MouseMotionListener,
 										KeyListener
                                 
{
     //Thread controls the animation.
     private Thread animator;
     
     //delay(in milliseconds) will control the step by step
     // animation time.
     private int delay = 20;
     
     //This shape will be controlled within the Applet
     public Rectangle2D.Double box;
     public double x, y, side;
     
     public void init()
     {
          side = 100.0;
          x = this.getWidth()/2 - side/2;
          y = this.getHeight()/2 - side/2;
          box = new Rectangle2D.Double (x, y, side, side);
          
          //This code sets the Applet up to allow for and react to keyboard input.
          this.setFocusable(true);
          this.addKeyListener(this);
          this.addMouseMotionListener(this);
          this.addMouseListener(this);
          
     }//end init method
     
     
     //Start the Applet (called after the init method is called)
     public void start()
     {
          animator = new Thread(this);
          animator.start();
     }//end start method
     
     
     //This method is called when the Applet is closed.
     public void stop()
     {
          animator = null;
     }//end stop method
     
     //After the start method has been called, the run method is called.
     public void run()
     {
          //Check that the current thread is still our animator.
          while(Thread.currentThread() == animator)
          {
               //Repaint the paddles in the new position(basically,
               // it clears the Applet window and calls the paint method
               // again.
               repaint();
               
               
               //Have the Thread sleep for the time(in milliseconds)
               // specified by delay.
               try
               {
                    Thread.sleep(delay);
               }
               catch(InterruptedException e)
               {
                    break;
               }
               
          }//end while loop
     }//end run method
     
     
     
     //This method paints (or updates) the shape(s) on the screen
     public void paint(Graphics g)
     {
          //recover Graphics2D
          Graphics2D g2 = (Graphics2D)g;
          
          
          g2.setColor(Color.BLACK);
          g2.draw(box);
          
          g2.setColor(Color.RED);
          g2.fill(box);
          
     }//end paint method

  		public void mouseClicked(MouseEvent e)
		{}
	 	public void mouseEntered(MouseEvent e)
		{
			x = e.getX()-side/2;
			y = e.getY()-side/2;
			box = new Rectangle2D.Double (x, y, side, side);
			repaint();
		}
	 	public void mouseExited(MouseEvent e)
		{}
	 	public void mousePressed(MouseEvent e)
		{}
	 	public void mouseReleased(MouseEvent e)
		{}
		public void mouseDragged(MouseEvent e)
		{}
		public void mouseMoved(MouseEvent e)
		{
			x = e.getX()-side/2;
			y = e.getY()-side/2;
			box = new Rectangle2D.Double (x, y, side, side);
			repaint();
		}
		public void keyPressed(KeyEvent e) 
		{
			if (e.getKeyCode() == KeyEvent.VK_UP)
			{
				side += 2;
				x-=1;
				y-=1;
				box = new Rectangle2D.Double (x, y, side, side);
				repaint();
			}
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				side -= 2;
				x+=1;
				y+=1;
				box = new Rectangle2D.Double (x, y, side, side);
				repaint();
			}
		}
		public void keyReleased(KeyEvent e) 
		{}
		public void keyTyped(KeyEvent e) 
		{}

}//end MyFirstApplet class