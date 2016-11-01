import java.util.Scanner;
public class DigitAdder
{
	static int number;
	static int sum;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		number = kb.nextInt();
		
		sum = 0;
		
		sumDigits();
	
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
	public static void sumDigits()
	{
		int num = number;
		while(num > 0)
		{
			sum = (sum + (num % 10));
			num = (num / 10);
		}
		
	}
}