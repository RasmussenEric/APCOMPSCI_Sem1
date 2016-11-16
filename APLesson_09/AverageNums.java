public class AverageNums
{
	public static void main(String[]args)
	{
		
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = (int)(Math.random() * 100) + 1;
			
		}
		
		System.out.println("Numbers...");
		for(int num : nums)
		{
			System.out.print(num + "\n");
		}
		System.out.println("\n");
		System.out.println("The average of the above numbers is...");
		
		System.out.println(average(nums));
		
		
		
	}
	public static int average(int[] nums)
	{
		int sum = 0;
		for(int num : nums)
		{
			sum = num + sum;
		}
		
		return (sum / 10);
	}
	
}