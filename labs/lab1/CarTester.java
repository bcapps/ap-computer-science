/************************
  * Brian Capps
  * 9/18/08
  * TEST CAR OBJECT F"@$* YA!?!
  **********************/
public class CarTester
{
  public static void main (String args[])
  {
    Car mattBischoff = new Car(50);
    mattBischoff.addGas(20);
    mattBischoff.drive(50);//should use up 1 gallon of gas
    System.out.println(mattBischoff.getGasInTank());
  }
}