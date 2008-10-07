/***************************
 * Brian Capps
 * 10/07/2008
 * BASIC TIC-TAC-TOE
 ****************************/

import java.util.Scanner;

public class TicTacToe
{
	public static void main (String [] args)
	{
		final int SIDE_LENGTH = 3;
		Scanner in = new Scanner(System.in);
		
		String[][] board = new String[SIDE_LENGTH][SIDE_LENGTH];
		//								num rows   num columns
		
		//Nested loop will loop thru coord's
		for(int row =0; row<SIDE_LENGTH; row++)
		{
			for(int col = 0; col<SIDE_LENGTH; col++)
			{
				System.out.println("Entry for ("+row+", "+col+"): ");
				
				board[row][col] = in.nextLine();
			}
			
		}
		
		System.out.println("\n HOW YOU LIKE THE BOARD NOW, B!T$H?!:\n\n");
		
		for(int row =0; row<SIDE_LENGTH; row++)
		{
			for(int col = 0; col<SIDE_LENGTH; col++)
			{
				System.out.print(board[row][col] + " ");
			}
			
			System.out.println();
			
		}
	}//end main
}//end class
