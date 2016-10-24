import java.util.Scanner;
public class Triangle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your word.");
		String word = kb.nextLine();
		int y = word.length();
		
		System.out.println(word.substring(0, y));
		
		for(int x = 0; x <= y; x++)
		{
			System.out.println(word.substring(x, y));
		}
	}
}