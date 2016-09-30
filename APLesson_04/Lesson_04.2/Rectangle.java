import java.util.Scanner;
public class Rectangle
{
	//declare variables
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		//instantiate new scanner
		Scanner kb = new Scanner(System.in);
		
		//take input and initialize variables
		System.out.println("Please enter the length.");
		l = kb.nextDouble();
		
		System.out.println("Please enter the width.");
		w = kb.nextDouble();
		
		//call methods
		calcPerim();
		print();

	}
	
	public static void calcPerim()
	{
		//do math
		perimeter = (l + w)*2;
	}
	
	public static void print()
	{
		//print perimeter value
		System.out.printf("The perimeter of your rectangle is %10.5f", perimeter);
		
	}
}