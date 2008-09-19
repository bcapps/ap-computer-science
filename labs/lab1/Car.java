/************************
  * Brian Capps
  * 9/18/08
  * CAR OBJECT F"@$* YA!?!
  **********************/ 
public class Car
{
  private int mpg;//miles per gallon
  private int gas;//gallons of fuel in tank
  
  public Car(int e)
  {
    mpg = e;
    gas = 0;
  }
  public void addGas(int g)
  {
    gas += g;
  }
  public void drive(double miles)
  {
    gas -= miles/mpg;
    
    if(gas<0)
      gas=0;
  }
  public int getGasInTank()
  {
    return gas;
  }
}