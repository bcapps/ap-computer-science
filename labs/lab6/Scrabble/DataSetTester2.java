import java.awt.Rectangle;

/**
   This program demonstrates the use of a Measurer.
*/
public class DataSetTester2
{
   public static void main(String[] args)
   {
      Measurer m = new ScrabbleMeasurer();

      DataSet data = new DataSet(m);

      data.add(new String("aei"));
      data.add(new String("qZ"));
      data.add(new String("jx"));

      System.out.println("Average: " + data.getAverage());
      System.out.println("Expected: 13");

      String max = (String) data.getMaximum();
      System.out.println("Maximum : " + max);
      System.out.println("Expected: qZ");
   }
}
