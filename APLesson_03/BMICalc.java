import java.util.Scanner;

public class BMICalc
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What do you weigh in pounds?");
		
	
		double w = keyboard.nextDouble();
		System.out.println("You said " + w + " pounds.");
		double kg = w / 2.204;
		System.out.println("What is your height in inches?");
		
	
		double h = keyboard.nextDouble();
		System.out.println("You said " + h + " inches.");
		double cm = h * 2.54;
		double m = cm / 100;
		
		double BMI = kg/(m*m);
		
		System.out.println("Your BMI is about " + BMI + ".");
 	}
	
}