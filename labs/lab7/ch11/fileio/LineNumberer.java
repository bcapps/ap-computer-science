import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LineNumberer
{
   public static void main(String[] args)
      throws FileNotFoundException
   {
      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();
      System.out.print("Output file: ");
      String outputFileName = console.next();

      FileReader reader = new FileReader(inputFileName);
      Scanner in = new Scanner(reader);
      PrintWriter out = new PrintWriter(outputFileName);
      int lineNumber = 1;
      
      while (in.hasNextLine())
      {
         String line = in.nextLine();
         out.println("/* " + lineNumber + " */ " + line);
         lineNumber++;
      }

      out.close();
   }
}
