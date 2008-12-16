/***************************
 * Brian Capps
 * 12/16/2008
 * Description
 ****************************/

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import java.awt.Color;


/**
 * A <code>ChameleonCritter</code> takes on the color of neighboring actors as
 * it moves through the grid. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ChameleonKid extends ChameleonCritter
{
	private static final double DARKENING_FACTOR = 0.05;
    /**
     * Randomly selects a neighbor and changes this critter's color to be the
     * same as that neighbor's. If there are no neighbors, no action is taken.
     */
    public void processActors(ArrayList<Actor> actors)
    {
        int n = actors.size();
        if (n == 0)
        {
			Color c = getColor();
	        int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
	        int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
	        int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

	        setColor(new Color(red, green, blue));
		}
        Location loc = getLocation();
    
        Location aheadLoc = loc.getAdjacentLocation(Location.AHEAD);
		Location behindLoc = loc.getAdjacentLocation(Location.RIGHT + Location.RIGHT);
		for(Actor a: actors)
		{
			if(a.getLocation().equals(aheadLoc) || 
						a.getLocation().equals(behindLoc))	
			{
				setColor(a.getColor());
				return;
			}
		}
        //Actor other = actors.get(r);
        //setColor(other.getColor());
    }
}
