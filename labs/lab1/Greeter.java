/************************
  * Brian Capps
  * 9/18/08
  * OH HAI!?!
  **********************/
public class Greeter
{
  private String name;
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
    return "Oh hai, "+name+".";
  }
  public String sayGoodbye()
  {
    return "Don't let the door hit you on the way out, "+name+"-jerk.";
  }
  public String refuseHelp()
  {
    return "I would do that, but it could potentially destroy the world. I have an "+
      "obligation to all humanity to not help you, "+name+".";
  }
}