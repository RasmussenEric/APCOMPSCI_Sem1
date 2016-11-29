import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class KeepComposites
{
	public static void main(String[]args)
	{
		Integer [] numbers = {2, 6, 8, 9, 10, 12, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		removeComposites();
		
		System.out.println(nums);
	}
	public static int gFactor(int n)
	{
		for(int x = 2; x < n; x++)
		{
			if((n % x) = 0)
			{
				return 1;
			}
		}
		return 0;
	}
	public static void removeComposites()
	{
		for(int i = 0; i < ArrayList.size(nums); i++)
		{
			if(gFactor(i) = 0)
			{
				ArrayList.remove(i);
			}
		}
	}
}