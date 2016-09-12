import java.util.Scanner;

public class Quiz_01SG
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int num = 45;
		System.out.println("IronMan has " + num + " kinds of weapons in his suit.");
		
		String pres = "Abraham Lincoln";
		String quote = "\"Whatever you are, be a good one.\"";
		System.out.println(pres + " once said, " + quote);
		
		int h = 45;
		int w = 64;
		
		int a = h*w;
		System.out.println("The area of your rectangle is..." + a);
		
		System.out.println("How many pieces of pizza do you want?");
		int slices = keyboard.nextInt();
		System.out.println(slices + " slices, coming right up!");
		
		System.out.println("What is your name?");
		String name = keyboard.next();
		System.out.println("Is there a Mr. or Mrs. " + name + "?");
		
		System.out.println("How many siblings do you have? ");
		int answer1 = keyboard.nextInt();
		
		System.out.println("What are their names? ");
		String answer2 = keyboard.nextLine();
		keyboard.nextLine();
		
		System.out.println("OK, which one is your favorite?");
		String answer3 = keyboard.nextLine();
		System.out.println("Awe! " + answer3 + " is your favorite.");
		
		System.out.println("R. Kelly said \"I believe I can fly!\"");
		
		System.out.println("This one goes on top. \nThis one goes on bottom.");
		System.out.println("a	b	c \nd	e	f \ng	h	i");
		
		System.out.println("Please enter your Math grade: ");
		double math = keyboard.nextDouble();
		System.out.println("Please enter your Science grade: ");
		double science = keyboard.nextDouble();
		System.out.println("Please enter your English grade: ");
		double english = keyboard.nextDouble();
		System.out.println("Please enter your History grade: ");
		double history = keyboard.nextDouble();
		System.out.println("Please enter your COMPSCI grade: ");
		double compsci = keyboard.nextDouble();

		double gpa = (math + science + english + history + compsci)/500;
		System.out.println(gpa);

		
		
		
	}
	
}