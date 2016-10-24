import java.util.Scanner;
public class Count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your target number.");
		double target = kb.nextDouble();
		System.out.println("Enter the number to count by.");
		double count = kb.nextDouble();
		double x = 1;
		
		for(x = count; x<=target; x += count)
		{
			System.out.println(x);
		}
		
	}
}