import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting number:");
		int start = kb.nextInt();
		
		System.out.println("Please enter your sequence size:");
		int size = kb.nextInt();
		
		int[] seq = new int[size];
		
		for(int x = 0; x < seq.length; x++)
		{
			if(x <= 1)
			{
				seq[x] = start;
			}
			else
			{
				seq[x] = seq[x-1] + seq[x-2];
			}
			
			System.out.println(seq[x] + " ");
		}
		
		
	}
}