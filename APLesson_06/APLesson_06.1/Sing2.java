import java.util.Scanner;
public class Sing2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first word to repeat:");
		String word1 = kb.nextLine();
		System.out.println("How many times should it repeat:");
		double repeat1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter the second word to repeat:");
		String word2 = kb.nextLine();
		System.out.println("How many times should it repeat:");
		double repeat2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter the third word to repeat:");
		String word3 = kb.nextLine();
		System.out.println("How many times should it repeat:");
		double repeat3 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter the last word to repeat:");
		String word4 = kb.nextLine();
		System.out.println("How many times should it repeat:");
		double repeat4 = kb.nextDouble();
		kb.nextLine();
		
		sing(word1, repeat1);
		sing(word2, repeat2);
		sing(word3, repeat3);
		sing(word4, repeat4);
		
	}
	public static void sing(String word, double repeat)
	{
		double x = 1;
		for(x=1; x <= repeat; x++)
		{
			System.out.println(word);
			
		}
		
		
		
	}
}