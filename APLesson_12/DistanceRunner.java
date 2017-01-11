import java.util.Scanner;
public class DistanceRunner
{
	
	static int x1;
	static int x2;
	static int y1;
	static int y2;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the 1st x coordinate:");
		x1 = kb.nextInt();
		
		System.out.println("Enter the 2nd x coordinate:");
		x2 = kb.nextInt();
		
		System.out.println("Enter the 1st y coordinate:");
		y1 = kb.nextInt();
		
		System.out.println("Enter the 2nd y coordinate:");
		y2 = kb.nextInt();
		
		
		Distance object = new Distance(x1, x2, y1, y2);
		
		System.out.println("Distance = " + object.getDist());
		
		object.setValues(x1, x2, y1, y2);
		
		System.out.println("Distance = " + object.getDist());
		
		
	}
	
	
}