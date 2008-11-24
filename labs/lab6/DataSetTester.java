/**
   This program tests the DataSet class.
*/
public class DataSetTester
{
   public static void main(String[] args)
   {
      DataSet quizData = new DataSet();

      quizData.add(new Quiz(100));
      quizData.add(new Quiz(50));
      quizData.add(new Quiz(75));

      System.out.println("Average: " 
            + quizData.getAverage());
      System.out.println("Expected: 75");
      Measurable max = quizData.getMaximum();
      System.out.println("Highest Quiz: " 
         + max.getMeasure()+", "+((Quiz)max).getLetterGrade());
      System.out.println("Expected: 100.0, A");       
   }
}
