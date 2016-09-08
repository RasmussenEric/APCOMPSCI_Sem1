import java.util.Scanner;

public class Lesson_03Start
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How old are you? ");
		
		int num = keyboard.nextInt();
		System.out.println("Wow! " + num + " is perfect. You're pretty handsome.");
		
	}
}