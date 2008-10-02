import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.Random;

/**
   A component that draws two rectangles.
*/
public class DieComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
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
	}
      
      /*
       * g2.setColor (newColor);
      g2.fill(box);
      g2.setColor (black);
      g2.draw(box);

      for (int i = 0; i < gen.nextInt (50); i++)
      {
           // Move rectangle 15 units to the right and 25 units down
           box.setFrame(gen.nextInt (300), gen.nextInt(400), 20, 30);
           
           newColor = new Color (gen.nextInt (256),  //Amount of red
                                 gen.nextInt (256),  //Amount of green
                                 gen.nextInt (256)); //Amount of blue
           
           // Draw moved rectangle
           g2.setColor (newColor);
           g2.fill(box);
           g2.setColor (black);
           g2.draw(box);
           
      }
      */
   }
}
