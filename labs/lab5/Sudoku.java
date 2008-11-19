/***************************
 * Brian Capps
 * 11/18/2008
 * A Sudoku board
 ****************************/
public class Sudoku
{
    private int [][] board;
	private static final int ROWS = 9;
    private static final int COLUMNS = 9;

    public Sudoku()
    {
        board = new int[ROWS][COLUMNS];
		initializeBoard();
    }
	public void initializeBoard ()
    {
       	for (int i = 0; i < ROWS; i++)
       		for (int j = 0; j < COLUMNS; j++)
           		board [i][j] = 0;
    }

   public boolean setNumber (int row, int col, int num)
   {
         if (board[row - 1][col - 1] != 0)//check if space is filled
               return false;

         for (int i = 0; i < ROWS; i++)
              if (board[i][col - 1] == num)//check column for dupe
                   return false;

         for (int i = 0; i < COLUMNS; i++)
              if (board[row - 1][i] == num) //check row for dupe
                   return false;

         board[row - 1][col - 1] = num;//place number

         return true;
    }//end set method
	public boolean isFull()
	{
		for (int i = 0; i < ROWS; i++)
        	for (int j = 0; j < COLUMNS; j++)
          		if (board [i][j] == 0)
					return false;
		return true;
	}
    public String toString()
    {
     	String boardOutput = "\n+-----+-----+-----+";
       	for (int i = 0; i < ROWS; i++)
       	{
         	boardOutput+= "\n|";
           	for (int j = 0; j < COLUMNS; j++)
           	{
            	if (board[i][j] == 0)
                	boardOutput += " ";
                else
                    boardOutput += board[i][j];

				boardOutput += "|";
           	}
          	if ((i + 1) % 3 == 0)//every third row
            	boardOutput += "\n+-----+-----+-----+";
          }//end for loop
          boardOutput += "\n\n";

          return boardOutput;
    }//end toString method
}//end Sudoku class