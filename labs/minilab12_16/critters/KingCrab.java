/***************************
 * Brian Capps
 * 12/16/2008
 * Description
 ****************************/

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

/**
 * A <code>CrabCritter</code> looks at a limited set of neighbors when it eats and moves.
 * <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class KingCrab extends CrabCritter
{
	
	public void processActors(ArrayList<Actor> actors)
    {
		Location loc = getLocation();
		int[] dirs =
            { Location.AHEAD, Location.HALF_LEFT, Location.HALF_RIGHT, 
					Location.RIGHT, Location.RIGHT+Location.HALF_RIGHT,
	 				Location.LEFT, Location.LEFT+Location.HALF_LEFT,
	 				Location.RIGHT+Location.RIGHT};
        for(Actor a: actors)
		{
			for(int i = dirs.length; i>=0; i--)
				if(a.getLocation().equals(loc.getAdjacentLocation(i)))
				{
					a.setDirection(a.getDirectionTowards(getLocation())+180);
					a.act();
				}
		}
    }//end processActors
}//end class
