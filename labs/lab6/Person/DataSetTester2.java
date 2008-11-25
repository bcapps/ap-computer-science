import java.awt.Rectangle;

/**
   This program demonstrates the use of a Measurer.
*/
public class DataSetTester2
{
   public static void main(String[] args)
   {
      Measurer m = new PersonMeasurer();

      DataSet data = new DataSet(m);

      data.add(new Person("Matt Bischoff", 5.5));
      data.add(new Person("Steve Ballmer", 8));
      data.add(new Person("Ron Paul", 3.0));

      System.out.println("Average height: " + data.getAverage()+" ft.");
	  System.out.println("Expected: 5.5 ft.");
	  

      Person max = (Person) data.getMaximum();
      System.out.println("The tallest person is " +max.getName()+" at "+ 
							max.getHeight()+" ft. tall.");
   }
}
