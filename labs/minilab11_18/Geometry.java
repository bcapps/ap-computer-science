/***************************
 * Brian Capps
 * 11/19/2008
 * Geo methods
 ****************************/
public class Geometry
{
	public static double sphereVolume(double r)
	{
		return (4/3)*Math.PI*(Math.pow(r, 3));
	}
	public static double sphereSurface(double r)
	{
		return 4*Math.PI*(Math.pow(r, 2));
	}
	public static double cylinderVolume(double r, double h)
	{
		return Math.PI*(Math.pow(r, 2))*h;
	}
	public static double cylinderSurface(double r, double h)
	{
		return 2*(Math.PI*(Math.pow(r, 2))) + 2*(Math.PI*r)*h;
	}
	public static double coneVolume(double r, double h)
	{
		return (1/3)*Math.PI*(Math.pow(r, 2))*h;
	}
	public static double coneSurface(double r, double h)
	{
		return Math.PI*r*(Math.pow((r*r+h*h), .5));
	}
}//end class
