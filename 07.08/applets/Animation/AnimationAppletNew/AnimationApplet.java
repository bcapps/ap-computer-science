/********************************************************************************
 *
 *    Name: 
 *    Date: 5/1/05
 *    Filename: AnimationApplet.java
 *    Description: Animated so that two squares move around the screen and bounce
 *         off of eachother.  Also, there are keyboard interactions.
 *
 *********************************************************************************/

import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.*;
import java.util.Random.*;

//Notice, we extend the Applet class and implement the thread interface Runnable
public class AnimationApplet extends Applet implements Runnable, KeyListener
{
   //'one' and 'two' will be our animated objects.
   private AnimatedShape one;
   private AnimatedShape two;
   
   //A Thread controls the animation.
   private Thread animator;
   
   //delay (in milliseconds) will control the step by step
   // animation time.
   private int delay = 20;
   
   private boolean intersecting;
   
   //Set up the initial position of the squares and initialize
   // the Rectangle2D.Double object.  This is the first method
   // called when the Applet is opening.
   public void init()
   {
      one = new AnimatedShape (new Rectangle2D.Double(), 0, 0, 100, 100,
                               1, 1, 1, 2, Color.BLACK, Color.RED);
      two = new AnimatedShape (new Rectangle2D.Double(), 300, 300, 100, 100,
                               1, -1, 4, 2, Color.BLACK, Color.BLUE);
      
      //This code sets the Applet up to allow for and react to keyboard input.
      this.setFocusable(true);
      this.addKeyListener(this);
            
      intersecting = false;
      
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
   
   
   //The paint method.
   public void paint(Graphics g)
   {
      
      //recover Graphics2D
      Graphics2D g2 = (Graphics2D)g;
      /*
       //This generates a random color.
       Random gen = new Random ();
       Color color = new Color ((int)(gen.nextDouble() * 256),
       (int)(gen.nextDouble() * 256),
       (int)(gen.nextDouble() * 256));
       */
      
      g2.setColor(one.getFillColor());
      g2.fill (one.getShape());
      g2.setColor(one.getOutlineColor());
      g2.draw (one.getShape());
      
      g2.setColor(two.getFillColor());
      g2.fill (two.getShape());
      g2.setColor(two.getOutlineColor());
      g2.draw (two.getShape());
      
   }//end paint method
   
   
   //After the start method has been called, the run method is called.
   public void run ()
   {
      //Check that the current thread is still our animator (basically
      // this is true until the Applet is closed.
      while(Thread.currentThread() == animator)
      {
         //Move each shape.
         one.moveShape();
         two.moveShape();
         Random gen = new Random();
		Color newColor = new Color (gen.nextInt (256),  //Amount of red
		                                  gen.nextInt (256),  //Amount of green
		                                  gen.nextInt (256)); //Amount of blue
		
         //These if/else statements check if the 'one' has hit a
         // wall and we need to change its direction.
         if (one.getX() > (this.getWidth()-one.getWidth()))
         {      
            //Make sure 'one' didn't go right past the wall and
            // change its left/right direction.
			one.setFillColor(newColor);
            one.setX((this.getWidth()-one.getWidth()));
            one.changeHorizontalDirection();
         }
         else if (one.getX() < 0)
         {
            //Make sure 'one' didn't go past the right wall and
            // change its left/right direction.
			one.setFillColor(newColor);
            one.setX(0);
            one.changeHorizontalDirection();
         }
         if (one.getY() > (this.getHeight()-one.getHeight()))
         {
            //Make sure 'one' didn't go past the bottom and
            // change it's up/down direction.
			one.setFillColor(newColor);
            one.setY((this.getHeight()-one.getHeight()));
            one.changeVerticalDirection();
         }
         else if (one.getY() < 0)
         {
            //Make sure 'one' didn't go past the wall and change it's up/
            // down direction.
			one.setFillColor(newColor);
            one.setY(0);
            one.changeVerticalDirection();
         }
         
         //These if/else statements check if the 'two' has hit a
         // wall and we need to change its direction.
         if (two.getX() > (this.getWidth()-two.getWidth()))
         {      
            //Make sure 'two' didn't go right past the wall and
            // change its left/right direction.
			two.setFillColor(newColor);
            two.setX((this.getWidth()-two.getWidth()));
            two.changeHorizontalDirection();
         }
         else if (two.getX() < 0)
         {
            //Make sure 'two' didn't go past the right wall and
            // change its left/right direction.
			two.setFillColor(newColor);
            two.setX(0);
            two.changeHorizontalDirection();
         }
         if (two.getY() > (this.getHeight()-two.getHeight()))
         {
            //Make sure 'two' didn't go past the bottom and
            // change it's up/down direction.
			two.setFillColor(newColor);
            two.setY((this.getHeight()-two.getHeight()));
            two.changeVerticalDirection();
         }
         else if (two.getY() < 0)
         {
            //Make sure 'two' didn't go past the wall and change it's up/
            // down direction.
			one.setFillColor(newColor);
            two.setY(0);
            two.changeVerticalDirection();
         }
         
         if (one.getShape().intersects((Rectangle2D)two.getShape()))
         {
            if (!intersecting)
            {
			   one.setFillColor(newColor);
			   two.setFillColor(newColor);
               delay *= 5;
               System.out.println ("The squares are intersecting!\n" +
                                   "\tThe delay is " + delay);
               intersecting = true;
            }
         }
         else
         {
            if (intersecting)
            {
               delay /= 5;
               System.out.println ("The squares are NOT intersecting!\n" +
                                   "\tThe delay is " + delay);
               intersecting = false;
            }
         }
         
         //Repaint the squares in the new position (basically,
         // it clears the Applet window and calls the paint method
         // again.
         repaint();
         
         
         //Have the Thread sleep for the time (in milliseconds)
         // specified by delay.
         try
         {
            Thread.sleep(delay);
         }
         catch (InterruptedException e)
         {
            break;
         }
      }//end while method
   }// end run method
   
   
   public void keyPressed(KeyEvent e)
   {
      //This code checks that the up or down arrow keys were
      // pressed.  If so, increment or decrement the delay
      // (a.k.a. the speed of the animation.)
      if(e.getKeyCode() == KeyEvent.VK_UP)
      {
         delay+=2;
      }
      else if(e.getKeyCode() == KeyEvent.VK_DOWN)
      {
         delay-=2;
         
         //Don't let the speed go lower than 0.
         if(delay<0)
            delay=0;
      }
   }//end keyPressed method
   
   public void keyReleased(KeyEvent e) {}
   
   public void keyTyped(KeyEvent e) {}
   
   
}//end AnimationApplet class