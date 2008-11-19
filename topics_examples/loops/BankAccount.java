/***********************
  * Brian Capps
  * Date
  * Description
  **********************/

public class BankAccount
{
  //INSTANCE FIELDS (values/variables) and PUBLIC STATIC VARIABLES (constants)
  private double balance;//no specific value assigned yet
  
  //CONSTRUCTORS
  public BankAccount()
  {
    balance =0.0;
  }
  public BankAccount (double initBalance)
  {
    balance = initBalance;
  }
  
  //METHODS
  public double getBalance()
  {
    return balance;
  }
  public void deposit (double amount)
  {
    balance += amount;
  }
}