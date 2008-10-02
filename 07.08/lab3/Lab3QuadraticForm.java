/************************************************************************
  *
  * Introduction to Programming
  * Name: Brian Capps
  * Date: 10/2/07
  * Title: Lab3QuadraticForm.java
  * Description: In essence, this program creates a tunnel through which 
  * information is conveyed to the user in a logical, presentable way, while 
  * at the same time doing their math homework.
  * (To solve and print results pertaining to the quadratic formula).
  *
  *************************************************************************/

import java.util.Scanner;

public class Lab3QuadraticForm
{
  public static void main (String args [])
  {
    Scanner box = new Scanner (System.in);
    
    double a, b, c, d;//the input variables + the discriminate
    double x1, x2; //Real number solutions
    System.out.print ("\nPlease input a: ");
    a = box.nextDouble();
    System.out.print ("Please input b: ");
    b = box.nextDouble();
    System.out.print ("Please input c: ");
    c = box.nextDouble();
    
    d = b*b - 4*a*c;//d = discriminate = omghax?!
    
    if(d < 0) //Looked ahead a bit...
    {
      System.out.print ("Sorry, but your answer(s) are not real numbers.\n");
    }
    else
    {
    x1 = (-b + Math.sqrt(d) )/2*a;
    x2 = (-b - Math.sqrt(d) )/2*a;
    System.out.print ("Your answers are: "+x1+" and "+x2+"\n\n");
    }//
           
    
  }// end main
}// end Lab3QuadraticForm class