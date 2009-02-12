public class TriangleTester
{
   public static void main(String[] args)
   {
      Triangle t = new Triangle(9001);
      int area = t.getArea();
      System.out.println("Area: " + area);
      System.out.println("Expected: 55");
		System.out.println("\n"+ t.printTriangle());
		
   }
}
