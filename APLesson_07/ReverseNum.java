import java.util.Scanner;
public class ReverseNum
{
	
	static int number;
	static int num;
	static int rev;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		number = kb.nextInt(); 

		num = number;
		rev = 0;
		
		getReverse();
	}
	public static void getReverse()
	{
		while(num > 0)
		{
			rev = rev * 10;
			rev = rev + (num % 10);
			num = num / 10;
		}
		
		System.out.println(number + " reversed is " + rev);

	}
}