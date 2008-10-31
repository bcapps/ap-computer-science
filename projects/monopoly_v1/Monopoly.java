/***************************
 * Brian Capps
 * 10|29|2008
 * Description
 ****************************/
import java.util.Scanner;

public class Monopoly
{
	private static Player brian;
	
	public static void main (String [] args)
	{
		Scanner in = new Scanner (System.in);
		
		System.out.println(welcome());
		System.out.print("\n\nPlease enter your name: ");
		brian = new Player(in.next());
		System.out.println("Welcome, "+brian.getName()+"!");
		
		int status = 3;
		boolean exit = false;
		
		while (!exit)
		{
			while(status !=1 && status !=2)
			{
				System.out.print("\nEnter 1 to roll or 2 to exit: ");
				status = in.nextInt();
			}//end while status
			
			if (status ==1)
				play();
			else if (status == 2)
			{
				System.out.println("\nGoodbye!");
				System.out.println("You left Monopoly on space "+brian.getSpace()+
									" with $"+brian.getMoney()+".");
				System.out.println("Thanks for playing, bud.");
				exit = true;
			}
			
			status = 3;//resets status to unkown
		}//end while exit
	}//end main
	public static void play()
	{
		Die d1 = new Die(6);
		Die d2 = new Die(6);
		int r1 = d1.nextRoll();
		int r2 = d2.nextRoll();
		int rolled = (r1+r2);
		
		System.out.println("\nYou rolled a "+r1+" and a "+r2+", for a total of "+rolled);
		
		brian.movePiece(rolled);
		if (brian.getSpace() >= 40)
		{
			brian.setMoney(200);
			brian.setSpace((brian.getSpace() - 40));
			System.out.println("You received $200 for passing GO.");
		}
		else
			System.out.println("You did not pass GO.");
			
		System.out.println("You currently have $"+brian.getMoney());	
		System.out.println("You are on space "+brian.getSpace());
		
	}//end play method
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