/*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*
 *
 *    Name: Brian Capps
 *    Date: 4/9/08
 *    Filename: CalculatorTest.java
 *    Description: Runs Calculator
 *
 GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*/

import javax.swing.JFrame;

public class CalculatorGUITest
{
      public static void main (String args[])
      {
            //Declare and initialize the CalculatorGUI object
            
            JFrame frame = new CalculatorGUI(new String("Calculator"));
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            frame.setResizable(false);
            
            frame.show();
      
      }//end main method
      
}//end ChoiceTest class