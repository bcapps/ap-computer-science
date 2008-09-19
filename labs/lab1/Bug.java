/************************
  * Brian Capps
  * 9/18/08
  * BUGSSS?!!?
  **********************/ 
public class Bug
{
  private int position;
  private int direction; //1 is right, -1 is left
  
  public Bug()
  {
    position = 0;
    direction = 1;
  }
  public Bug(int pos)
  {
    position = pos;
    direction = 1;
  }
  public void turn()
  {
    direction *= -1;
  }
  public void move(int distance)
  {
    position += direction*distance;
  }
  public int getPosition()
  {
    return position;
  }
}