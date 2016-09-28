import java.util.Scanner;
public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length.");
		l = kb.nextDouble();
		
		System.out.println("Please enter the width.");
		w = kb.nextDouble();
		
		calcPerim();
		print();

	}
	
	public static void calcPerim()
	{
		perimeter = (l + w)*2;
	}
	
	public static void print()
	{
		System.out.printf("The perimeter of your rectangle is %10.5f", perimeter);
		
	}
}