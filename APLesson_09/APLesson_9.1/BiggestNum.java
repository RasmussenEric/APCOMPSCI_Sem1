public class BiggestNum
{
	public static void main(String[]args)
	{
		int[] nums = new int[10];
		
		fillArray(nums);
		printArray(nums);
		
		System.out.println("The biggest number is " + getBiggest(nums));
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
	public static int getBiggest(int[] nums)
	{
		int max = 0;
		for(int num : nums)
		{
			if(num > max)
			{
				max = num;
			}
			
		}
		return max;
	}
	
}