public class Test
{
	public static void main(String[]args)
	{
		int num = 10;
		
		if(num > 0)
		{
			num += 1;
		}
		if(num % 5 ==0)
		{
			System.out.println(num);
		}
		else
		{
			System.out.println(num + " is negative");
		}
	}
}