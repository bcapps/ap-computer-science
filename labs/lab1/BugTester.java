/************************
  * Brian Capps
  * 9/18/08
  * TEST BUGSSS?!!?
  **********************/ 
public class BugTester
{
  public static void main(String[] args)
  {
    Bug mattBischoff = new Bug();
    mattBischoff.move(10);
    mattBischoff.turn();
    mattBischoff.move(1);
	mattBischoff.turn();
	mattBischoff.move(2);
    System.out.println(mattBischoff.getPosition());//should be 11
  }
}