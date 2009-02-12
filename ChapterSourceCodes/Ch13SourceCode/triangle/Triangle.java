/**
   A triangular shape composed of stacked unit squares like this:
   []
   [][]
   [][][]
   . . .
*/
public class Triangle
{
   /**
      Constructs a triangular shape.
      @param aWidth the width (and height) of the triangle
   */
   public Triangle(int aWidth)
   {
      width = aWidth;
   }

   /**
      Computes the area of the triangle.
      @return the area
   */
   public int getArea()
   {
      if (width <= 0) return 0;
      if (width == 1) return 1;
      Triangle smallerTriangle = new Triangle(width - 1);
      int smallerArea = smallerTriangle.getArea();
      return smallerArea + width;
   }
	public String printTriangle()
	{ 
		if (width ==1) return "[]";
		Triangle smallerTriangle = new Triangle(width - 1);
		String smallerPrint = smallerTriangle.printTriangle();
		String baseLine = "\n";
		for(int i =0; i<width; i++)
			baseLine+="[]";
		return smallerPrint+baseLine;
	}
   private int width;
}
