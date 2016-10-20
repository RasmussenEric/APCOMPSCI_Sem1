import java.util.Scanner;
public class Box
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your word.");
		String word = kb.nextLine();
		System.out.println("\n");
		for(int i = 1; i <= word.length(); i++)
		{
			System.out.println(word);
		}
	}
}