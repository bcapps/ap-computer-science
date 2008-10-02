/*******************************************************************************
 *
 *    Name: 
 *    Date: 
 *    Filename: Drawable Shape.java
 *    Description: This is a special Shape to store additional info about how a shape is to be
 *                   drawn on the screen.
 *
 *******************************************************************************/

import java.awt.*;
import java.awt.geom.*;

public class DrawableShape
{
      private RectangularShape shape;
      private Color outline_color;
      private Color fill_color;

      private int width;
      private int height;
      
      private int draw_point_x;
      private int draw_point_y;
      
      private char fill_type;
      
      DrawableShape (RectangularShape s, char fill_t, int x, int y, int w, int h, Color oc, Color fc)
      {
            shape = s;
            outline_color = oc;
            fill_color = fc;
            width = w;
            height = h;
            draw_point_x = x;
            draw_point_y = y;
            fill_type = fill_t;
      }
      
      
      public RectangularShape getShape ()
      {
            return shape;
      }//end constructor
      
      
      public Color getOutlineColor()
      {
            return outline_color;
      }//end getOutlineColor
      
      
      public Color getFillColor()
      {
            return fill_color;
      }//end getFillColor
      
      
      public int getWidth()
      {
            return width;
      }//end getWidth
      
      
      public int getHeight()
      {
            return height;
      }//end getHeight
      
      
      public int getX()
      {
            return draw_point_x;
      }//end getX
      
      
      public int getY()
      {
            return draw_point_y;
      }//end getY
      
      
      public char getFillType()
      {
            return fill_type;
      }//end getFillType

}//end DrawableShape class