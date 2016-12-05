import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class KeepComposites
{
	public static void main(String[]args)
	{
		Integer [] numbers = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		removePrimes(numbers);	
		
	}
	public static int gFactor(int n)
	{
		for(int x = 2; x < n; x++)
		{
			if((n % x) == 0)
			{
				return 1;
			}
			
		}
		return 0;
	}
	public static void removePrimes(Integer [] numbers)
	{
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		
		for(int i = 0; i < nums.size(); i++)
		{
			
			if(gFactor(nums.get(i)) == 0)
			{
				nums.remove(nums.get(i));
			
			}
			
		}
		
		System.out.println(nums);
	}
}