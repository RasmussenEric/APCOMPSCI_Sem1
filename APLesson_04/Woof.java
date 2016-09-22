import java.util.Scanner;

public class Woof
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Woof calc = new Woof();
		
		System.out.println("What is the height (in inches)?");
		double h = keyboard.nextDouble();
		
		System.out.println("What is the width?");
		double w = keyboard.nextDouble();
		
		System.out.println("What is the length?");
		double l = keyboard.nextDouble();
		
		double answer = calc.calcVol(h, w, l);
		System.out.printf("The conversion comes out to %5.2f cubic feet.", answer);
	}
	
	public double calcVol(double h, double w, double l)
	{
		double ci = h * w * l;
		double cf = ci / 1728;
		return cf;
	}
}