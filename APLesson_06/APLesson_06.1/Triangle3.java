import java.util.Scanner;
public class Triangle3
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your word.");
		String word = kb.nextLine();
		int y = word.length();
		
		System.out.println(word.substring(0, y));
		
		for(int x = 7;x > -1; x--)
		{
			System.out.println(word.substring(x, y));
		}
	}
}