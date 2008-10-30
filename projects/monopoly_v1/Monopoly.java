/***************************
 * Brian Capps
 * 10|29|2008
 * Description
 ****************************/
import java.util.Scanner;

public class Monopoly
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner (System.in);

		Die d1 = new Die(6);
		Die d2 = new Die(6);
		
		System.out.println(welcome());
		System.out.print("\n\nPlease enter your name: ");
		
		Player brian = new Player(in.next());
		System.out.print("Enter 1 to roll or 2 to exit: ");
		//try{
			
		//}
		
		
	}//end main
	public static String welcome()
	{
		return "                                                                    *---.*              \n"+        
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
	}
}//end class