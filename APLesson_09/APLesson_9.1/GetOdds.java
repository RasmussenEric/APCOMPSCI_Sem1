public class GetOdds
{
	public static void main(String[]args)
	{
		
		int[] nums = new int[10];
		
		fillArray(nums);
		printArray(nums);
		
		System.out.println(Odds(nums));
		
	}
	public static void fillArray(int[] nums)
	{
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = (int)(Math.random() * 100) + 1;
			
		}
	}
	public static void printArray(int[] nums)
	{
		System.out.println("For the following numbers...");
		for(int num : nums)
		{
			System.out.print(num + "\n");
		}
	}
	public static String Odds(int[] nums)
	{
		System.out.println("These numbers are odd:");
		String odds = "";
		
		for(int num : nums)
		{
			if(num % 2 == 1)
			{
				odds = (odds + "\n" + num);
			}
			
		}
		
		return odds;
	}
	
}