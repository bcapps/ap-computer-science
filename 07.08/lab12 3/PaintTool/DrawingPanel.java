/*******************************************************************************
 *
 *    Name: 
 *    Date: 
 *    Filename: DrawingPanel.java
 *    Description: This is a Panel one which lines can be drawn.
 *
 *******************************************************************************/

import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.*;

public class DrawingPanel extends JPanel implements MouseListener, MouseMotionListener
{
      //How can we use lines below to store all the lines that have been added to the screen?
      private ArrayList<DrawableLine> lines;
      //This variable will store the current shape to be added to the ArrayList lines
      private Line2D.Double currentLine;
    
      private Color currentColor;
      
      private int drawPointX;
      private int drawPointY;
      
      private int clickPointX;
      private int clickPointY;
      
      private static final int PANEL_WIDTH = 400;
      private static final int PANEL_HEIGHT = 350;
      
      public DrawingPanel()
      {
            lines = new ArrayList<DrawableLine>();
            this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
            currentColor = Color.BLACK;
            
            drawPointX = 0;
            drawPointY = 0;
            
            clickPointX = 0;
            clickPointY = 0;
            
			currentLine = new Line2D.Double(0,0,0,0);

            this.addMouseListener(this);
            this.addMouseMotionListener(this);
            
      }//end Constructor
      
      
      public void changeColor(Color c)
      {
            currentColor=c;
      }//end changeOutlineColor method
      
      public void setDrawPoint (int x, int y)
      {
            clickPointX = x;
            clickPointY = y;
            drawPointX = clickPointX;
            drawPointY = clickPointY;
      }//end setDrawPoint method
      
      public void paintComponent(Graphics g)
      {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(currentColor);
			
			currentLine.setLine(clickPointX, clickPointY, drawPointX, drawPointY);
			g2.draw(currentLine);
			
			System.out.println("SIZE = "+lines.size()+" lines");
			for (DrawableLine current: lines)
			{
				g2.setColor(current.getColor());
				g2.draw(current.getLine());
				
			}
			
                  
      }//end paintComponent method
      
      
      public void mouseClicked (MouseEvent e)
      {
      }//end mouseClicked method
      
      
      public void mouseEntered (MouseEvent e)
      {
      }//end mouseEntered method
      
      
      public void mouseExited (MouseEvent e)
      {
      }//end mouseExited method
      
      
      public void mousePressed (MouseEvent e)
      {
            setDrawPoint (e.getX(), e.getY());
			System.out.println("x1 = "+clickPointX +
								", y1 = "+ clickPointY + 
								", x2 = "+drawPointX +
								", y2 = "+drawPointY);
			repaint();
			
      }//end mousePressed method
      
      
      public void mouseReleased (MouseEvent e)
      {
            currentLine.setLine(clickPointX, clickPointY, drawPointX, drawPointY);
			lines.add(new DrawableLine((Line2D.Double)currentLine.clone(), clickPointX, clickPointY, drawPointX, drawPointY, currentColor));
            repaint();
      }//end mouseReleased method
      
      
      public void mouseDragged (MouseEvent e)
      {
            drawPointX = e.getX();
 			drawPointY = e.getY();
			currentLine.setLine (clickPointX, clickPointY,
	                                     drawPointX, drawPointY);
            repaint();
      }//end mouseDragged method
      
      
      public void mouseMoved (MouseEvent e)
      {
      }//end mouseMoved method
      
      
      public int getNumShapes()
      {
            return lines.size();
      }//end getNumShapes
      
      
      public void removeShape()
      {
            lines.remove(0);
      }//end removeShape
      
}//end DrawingPanel class