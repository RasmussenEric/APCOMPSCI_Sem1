import java.util.Scanner;
public class cube
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the side length.");
		double side = kb.nextDouble();
		
		double sa = calcSurf(side);
		print(sa, side);
	}
	
	public static double calcSurf(double side)
	{
		return side*side*6;
	}
	
	public static void print(double sa, double side)
	{
		System.out.printf("The surface area of a cube with sides " + side + " units long is %15.5f square units.", sa);
	}
}