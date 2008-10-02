/*******************************************************************************
 *
 *    Name: Brian Capps
 *    Date: 4/8/08
 *    Filename: PaintToolFrame.java
 *    Description: This is a special Frame that acts as a point tool.
 *
 *******************************************************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.colorchooser.*;
import javax.swing.event.*;


public class PaintToolFrame extends JFrame
{
      //This Panel will contain the editting.
      private DrawingPanel drawPanel;
      
      //These are the components used to change the drawing shape, fill type,
      //    and color.
      private JRadioButton current;
      private JRadioButton fill;
      private JRadioButton fill_and_current;
      
      //We need to double up on the ColorChoosers since we have two different colors to choose
      private DefaultColorSelectionModel currentColorPicker;
      private DefaultColorSelectionModel fillColorPicker;
      private ColorChoicePanel currentCurrentChoice;
      private JColorChooser current_color_panel;
      private JDialog currentColorDialog;

      //These buttons will be used to open the choose color dialog boxes.
      private JButton choose_current_color;
            
      /*
       * This is the constructor for our PaintToolFrame
       */
      public PaintToolFrame(String name)
      {
            //The keyword super simply sends name to the constructor of
            //  JFrame.
            super(name);
            
            //Construct the DrawingPanel
            drawPanel = new DrawingPanel();
            
            //Add the DrawingPanel to the Frame
            add(drawPanel, BorderLayout.CENTER);
            
            //Call the method below to add all the extra components
            createControlPane();
            
            createColorDialogs();
            
            //Create and set the menu bar
            JMenuBar menu_bar = new JMenuBar();
            setJMenuBar(menu_bar);
            
            //Call the methods to add the File menu to the menu bar 
            menu_bar.add(createFileMenu());
            
            pack();
            
      }//end constructor
      
      
      /*
       * The following method creates the control panel to change the font.
       */
      public void createControlPane()
      {
            //Create the four panels that control the font change
            JPanel colorChoicePanel = createChooseColorButtons();
            
            //Add the four font control panels to one big panel using
            //  a grid layout
            JPanel controlPanel = new JPanel();
            controlPanel.setLayout(new GridLayout(3,1));
            controlPanel.add(colorChoicePanel);
            
            //Add the panels to the content pane
            getContentPane().add(controlPanel, BorderLayout.SOUTH);
      }
      
      
      /*
       * The following method creates the file menu
       * postcondition: returns the JMenu for the file menu.
       */
      public JMenu createFileMenu()
      {
            JMenu menu = new JMenu(new String("File"));
            menu.add(createFileResetItem());
            menu.add(createFileExitItem());
            return menu;
      }//end createFileMenu method
      
      
      /*
       * The following method creates the file menu item to reset the screen
       * postcondition: returns the JMenuItem for the file menu item "Reset".
       */
      public JMenuItem createFileResetItem()
      {
            JMenuItem item = new JMenuItem(new String("Reset"));
            class MenuItemListener implements ActionListener
            {
                  public void actionPerformed(ActionEvent event)
                  {
                        int num_shapes = drawPanel.getNumShapes();
                        
                        for (int i = 0; i< num_shapes; i++)
                        {
                              drawPanel.removeShape();
                        }
                        
                        repaint();
                  }
            }
            ActionListener listener = new MenuItemListener();
            item.addActionListener(listener);
            return item;
      }//end createFileResetItem method
      
      
      /*
       * The following method creates the file menu item to quit the program
       * postcondition: returns the JMenuItem for the file menu item "Exit".
       */
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
      
      
      /*
       * The following method creates the color chooser dialog boxes
       */
      public void createColorDialogs()
      {
            currentColorDialog = new JDialog(this,new String("Choose a color"),true);
            currentColorDialog.getContentPane().add(createCurrentColorChoicePanel(), BorderLayout.CENTER);
            
            JButton currentOkButton = new JButton("OK");
            
            //This class is used to create a special ActionListener for
            //    the ok button
            class CurrentButtonListener implements ActionListener
            {
                  /*
                   * This method is called whenever the ok button is clicked
                   */
                  public void actionPerformed(ActionEvent event)
                  {
                        currentCurrentChoice.changeColor(current_color_panel.getColor());
                        currentCurrentChoice.repaint();
                        drawPanel.changeColor(current_color_panel.getColor());
                        currentColorDialog.hide();
                  }//end actionPerformed method
            }
            
            
            ActionListener currentListener = new CurrentButtonListener();
            
            currentOkButton.addActionListener(currentListener);
            
            //Add the four font control panels to one big panel using
            //  a grid layout
            JPanel currentButtonPanel = new JPanel();
            currentButtonPanel.add(currentOkButton);
            
            //Add the button panel to the content pane of the currentColorDialog
            currentColorDialog.getContentPane().add(currentButtonPanel, BorderLayout.SOUTH);
            currentColorDialog.pack();
            
      }//end createColorDialogs method

       /*
       * The following method creates the current color picker.
       */
      public JColorChooser createCurrentColorChoicePanel()
      {
            currentColorPicker = new DefaultColorSelectionModel(Color.BLACK);
            
            //This class is used to create a special ActionListener 
            // for the ColorSelectionModel.
            class CurrentColorChangeListener implements ChangeListener
            {
                  /*
                   * This method is called when the choose_color button is clicked
                   */
                  public void stateChanged(ChangeEvent event)
                  {
                        currentCurrentChoice.changeColor(current_color_panel.getColor());
                        currentCurrentChoice.repaint();
                  }//end actionPerformed method
            }
            ChangeListener listener = new CurrentColorChangeListener();
            currentColorPicker.addChangeListener(listener);
            current_color_panel = new JColorChooser(currentColorPicker);
            
            return current_color_panel;
      }//end createComboBox method

      public JPanel createChooseColorButtons()
      {
            currentCurrentChoice = new ColorChoicePanel();
            
            choose_current_color = new JButton(new String("Choose Current Color..."));

            //This class is used to create a special ActionListener for this menu item
            class CurrentButtonListener implements ActionListener
            {
                  /*
                   * This method is called when the choose_color button is clicked
                   */
                  public void actionPerformed(ActionEvent event)
                  {
                        currentColorDialog.show();
                  }//end actionPerformed method
            }
            ActionListener current_listener = new CurrentButtonListener();
            choose_current_color.addActionListener(current_listener);
            
            JPanel panel = new JPanel();
            
            panel.add(currentCurrentChoice);
            panel.add(choose_current_color);
            
            return panel;
      }//end createChooseColorButtons method
      
}//end PaintToolFrame class