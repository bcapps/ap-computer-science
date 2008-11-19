/***************************
 * Brian Capps
 * 11/18/2008
 * Description
 ****************************/
import java.util.Scanner;

public class SudokuTester
{
     	public static void main (String args [])
     	{
          	Sudoku board = new Sudoku();
          	Scanner in = new Scanner(System.in);

         	System.out.println(board.toString());

          	while (!board.isFull())
          	{
           		System.out.print ("Row: ");
				int row = in.nextInt();
				System.out.print("\nColumn: ");
				int col = in.nextInt();
				System.out.print ("\nNumber: ");
 				int num = in.nextInt();

           		if (!board.setNumber(row, col, num))
                	System.out.println ("Invalid Input, Idiot!");

               System.out.println(board.toString());
          }// end while

     }//end main
}//end class