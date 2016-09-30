import java.util.Scanner;
public class average
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the first value:");
		double num1 = kb.nextDouble();
		
		System.out.println("Enter the second value:");
		double num2 = kb.nextDouble();
		
		System.out.println("Enter the third value:");
		double num3 = kb.nextDouble();
		
		double avg = average(num1, num2, num3);
		print(num1, num2, num3, avg);
		
	}
	
	public static double average(double num1, double num2, double num3)
	{
		return(num1+num2+num3)/3;
		
	}
	
	public static void print(double num1, double num2, double num3, double avg)
	{
		System.out.printf("The average of " + num1 +", " + num2 + ", and " + num3 + " is %10.5f", avg);
		
	}
}