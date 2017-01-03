import java.util.Scanner;
public class Divisor
{
	public static void main(String[]args)
	{
		
		Integer[][] nums = new Integer[4][4];
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				
				nums[i][j] = (((int)(Math.random() * 99)) + 1);
				System.out.print(nums[i][j] + "\t");
			}
			
			System.out.println();
		}
	
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int divisor = kb.nextInt();
		int count = 0;
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				if(nums[i][j] % divisor == 0)
				{
					count++;
				}
			}
		}
		
		System.out.println("There are " + count + " numbers divisible by " + divisor + " in the array");
	}
}