/*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets
 *
 *    Name: Brian Capps	
 *    Date: 4/21/08
 *    Filename: PongApplet.java
 *    Description: Play the game of Pong.
 *
 Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*Applets*/

import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;


//Notice, we extend the Applet class and implement the thread interface Runnable
// and interactive KeyListener interface.
public class PongApplet extends Applet implements Runnable, KeyListener
{
     //These rectangles will be our paddles.
     private AnimatedShape paddle1;
     private AnimatedShape paddle2;
     
     private AnimatedShape ball;
     
     private int player1Points;
     private int player2Points;
     
     boolean gameOver;
     
     //Thread controls the animation.
     private Thread pongAnimator;
     
     //delay(in milliseconds) will control the step by step
     // animation time.
     private int delay = 20;
     
     //This sets the size of the paddles and the ball and determines the
     //  max points for the game.
     public static final int BALL_DIAMETER = 10;
     public static final int PADDLE_WIDTH = 10;
     public static final int PADDLE_HEIGHT = 40;
     public static final int MAX_POINTS = 4;
     
     
     //Set up the initial values for the paddles and the ball.
     //  This is the first method called when the Applet is opening.
     public void init()
     {
          /**************************
            * CODE TO BE ADDED BY YOU
            *************************/
		  //paddle1 = new AnimatedShape(new Rectangle2D.Double(0,0,0,0), 0, 0,
		//	                         PADDLE_WIDTH, PADDLE_HEIGHT, 1, -1,
		//	                         0, int rs, Color o, Color f)
          //This code sets the Applet up to allow for and react to keyboard input.
          this.setFocusable(true);
          this.addKeyListener(this);
          
          player1Points = 0;
          player2Points = 0;
          
          gameOver = false;
          
     }
     
     
     //Start the Applet(called after the init method is called)
     public void start()
     {
          pongAnimator = new Thread(this);
          pongAnimator.start();
     }
     
     
     //This method is called with the Applet is closed.
     public void stop()
     {
          pongAnimator = null;
     }
     
     
     //The paint method.
     public void paint(Graphics g)
     {
          //recover Graphics2D
          Graphics2D g2 =(Graphics2D)g;
          
          //This generates a random color.
          //Color color = new Color((int)(Math.random() * 256),(int)(Math.random() * 256),(int)(Math.random() * 256));
          
          if(gameOver)
          {
               g2.drawString("GAME FINISHED KTHX.", getWidth()/2-50, getHeight()/2-10)
          }
          else
          {
				ball 
               /**************************
                 * CODE TO BE ADDED BY YOU
                 *************************/
          }
          
     }
     
     
     //After the start method has been called, the run method is called.
     public void run()
     {
          //Check that the current thread is still our pongAnimator.
          while(Thread.currentThread() == pongAnimator && !gameOver)
          {
               /**************************
                 * CODE TO BE ADDED BY YOU
                 *************************/
               
               repaint();
               
               //Have the Thread sleep for 1 second at a time.
               try
               {
                    Thread.sleep(delay);
               }
               catch(InterruptedException e)
               {
                    break;
               }
          }
     }
     
     
     
     //The following methods control the keyboard input.
     public void keyPressed(KeyEvent e)
     {
          //This code checks a key was pressed to move one of the
          // the paddles.
          if(e.getKeyCode() == KeyEvent.VK_UP)
          {
               /**************************
                 * CODE TO BE ADDED BY YOU
                 *************************/
          }
          else if(e.getKeyCode() == KeyEvent.VK_DOWN)
          {
               /**************************
                 * CODE TO BE ADDED BY YOU
                 *************************/
          }
          
     }
     
     public void keyReleased(KeyEvent e)
     {}
     
     public void keyTyped(KeyEvent e)
     {}
     
     
}//end PongApplet class