/***************************
 * Brian Capps
 * 10/08/2008
 * Gen some Fib Nums?!
 ****************************/
public class FibonacciGenerator
{
     private int fold1, fold2, num, fNew;

     public FibonacciGenerator (int n)
     {
          num = n;
          fold1 = 1;
          fold2 = 0;
     }

     public int nextNumber()
     {

          fNew = fold1 + fold2;
          fold1 = fold2;
          fold2 = fNew;
          num--;

          return fNew;
     }

     public int getCurrent ()

     {
          return num;
     }
}
