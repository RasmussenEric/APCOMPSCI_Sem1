import java.util.Scanner;
public class Table
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What size do you want your table to be?");
		System.out.println("2 by ______");
		double size = kb.nextDouble();
		System.out.println("What is the slope of your graph?");
		double slope = kb.nextDouble();
		double x = 1;
		System.out.println("___________");
		
		for(x=1; x<=size; x++)
		{
			double y = x * slope;
			System.out.printf("%.1f | %.1f \n", x, y);
		}
		
		
		
		
		
	}
}