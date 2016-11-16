import java.util.Scanner;
public class ReverseWord
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] names = new String[5];
		System.out.println("Enter the words:");
		
		for(int i = 0; i < names.length; i++)
		{
			names[i] = kb.nextLine();
		}
		
		System.out.println("In order...");
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
		System.out.println("\n");
		System.out.println("Reversed");
		
		reverse(names);
	}
	public static void reverse(String[] names)
	{
		for(int i = 4; i >= 0; i--)
		{
			System.out.println(names[i]);
		}
		
	}
}