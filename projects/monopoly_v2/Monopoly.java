/***************************
 * Brian Capps
 * 10|29|2008
 * Monopoly.
 ****************************/
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Monopoly
{
	public static ArrayList<Player> players;
	public static ArrayList<Property> properties;
	public static Die die;
	public static Token tokens;
	public static MonopVars vars;
	public static Scanner in;
	
	public static void main (String [] args)
	{
		boolean exit = false;
		int whoseTurn = 0;
		int status = 3;//for improperly entered nums
		
		try//I kept getting compile-time errors even though initializeData
			//throws the exceptions.  I have no idea why.  This is a dirty fix.
		{initializeData();}
		catch(Exception e){}
		
		System.out.println(welcome());
		receivePlayers();
		
		while (!exit)
		{
			while(status !=1 && status !=2)
			{
				System.out.print("\n"+players.get(whoseTurn).getName()+", Enter 1 to roll or 2 to exit: ");
				status = in.nextInt();
			}//end while status
			
			if (status ==1)
			{
				playTurn(players.get(whoseTurn));
				whoseTurn+=1;
				if(whoseTurn >= players.size())
					whoseTurn = 0;
			}
			else if (status == 2)
			{
				System.out.println("\nGoodbye!");
				System.out.println("You left Monopoly on space "+players.get(whoseTurn).getSpace()+
									" with $"+players.get(whoseTurn).getMoney()+".");
				System.out.println("Thanks for playing, bud.");
				exit = true;
			}
			
			status = 3;//resets status to unkown
		}//end while exit
	}//end main
	public static void playTurn(Player p)
	{
		int r1 = die.nextRoll();
		int r2 = die.nextRoll();
		int rolled = (r1+r2);
		
		if(!p.isInJail())
		{
			if(r1==r2)
			{
				p.addDoubles();
				System.out.println("\nYou rolled DOUBLES of "+r1+" for a total of "+rolled);
				if (p.getDoubles() == 3)
				{
					System.out.println("You rolled DOUBLES 3 times in a row.  This makes you a bad person.");
					System.out.println("Go to JAIL.  Go Directly to JAIL. \nDO NOT PASS GO.  "+
									"DO NOT COLLECT $200.  DO NOT SAY GOODBYE TO YOUR FAMILY.");
					p.resetDoubles();
					p.setSpace(10);
					p.setInJail(true);
				}
			}
			else
			{
				System.out.println("\nYou rolled a "+r1+" and a "+r2+", for a total of "+rolled);
				p.resetDoubles();
			}//end if and else
			p.movePiece(rolled);
		}//end if not in jail
		else
		{
			if(p.getOutOfJailAttempts()<3)//if less than 3 attempted
			{
				if(r1==r2)
				{
					System.out.println("You rolled Doubles to get out of jail!  \nToo bad"+
										" no company will hire an ex-con and you'll never get"+
										" a good job or have any kind of rewarding future.  Have a nice day!");
					
					p.resetDoubles();
					p.resetOutOfJailAttempts();
					p.setInJail(false);
				}
				else
				{
					System.out.println("\nYou rolled a "+r1+" and a "+r2+", so you get to stay here longer.");
					p.addOutOfJailAttempt();
				}
			}//end if <3
			if(p.getOutOfJailAttempts()==3)
			{
				System.out.println("Fail.  You will now be fined $50 to leave jail next turn.");
				p.setMoney(-50);
				p.setInJail(false);
				p.resetOutOfJailAttempts();
			}
		}//end if in jail
		
		if (p.getSpace() >= 40)
		{
			p.setMoney(200);
			p.setSpace((p.getSpace() - 40));
			System.out.println("You received $200 for passing GO.");
		}
		else
			System.out.println("You did not pass GO.");
		
		if (p.getSpace()==30)
		{
			System.out.println("Go to JAIL.  Go Directly to JAIL. \nDO NOT PASS GO.  "+
								"DO NOT COLLECT $200.  DO NOT SAY GOODBYE TO YOUR FAMILY.");
			p.setSpace(10);
			p.setInJail(true);
		}
			
		System.out.println(p.getName()+" currently has $"+p.getMoney());	
		System.out.println(p.getName()+" is on space "+p.getSpace()+"\n");
		
	}//end play method
	public static void initializeData() throws IOException, BadDataException
	{
	      boolean fileFound = false;

	      //Initialize the objects
	      in = new Scanner (System.in);
	      players = new ArrayList<Player>();
	      properties = new ArrayList<Property>();
	      tokens = new Token();
	      vars = new MonopVars();
	      MonopolyDataReader reader = new MonopolyDataReader();

	      do
	      {
	         //try to obtain a valid file
	         try
	         {
	            reader.readMonopolyFile (chooseFile(), vars, tokens, properties);
	            fileFound = true;
	         }//end try
	         catch (FileNotFoundException e)
	         {
	            System.out.println ("\n\nFile not found.  Please try again.");
	         }//end catch
	      }//end do
	      while (!fileFound);

	      die = new Die (vars.getNumDiceSides());

	 }// end of initializeData method


	   /*
	     * This method uses a JFileChooser to locate the data file
	     * to be used in this version of Monopoly.
	     * 
	     * @return the name of the file to be used for this game
	     */

	   public static String chooseFile ()
	   {
	      String filename = new String();
	      boolean fileChosen = false;

	      //This window is the parent for the JFileChooser
	      JWindow window = new JWindow();

	      //YOU CAN CHANGE THE INITIAL PATH FOR THE JFileChooser TO LOOK IN!
	      //Perhaps the Desktop?
	      JFileChooser chooser = new JFileChooser ("/Users/home/Documents/java/ap-computer-science/projects/"+
													"monopoly_v2/MonopolyData.txt");

	      do
	      {
	         try
	         {
	            //Opens the JFileChooser
	            chooser.showOpenDialog(window);

	            //Returns the name of the file that was chosen.
	            filename = chooser.getName (chooser.getSelectedFile());
	            fileChosen = true;
	         }//end try
	         catch (NullPointerException e)
	         {
	            System.out.println ("Please choose a file before continuing.");
	         }//end catch
	      }
	      while (!fileChosen);

	      return filename;
	   }// end of chooseFile method
	
	public static void receivePlayers()
	{
			int numPlayers = 0;
			while(numPlayers<2)
			{
				System.out.println("\nPlease enter the number of players (2-6):");
				try
				{
					int num = Integer.parseInt(in.next());
					if(num<1 || num>6)
					{
						System.out.println("Incorrect Value, Please Retry.");
					}
					else
						numPlayers = num;

				}
				catch(Exception e)
				{
					System.out.println("Incorrect Value, Please Retry.");
				}
			}//end while	

			for(int i =0; i<numPlayers; i++)
			{
				System.out.print("\n\nPlease enter your name: ");
				players.add(new Player(in.next()));
				System.out.println("Welcome, "+players.get(i).getName()+"!");
			}
	}//end receiveplayers
	public static String getSuffix (int number)
	{
	      if ((number % 10) == 1 && ((number / 10) % 10) != 1)
	         return new String ("st");
	      else if ((number % 10) == 2 && ((number / 10) % 10) != 2)
	         return new String ("nd");
	      else if ((number % 10) == 3 && ((number / 10) % 10) != 3)
	         return new String ("rd");
	      else
	         return new String ("th");

	}//end getSuffix method
	public static String welcome()
	{
		return "                                                                                        \n"+        
"	                                        *-:|ossttt||||:-*              :otoooo-                     \n"+
"	                                      oo|hmmmmN-*****smmdh|           .sts-:tt.                     \n"+
"	                                      m: ommmmN|    *dmmmmo           *sto|*                        \n"+
"	                                      st tmmmmmt    -NmmmN:            .tooo:                       \n"+
"	                                      -h |Nmmmms.***tNmmmN.             *-ooot.                     \n"+
"	                                      *m:|yyyyyo....|yyhhm.  *            *|ooo|*                   \n"+
"	                                  .--.*m-.mmmmmy    -NmddN. :y*             .tooo- *.               \n"+
"	               ...               :dmmdhmyohhdddo    .dddmNsss-               *:oooot||              \n"+
"	             .t:o|               -hmmmdt|toyyyysoooooyhysooo*                  .ost-.y||::::-**     \n"+
"	    *..:||||:o-.h*                *-td|...:--..-------::...tt                  tt-.tos:::||t::|     \n"+
"	  *.:|t|.....-..h|.*               .:tt-....ot......o|....-ts:.            *..:y...|soo|:.oo:-.     \n"+
"	 *.:|t|:.......-s:tys.            -t:.......::......|:......--y          .|ymh:s:..:toooto|*        \n"+
"	 *-::::---....:t*-dmmms-*         :|........--....|.--.......-t      *.|sdmmmmh-t|....|yooo-        \n"+
"	  *.----:|toott :mmmmmmmhs|.*      -|s.t:|||:-.-|t|.-|t|::|-o:***.-|shmmmmmmmmmd.|ttttt-|soot*      \n"+
"	            *|:-mmmmmmmmmmmmhyot|:to:h-t-              **||s|oyhdmmmmmmmmmmmmmmmdt.*     .tooo:*    \n"+
"	             *:dmmmmmmmmmmmmmmmmmmmmmmh-t|.****.t|*****-||smmmmmmmmmmmmmmmmmmmmmd-         -oooo.   \n"+
"	              *odmmmmmmmmmmmmmmmmmmmmmmmo-:||||sdh|:|:::tdmmmmmmmmmmmmmmmmmmmmh|*           *|otot* \n"+
"	                *|ymmmmmmmmmmmmmmmmmmmmmmdtt:..-::-.-|tommmmmmmmmmmmmmmmmmmyt.                .toot \n"+
"	                   *:ohmmmmmmmmmmmmmmmmmmN--dhysssyyyd smmmmmmmmmmmmmmhs|-*                     .-* \n"+
"	                        .:tsydmmmmmmmmmmmN|.hyysttsyyh ymmmmmmmdot|-.                               \n"+
"	                               *.-mmmmmmmN:*|.  |. *:t smmmmmmmh                                    \n"+
"	                                 .mmmmmmmm.     *      |Nmmmmmmd                                    \n"+
"	                                 |mmmmmmmy      :*     *dmmmmmmm.                                   \n"+
"	                                 hmmmmmmm.      -*      |mmmmmmmo                                   \n"+
"	                                ommmmmmd-       .*       ommmmmmm-                                  \n"+
"	                               ommmmmmmh|*      |*      -ommmmmmmm:                                 \n"+
"	                             *smmmmmmmmmmdo-  .|s:*  .thmmmmmmmmmmmo*                               \n"+
"	                            :hmmmmmmmmmmmmmmhhmmmmhtydmmmmmmmmmmmmmmd|*                             \n"+
"	                          .oyysdmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmyyhhho.                            \n"+
"	                           ***smmmmmmmmmmmmmmmmmdmmmmmmmmmmmmmmmmd:***                              \n"+
"	                            *smmmmmmmmmmmmmmmmd|.smmmmmmmmmmmmmmmmm-                                \n"+
"	                            ommmmmmmmmmmmmmmmy.   :dmmmmmmmmmmmmmmmd*                               \n"+
"	                           -mmmmmmmmmmmmmmmms*     .hmmmmmmmmmmmmmmmt                               \n"+
"	                           ymmmmmmmmmmmmmmms*       *ymmmmmmmmmmmmmmd                               \n"+
"	                          *mmmmmmmmmmmmmmmy*         *hmmmmmmmmmmmmmm-                              \n"+
"	                          .mmmmmmmmmmmmmmd.           .mmmmmmmmmmmmmm|                              \n"+
"	                          *mmmmmmmmmmmmmmt             ommmmmmmmmmmmmt                              \n"+
"	                           ydmmmmmmmmmmmm*             .mmmmmmmmmmmmd:                              \n"+
"	                           *-:tosssssotth               doosssoot|:-.                               \n"+
"	                    *-.**********..****-y               h*****.:--.*******..*                       \n"+
"	                     *-||ttoott|:. -tttt:               |ttt|-  .:||||:::-.";
	}//end snazzy welcome method
}//end class