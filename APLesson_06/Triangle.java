import java.util.Scanner;
public class Triangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your word.");
		String word = kb.nextLine();
		int y = word.length();
		
		for(int x = y; x >= 0; x--)
		{
			System.out.println(word.substring(0, x));
		}
	}
}