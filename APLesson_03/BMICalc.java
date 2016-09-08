import java.util.Scanner;

public class BMICalc
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What do you weigh in pounds?");
		
	
		int w = keyboard.nextInt();
		System.out.println("You said " + w + " pounds.");
		double kg = w / 2.204;
		System.out.println("What is your height in inches?");
		
	
		int h = keyboard.nextInt();
		System.out.println("You said " + h + " inches.");
		double cm = h * 2.54;
		double m = cm / 100;
		
		double h2 = m * m;
		double BMI = kg / h2;
		
		System.out.println("Your BMI is about " + BMI + ".");
 	}
	
}