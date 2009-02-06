/***************************
 * Brian Capps 
 * 02/05/2009
 * IT'S A BANK!
 ****************************/
import java.util.*;

public class Bank
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);	
		ArrayList<BankAccount> accounts= new ArrayList<BankAccount>();

		System.out.println("Please Enter Info for 5 BankAccounts.");
		
		for(int i =0; i<5; i++)//asks for 5 BankAccounts
		{
			int accountNum=0;
			double balance=0;
			boolean error = true;
			System.out.println("\nAccount #"+(i+1));
							
			while(error)
			{
				System.out.print("Please Enter the AccountNumber: ");
				
				try 
				{
					accountNum = Integer.parseInt(in.next());
					error = false;
				}
				catch(Exception e)
				{
					System.out.println("INVALID INPUT, TRY AGAIN.\n");
					error = true;
				}
			}//end first while
			
			error = true;
			while(error)
			{
				System.out.print("Please Enter the Balance: ");
				try 
				{
					balance = Double.parseDouble(in.next());
					error = false;
				}
				catch(Exception e)
				{
					System.out.println("INVALID INPUT, TRY AGAIN.\n");
					error = true;
				}
			}//end second while
			accounts.add(new BankAccount(accountNum, balance));
		}//end input for loop
		
		double maxBalance = 0;
		int indexOfHighest = 0;
		for(int i =0; i<accounts.size(); i++)
			if(accounts.get(i).getBalance() >= maxBalance)
				indexOfHighest = i;
		
		System.out.println("\nThe largest BankAccount has Account Number "+
							accounts.get(indexOfHighest).getAccountNumber()+" and Balance "+
							accounts.get(indexOfHighest).getBalance()+".");
		
	}//end main
}//end class
