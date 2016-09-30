import java.util.Scanner;

public class rectangle
{
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//take input and initialize variables
		System.out.println("What is the length in inches.");
		double l = kb.nextDouble();
		
		System.out.println("What is the width in inches.");
		double w = kb.nextDouble();
		
		//call methods
		//new variable for perimeter
		double perimeter = calcPerim(w,l);
		Print(perimeter);
	}
	
	public static double calcPerim(double w, double l)
	{
		//do math and give back calculation
		return (l*2)+(w*2);
		
	}
	
	public static void Print(double perimeter)
	{
		//print line with the calculated value
		System.out.printf("The perimeter of your rectangle is %10.5f", perimeter);
		
	}
}