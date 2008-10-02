/*******************************************************************************
 *
 *    Name: Brian Capps	
 *    Date: 4/9/08
 *    Filename: PaintToolTest.java
 *    Description: This is the class to test the paint tool.
 *
 *******************************************************************************/

import javax.swing.JFrame;

public class PaintToolTest
{
      public static void main (String args[])
      {
            //Declare and initialize the ChoiceFrame object
            
            JFrame frame = new PaintToolFrame(new String("Paint"));
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            frame.setResizable(false);
            
            frame.show();
      
      }//end main method
      
}//end PaintToolTest class