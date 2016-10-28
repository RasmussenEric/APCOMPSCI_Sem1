import java.util.Scanner;

public class Card
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		Card form = new Card();
		
		System.out.println("Enter your first name:");
		String left2 = kb.nextLine();
		
		System.out.println("Enter your last name:");
		String right2 = kb.nextLine();
		
		System.out.println("Enter your title:");
		String left3 = kb.nextLine();
		
		System.out.println("Enter the school name:");
		String left1 = kb.nextLine();
		
		System.out.println("Enter the school year:");
		String right1 = kb.nextLine();
		
		System.out.println("Enter your subject:");
		String right3 = kb.nextLine();
		
		String line1 = left1 + "           " + right1;
		String line2 = left2 + "         " + right2;
		String line3 = left3 + "  " + right3;
		
		System.out.println("\n***********************************");
		form.format("*  " + line1);
		form.format("\n*       " + line2);
		form.format("\n*       " + line3);
		System.out.println("\n***********************************");
	}
	public void format(String line)
	{
		System.out.printf("%35s", line + " *");
	}
}

