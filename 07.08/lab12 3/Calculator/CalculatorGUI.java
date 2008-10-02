/*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*
 *
 *    Name: Brian Capps
 *    Date: 4/9/08
 *    Filename: CalculatorGUI.java
 *    Description: Implentation of a basic 4-function calculator.
 *
 GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class CalculatorGUI extends JFrame
{
     private JLabel entry;
     
     private String operator;
     private int num1;
     private int num2;
     private boolean operatorEntered;
     private boolean secondNumEntered;

     private JButton zero;
     private JButton one;
     private JButton two;
     private JButton three;
     private JButton four;
     private JButton five;
     private JButton six;
     private JButton seven;
     private JButton eight;
     private JButton nine;
     private JButton plus;
     private JButton minus;
     private JButton times;
     private JButton divide;
     private JButton equals;
     private JButton clear;
     
     public CalculatorGUI(String name)
     {

          super(name);

          entry = new JLabel ();
          this.init();
          entry.setForeground(Color.BLACK);
          
          this.getContentPane().add(entry, BorderLayout.CENTER);

          this.createControlPane();

          JMenuBar menuBar = new JMenuBar();
          this.setJMenuBar(menuBar);
          
          //Call the methods to add two menus (file and font) to the menu bar 
          menuBar.add(this.createFileMenu());
          
          //Call the method to re-draw the result
          this.setEntry();
          
          
     }
     
     

     //Resets everything.
     public void init()
     {
          entry.setText(new String("0"));
          num1 = 0;
          num2 = 0;
          operator=new String ("N");
          operatorEntered = false;
          secondNumEntered = false;
          this.setEntry();
     }//end init method
     
     public void createControlPane()
     {
          JPanel buttonsPanel = this.createButtonGrid();
          
          this.getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
     }
     
     
     public JMenu createFileMenu()
     {
          JMenu menu = new JMenu(new String("File"));
          menu.add(this.createFileResetItem());
          menu.add(this.createFileExitItem());
          return menu;
     }//end createFileMenu method
     
     public JMenuItem createFileResetItem()
     {
          JMenuItem item = new JMenuItem(new String("Reset"));
          class MenuItemListener implements ActionListener
          {
               public void actionPerformed(ActionEvent event)
               {
                    init();
               }
          }
          ActionListener listener = new MenuItemListener();
          item.addActionListener(listener);
          return item;
     }//end createFileResetItem method
     

     public JMenuItem createFileExitItem()
     {
          JMenuItem item = new JMenuItem(new String("Exit"));
          class MenuItemListener implements ActionListener
          {
               public void actionPerformed(ActionEvent event)
               {
                    System.exit(0);
               }
          }
          ActionListener listener = new MenuItemListener();
          item.addActionListener(listener);
          return item;
     }//end createFileExitItem method
     
     public JPanel createButtonGrid()
     {

          //This button will be used to update all the values.
          zero = new JButton ("0");
          one = new JButton ("1");
          two = new JButton ("2");
          three = new JButton ("3");
          four = new JButton ("4");
          five = new JButton ("5");
          six = new JButton ("6");
          seven = new JButton ("7");
          eight = new JButton ("8");
          nine = new JButton ("9");
          plus = new JButton ("+");
          minus = new JButton ("-");
          times = new JButton ("x");
          divide = new JButton ("Ö");
          equals = new JButton ("=");
          clear = new JButton ("C");
          
          //This class is used to create a special ActionListener
          class ButtonListener implements ActionListener
          {
               /*
                * This method is called when a button is clicked
                */
               public void actionPerformed(ActionEvent event)
               {
                    String buttonText = event.getActionCommand();
                    
                    if (Character.isDigit (buttonText.charAt(0)))
                    {
                         if (operator.equals ("N"))
                              num1 = Integer.parseInt (buttonText);
                         else if (!secondNumEntered)
                         {
                              num2 = Integer.parseInt (buttonText);
                              secondNumEntered = true;
                         }
                   }//end if
                    else if (buttonText.equals ("="))
                    {
                         switch (operator.charAt (0))
                         {
                              case '+':
                                   num1 = num1 + num2;
                                   break;
                               case '-':
                                   num1 = num1 - num2;
                                   break;
                              case 'x':
                                   num1 = num1 * num2;
                                   break;
                              case 'Ö':
                                   num1 = num1 / num2;
                                   break;
                              default:
                                   num1 = 0;
                                   break;
                         }//end switch
                         
                         num2 = 0;
                         secondNumEntered = false;
                         operator = "N";
                    }//end else if
                    else if (buttonText.equals ("C"))
                         init();
                    else
                    {
                         if (operator.equals ("N"))
                         {
                              operator = buttonText;
                              operatorEntered = true;
                         }
                    }
                    
                    //Call the method to change the text on the screen.
                    setEntry();
               }//end actionPerformed method
          }
          ActionListener listener = new ButtonListener();
          one.addActionListener(listener);
          two.addActionListener(listener);
          three.addActionListener(listener);
          four.addActionListener(listener);
          five.addActionListener(listener);
          six.addActionListener(listener);
          seven.addActionListener(listener);
          eight.addActionListener(listener);
          nine.addActionListener(listener);
          zero.addActionListener(listener);
          plus.addActionListener(listener);
          minus.addActionListener(listener);
          times.addActionListener(listener);
          divide.addActionListener(listener);
          clear.addActionListener(listener);
          equals.addActionListener(listener);
          
          JPanel panel = new JPanel();
          panel.setLayout (new GridLayout (4, 4));
          panel.add(one);
          panel.add(two);
          panel.add(three);
          panel.add(plus);
          panel.add(four);
          panel.add(five);
          panel.add(six);
          panel.add(minus);
          panel.add(seven);
          panel.add(eight);
          panel.add(nine);
          panel.add(times);
          panel.add(zero);
          panel.add(clear);
          panel.add(equals);
          panel.add(divide);
          
          return panel;
     }//end createUpdateButton method

     public void setEntry()
     {
          if (operator.equals ("N"))
               entry.setText("" + num1);
          else if (operatorEntered)
          {
               entry.setText(entry.getText() + " " + operator);
               operatorEntered = false;
          }
          else if (secondNumEntered)
               entry.setText(entry.getText() + " " + num2);
          
          entry.repaint();
          
          this.pack();
          
     }//end setEntry method
     
}//end ChoiceFrame class