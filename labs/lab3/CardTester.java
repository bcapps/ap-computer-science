/***************************
 * Brian Capps 
 * 10/16/2008
 * TEsting MAH CARD GEN.
 ****************************/
import java.util.Scanner;

public class CardTester
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Card: ");
		String cardName = in.next();
		Card steveBallmer = new Card(cardName);
		System.out.println(steveBallmer.getDescription());

		/*****Arbitray Value Tests********
		Card mattBischoff = new Card("4D");
		System.out.println(mattBischoff.getDescription());//4 of Diamonds
		Card kevinDietzler = new Card("AS");
		System.out.println(kevinDietzler.getDescription());//Ace of Spades
		*/
		
	}//end main
}//end class
