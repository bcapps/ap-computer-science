public class DiscMover
{
   //Attributes to be declared:
     //state (int)
	private int state;
     //tower to (int)
	private int towerTo;
     //tower from (int)
	private int towerFrom;
     //num discs (int)
	private int numDiscs;
     //smaller mover (DiscMover)
   	private DiscMover smallerMover;
     //4 states (final static): BEFORE_LARGEST, LARGEST, AFTER_LARGEST, DONE
	public static final int BEFORE_LARGEST = 0;
	public static final int LARGEST = 1;
	public static final int AFTER_LARGEST = 2; 
	public static final int DONE = 3;
   
   public DiscMover (int f, int t, int num)
   {
      //initialize attributes
		towerTo = t;
		towerFrom = f;
		numDiscs = num;
      //set your state attribute
		state = BEFORE_LARGEST;
      //figure out the index of the 'other' tower (int) (other = 3 - to - from)
      int other = 3 - t - f;
		if(numDiscs>1)
      		smallerMover = new DiscMover (f, other, num - 1);
      //initialize the smallerMove object using from, other & num discs - 1
   }
   
   
   public boolean hasMoreMoves()
   {
      //return true or false if the state is equal to DONE
		return (state != DONE);
   }
   
   
   public DiscMove nextMove()
   {
		//BASE CASE: Smallest Disc
		if(numDiscs ==1)
		{
			state = DONE;
			return new DiscMove(towerFrom, towerTo);
		}
		//SMALLER CASE: for n discs moving from I to III, move -1 discs from I to II
	
	
      //BASE CASE: if the number of discs is one
        //Set the state to DONE
        //return a new DiscMove (from, to)
        
      //Next: if the state is LARGEST
		if(state == LARGEST)
		{
			state = AFTER_LARGEST;
			int other = 3 - towerTo - towerFrom;
			smallerMover = new DiscMover (other, towerTo, numDiscs - 1);
			return new DiscMove(towerFrom, towerTo);
		}
        //Set the state to AFTER_LARGEST
        //figure out the index of the 'other' tower (int) (other = 3 - to - from)
        //initialize the smallerMove object using from, other & num discs - 1
        //return a new DiscMove (from, to)
      
      //initialize a DiscMove and set it equal to smallerMove.nextMove()
		DiscMove move = smallerMover.nextMove();
		
		if(!smallerMover.hasMoreMoves())
		{
			if(state==BEFORE_LARGEST)
				state = LARGEST;
			else
				state = DONE;
		}
		
      	return move;
   }//end nextMove method
   
}//end DiscMover class   