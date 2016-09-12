import java.util.Scanner;

public class Calculator
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the length of a rectangular prism.");
		int l = keyboard.nextInt();
		
		System.out.println("Now enter the width.");
		int w = keyboard.nextInt();
		
		System.out.println("Now enter the height.");
		int h = keyboard.nextInt();
		
		double hw = (h*w);
		double v = (hw*l);
		System.out.println("The volume of your prism is " + v);
		
		
	}
}