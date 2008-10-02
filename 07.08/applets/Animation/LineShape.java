/**
 * Create a line we can animate in AnimationApplet.
 */
import java.awt.*;
import java.awt.geom.*;

public class LineShape
{
     private Line2D.Double line;
     private int x1, y1, x2, y2;//the coordinates of the line
     private int x1Run, x1Dir, 
          y1Rise, y1Dir, 
          x2Run, x2Dir, 
          y2Rise, y2Dir;
     
     public LineShape (int xO, int yO, int xT, int yT,
                       int x1R, int x1D, int y1R, int y1D,
                        int x2R, int x2D, int y2R, int y2D)
     {
          x1 = xO;
          y1 = yO;
          x2 = xT;
          y2 = yT;
          x1Run = x1R;
          y1Rise = y1R;
          x1Dir = x1D;
          y1Dir = y1D;
          x2Run = x2R;
          y2Rise = y2R;
          x2Dir = x2D;
          y2Dir = y2D;
		  line = new Line2D.Double(x1,y1,x2,y2);
     }//end LineShape
     
     
     //Accessor method
	 public Line2D.Double getLine()
	 {
		return line;
	 }
	 public void setLine()
	 {
		line.setLine(x1,y1,x2,y2);
	 }
     public int getX1 ()
     {
          return x1;
     }//end getX1 method
     
     
     //Mutator method
     public void setX1 (int newX1)
     {
          x1 = newX1;
     }//end setX1 method
     
     
     //Accessor method
     public int getY1 ()
     {
          return y1;
     }//end getY1 method
     
     
     //Mutator method
     public void setY1 (int newY1)
     {
          y1 = newY1;
     }//end setY1 method
     
     
     //Accessor method
     public int getX2 ()
     {
          return x2;
     }//end getX2 method
     
     
     //Mutator method
     public void setX2 (int newX2)
     {
          x2 = newX2;
     }//end setX2 method
     
     
          //Accessor method
     public int getY2 ()
     {
          return y2;
     }//end getY2 method
     
     
     //Mutator method
     public void setY2 (int newY2)
     {
          y2 = newY2;
     }//end setY2 method
     
     
     //Accessor method
     public int getX1Run ()
     {
          return x1Run;
     }//end getX1Run method
     
     
     //Mutator method
     public void setX1Run (int newX1Run)
     {
          x1Run = newX1Run;
     }//end setX1Run method
     
     
     //Accessor method
     public int getX2Run ()
     {
          return x2Run;
     }//end getX2Run method
     
     
     //Mutator method
     public void setX2Run (int newX2Run)
     {
          x2Run = newX2Run;
     }//end setX2Run method
     
     
     //Accessor method
     public int getY1Rise ()
     {
          return y1Rise;
     }//end getY1Rise method
     
     
     //Mutator method
     public void setY1Rise (int newY1Rise)
     {
          y1Rise = newY1Rise;
     }//end setY1Rise method
     
     
     //Accessor method
     public int getY2Rise ()
     {
          return y2Rise;
     }//end getY2Rise method
     
     
     //Mutator method
     public void setY2Rise (int newY2Rise)
     {
          y2Rise = newY2Rise;
     }//end setY2Rise method
     

     //Accessor method
     public int getX1Dir ()
     {
          return x1Dir;
     }//end getX1Dir method
     
     
     //Mutator method
     public void switchX1Dir ()
     {
          x1Dir *= -1;
     }//end switchX1Dir method

     
     //Accessor method
     public int getY1Dir ()
     {
          return y1Dir;
     }//end getY1Dir method
     
     
     //Mutator method
     public void switchY1Dir ()
     {
          y1Dir *= -1;
     }//end switchY1Dir method
     

     //Accessor method
     public int getX2Dir ()
     {
          return x2Dir;
     }//end getX2Dir method
     
     
     //Mutator method
     public void switchX2Dir ()
     {
          x2Dir *= -1;
     }//end switchX2Dir method
     

     //Accessor method
     public int getY2Dir ()
     {
          return y2Dir;
     }//end getY2Dir method
     
     
     //Mutator method
     public void switchY2Dir ()
     {
          y2Dir *= -1;
     }//end switchY2Dir method
     

}//end LineShape class
          