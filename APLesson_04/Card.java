import java.util.Scanner;

public class Card
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Card form = new Card();
		
		System.out.println("Enter your first name:");
		String name1 = kb.nextLine();
		
		System.out.println("Enter your last name:");
		String name2 = kb.nextLine();
		
		System.out.println("Enter your title:");
		String title = kb.nextLine();
		
		System.out.println("Enter the school name:");
		String school = kb.nextLine();
		
		System.out.println("Enter the school year:");
		String year = kb.nextLine();
		
		System.out.println("Enter your subject:");
		String subject = kb.nextLine();
		
		System.out.println("\n***********************************");
		form.format(school, year);
		form.format(name1, name2);
		form.format(title, subject);
		System.out.println("***********************************");
	}
	public void format(String one, String two)
	{
		System.out.printf("* %13s\t %16s *\n", one, two);
	}
}

