/***************************
 * Brian Capps 
 * 10/18/2008
 * FUN FUN FUN FUN GAME
 ****************************/
import java.util.Random;
import java.util.Scanner;

public class GuessGame
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		Random numGen = new Random();
		int num = numGen.nextInt(100)+1;
		
		System.out.println("Welcome to the guessing store, we enjoy your service!\n");
		
		System.out.print("NOW PICK HOW MANY GUESSES YOU WANT BEFORE I KICK YOU OUT"+
							" OF MY STORE YOU HOOLIGANS: ");
							
		int numGuesses = in.nextInt();
		
		System.out.println("YOU'LL NEVER GET IT IN THAT MANY GUESSES YOU FOOLISH TEENYBOPPER");
		
		int numGuess;
		do
		{
			System.out.println("\n\nPICK A NUMBER FROM 1 TO 100, ACTUALLY NO, WAIT, DON'T EVEN "+
			"BOTHER, YOU'RE JUST GOING TO BE WRONG ANYWAY.  ALSO, YOUR PARENTS DON'T LOVE YOU: ");
			numGuess = in.nextInt();
			if (numGuess > num)
                 System.out.println ("OH, SORRY, IT'S LOWER.  LIKE YOUR IQ.");
            else if (numGuess < num)
                 System.out.println ("UM, NO, THE # IS HIGHER.  LIKE EVERYONE ELSE COMPARED TO YOU.");
            else
				System.out.println("\n...You..YOU...........Got it?  AS IT IS WRITTEN IN SACRED SCRIPTURE,"+
									"THE ONE WHO GUESSES "+num+" SHALL BE THE SAVIOR....And then, once "+
									"upon a time, the man who guessed the number "+num+" was hailed as the "+
									"second coming of Christ and everyone lived happily ever after."+
									"  The End.");
			numGuesses--;
		}
		while(numGuess != num && numGuesses > 0);
		
	}//end main
}//end class
