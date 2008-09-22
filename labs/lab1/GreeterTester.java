/************************
  * Brian Capps
  * 9/18/08
  * OH HAI!?!
  **********************/
public class GreeterTester
{
  public static void main(String args[])
  {
    Greeter mattBischoff = new Greeter("Steve Ballmer");
    System.out.println(mattBischoff.sayHello());
    System.out.println(mattBischoff.sayGoodbye());
    System.out.println(mattBischoff.refuseHelp());
  }
}