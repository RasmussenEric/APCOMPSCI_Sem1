import java.util.Scanner;

public class rectangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the length in inches.");
		double l = kb.nextDouble();
		
		System.out.println("What is the width in inches.");
		double w = kb.nextDouble();
		
		double perimeter = calcPerim(w,l);
		Print(perimeter);
	}
	
	public static double calcPerim(double w, double l)
	{
		return (l*2)+(w*2);
		
	}
	
	public static void Print(double perimeter)
	{
		System.out.printf("The perimeter of your rectangle is %10.5f", perimeter);
		
	}
}