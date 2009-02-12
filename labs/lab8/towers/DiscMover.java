public class DiscMover
{
   //Attributes to be declared:
     //state (int)
	private int state;
     //tower to (int)
	private int towerTo;
     //tower from (int)
	private int towerFrom
     //num discs (int)
	private int numDiscs;
     //smaller mover (DiscMover)
   
     //4 states (final static): BEFORE_LARGEST, LARGEST, AFTER_LARGEST, DONE
	public static final int BEFORE_LARGEST = 0;
	public static final int LARGEST = 1;
	public static final int AFTER_LARGEST = 2; 
	public static final int DONE = 3;
   
   public DiscMover (int f, int t, int num)
   {
      //initialize attributes
      //set your state attribute
		state = BEFORE_LARGEST;
      //figure out the index of the 'other' tower (int) (other = 3 - to - from)
      int other = 3 - t - f;
      smallerMove = new DiscMover (t, other, num - 1);
      //initialize the smallerMove object using from, other & num discs - 1
   }
   
   
   public boolean hasMoreMoves()
   {
      //return true or false if the state is equal to DONE
   }
   
   
   public DiscMove nextMove()
   {
		//BASE CASE: Smallest Disc
		//SMALLER CASE: for n discs moving from I to III, move -1 discs from I to II
	
	
      //BASE CASE: if the number of discs is one
        //Set the state to DONE
        //return a new DiscMove (from, to)
        
      //Next: if the state is LARGEST
        //Set the state to AFTER_LARGEST
        //figure out the index of the 'other' tower (int) (other = 3 - to - from)
        //initialize the smallerMove object using from, other & num discs - 1
        //return a new DiscMove (from, to)
      
      //initialize a DiscMove and set it equal to smallerMove.nextMove()
		while (smallermov.hasNextMove()){}
      
      //Finally: If  the 'smallerMove' DiscMover does NOT have more moves
        //if the state is BEFORE_LARGEST
          //set the state to LARGEST
        //else
          //set the state to DONE
        //return the DiscMove you initialized on line 41
      
   }//end nextMove method
   
}//end DiscMover class   