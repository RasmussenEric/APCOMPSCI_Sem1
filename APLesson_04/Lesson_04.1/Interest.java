import java.util.Scanner;

public class Interest
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Interest calculate = new Interest();
		
		System.out.println("What is your interest rate?");
		double r = keyboard.nextDouble();
		
		System.out.println("How much did you borrow?");
		double P = keyboard.nextDouble();
		
		System.out.println("How many times is the loan compounded each year?");
		double n = keyboard.nextDouble();
		
		System.out.println("How many years has this loan lasted?");
		double t = keyboard.nextDouble();
		
		double payment = calculate.Math(r, P, n, t);
		
		System.out.printf("Your total monthly payment is %.2f\n", payment);
		
	}
	
	public double Math(double r, double P, double n, double t)
	{
		double x = (1 + (r/n));
		double e = n * t;
		double i = Math.pow(x, e);
		double y = P * i;
		return y / 12;
	}
}

