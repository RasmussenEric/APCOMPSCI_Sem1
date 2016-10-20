import java.util.Scanner;
public class Factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your number.");
		double num = kb.nextDouble();
		System.out.println("\n");
		double x = 1;
		double factorial = 1
		for(x = 1; x<num; x++)
		{
			System.out.println(factorial*x);
		}
	}
}