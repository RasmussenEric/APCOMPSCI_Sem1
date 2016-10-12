import java.util.Scanner;
public class BMI2
{
	static double w;
	static double h;
	static double bmi;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What do you weigh in pounds?");
		w = kb.nextDouble();
		
		System.out.println("What is your height in inches?");
		h = kb.nextDouble();
		
		calcBMI();
		
		System.out.println("Your bmi is " + bmi);
		System.out.println("You are considered to be " + condition);
	}
	public static void calcBMI()
	{
		double kg = w / 2.204;
		double cm = h * 2.54;
		double m = cm / 100;
		bmi = kg/(m*m);
		
		if(bmi>39.9)
			condition = "Morbidly Obese.";
		else if(bmi>35)
			condition = "Very Obese.";
		else if(bmi>29.9)
			condition = "Obese.";
		else if(bmi>25)
			condition = "Overweight.";
		else if(bmi>18.5)
			condition = "Normal.";
		else
			condition = "Underweight.";
	}
}