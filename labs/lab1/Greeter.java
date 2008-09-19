/************************
  * Brian Capps
  * 9/18/08
  * OH HAI!?!
  **********************/
public class Greeter
{
  private name;
  public Greeter()
  {
    name = "World";
  }
  public Greeter(String n)
  {
    name = n;
  }
  public String sayHello()
  {
    return "Oh hai, "+name;
  }
  public String sayGoodbye()
  {
    return "Don't let the door hit you on the way out, "+name+"-jerk.");
  }
    refuseHelp