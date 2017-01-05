import java.util.Scanner;
public class GameHealth
{
	static String[] health;
	static int HEALTHLOAD;
	static int healthCount;
	
	public static void main(String[]args)
	{
		HEALTHLOAD = 6;
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[HEALTHLOAD];
		
		while(!turn.equals("q") && healthCount > 0)
		{
			System.out.println("\nYour turn! Hit enter when ready:");
			turn = kb.nextLine();
			damage = (((int)(Math.random() * 2)) + 1);
			amount = (((int)(Math.random() * 6)) + 1);
			
			System.out.print(takeDamage(damage, amount));
			printClip();
		}
		
		System.out.println("You died!");
	}
	public static String takeDamage(int damage, int amount)
	{
		if(damage == 1)
		{
			healthCount = healthCount - amount;
			return ("Taking " + amount + " damage!\t");
			
		}
		else
		{
			if(healthCount + amount < HEALTHLOAD)
			{
				healthCount = healthCount + amount;
			}
			else
			{
				healthCount = HEALTHLOAD;
			
			}

			return ("Power Up " + amount + "!\t");
		}
		
	}
	public static void printClip()
	{
		String output = "Health:\t";
		
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if(i < healthCount)
			{
				health[i] = " @ ";
			}
			else
			{
				health[i] = " [] ";
			}
			output = output + health[i];
			
		}
		
		System.out.print(output);
		
		
		
		
		
		
		
		
	}
	
	
}