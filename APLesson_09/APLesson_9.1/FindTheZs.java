import java.util.Scanner;
public class FindTheZs
{
	public static void main(String[] args)
	{
		String[] words = new String[5];
		
		fillArray(words);
		printArray(words);
		
		System.out.println("\nOnly the words" + hasZs(words) + "\ncontain the letter z");
		
	}
	public static void fillArray(String[] words)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the words:");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.nextLine();
		}
		
	}
	public static void printArray(String[] words)
	{
		System.out.println("For the words:");
		for(String word : words)
		{
			System.out.println(word);
		}
	}
	public static String hasZs(String[] words)
	{
		String Zs = "";
		for(String word : words)
		{
			if(word.indexOf("z") >= 0)
			{
				Zs = Zs + "\n" + word;
			}
		
		}
		return Zs;
	}
	
}