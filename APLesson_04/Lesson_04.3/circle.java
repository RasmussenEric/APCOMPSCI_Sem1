import java.util.Scanner;
public class circle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the radius of the circle?");
		double r = kb.nextDouble();
		
		double a = calcArea(r);
		print(r,a);
	}
	
	public static double calcArea(double r)
	{
		return(3.14*r*r);
	}
	
	public static void print(double r,double a)
	{
		System.out.printf("The area of a circle with a radius of " + r + " units is %10.5f", a);
	}
}