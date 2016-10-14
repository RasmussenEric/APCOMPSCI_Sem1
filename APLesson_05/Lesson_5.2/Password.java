import java.util.Scanner;
public class Password
{
	static String username;
	static String password;
	public static void main(String[]args)
	{
		username = "rasmussene7186";
		password = "dog";
		
		passCheck();
	}
	
	public static void passCheck();
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your username.");
		String guess1 = kb.next();
		
		System.out.println("Enter your username.");
		String guess2 = kb.next();
		
		if(guess1.equals(username))
		{
			if(guess2.equals(password))
			{
				System.out.println("Access granted.");
			}
			else
			{
				System.out.println("Incorrect Password!");
			}
			
			
		}	
		else
		{
			if(guess2.equals(password))
			{
				System.out.println("Incorret Username");
			}
			else
			{
				System.out.println("Incorrect Username and Password.");
			}
			
			
			
		}
		
		
		
		
		
		
	}
}