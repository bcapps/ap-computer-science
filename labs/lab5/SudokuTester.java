/***************************
 * Brian Capps
 * 11/18/2008
 * Test Sudoku Board
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
               	System.out.println ("\nInvalid Input, Idiot!");

         	System.out.println(board.toString());
       	}//end while
		System.out.println("The board is full, thanks for playing!");
     }//end main
}//end class