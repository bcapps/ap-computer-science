/*******************************************************************************
 *
 *    Name: 
 *    Date: 
 *    Filename: ColorChoicePanel.java
 *    Description: This panel is a small 10*10 representation of the current
 *                     color choice.
 *
 *******************************************************************************/

import javax.swing.JPanel;
import java.awt.*;

public class ColorChoicePanel extends JPanel
{
      private Rectangle colorBox;
      private Color currentColor;

      private static final int WIDTH = 20;
      private static final int HEIGHT = 20;
      
      public ColorChoicePanel()
      {
            setPreferredSize(new Dimension(WIDTH,HEIGHT));
            currentColor = Color.BLACK;
            colorBox = new Rectangle(0,0,WIDTH,HEIGHT);
            
      }//end Constructor
      
      
      public void changeColor(Color c)
      {
            currentColor=c;
      }//end changeColor method
      
      
      public void paintComponent(Graphics g)
      {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D)g;
            g2.setColor(currentColor);
            g2.fill(colorBox);
            g2.setColor(Color.BLACK);
            g2.draw(colorBox);
      }//end paintComponent method
      
}//end ColorChoicePanel class