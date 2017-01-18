import java.util.Scanner;
public class User
{
	
	private String firstName, lastName, avatar;
	private int userID;
	
	public User()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
	}
	
	
	public User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
		
		
	}
	
	public void setInfo(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAvatar: " + avatar + "\nUserID#: " + userID;
		
	}
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Would you like to use a public avatar?");
		String response = kb.nextLine();
		
		if(response.equals("n") || response.equals("no"))
		{
			User pH = new User("Professor", "Handsome");
			System.out.println(pH);
			System.out.println();
			
		}
		if(response.equals("y") || response.equals("yes"))
		{
			User pH2 = new User("Professor", "Handsome", "profHandsizzle");
			System.out.println(pH2);
			
		}

	
	}
	
	
}