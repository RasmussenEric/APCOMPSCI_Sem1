import java.util.Scanner;
public class Adventure
{
	static int hp1;
	static int hp2;

	public static void main(String[]args)
	{
		System.out.println("Welcome to Adventurelandia!");
		System.out.println("Your goal is to defeat all the monsters in the castle.");
		adventure();
	}
	
	public static void adventure()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("\nYou enter the castle...");
		System.out.println("You encounter a slime! Do you fight, talk, or run?");
		String Choice1 = kb.next();
		if (Choice1.equals("fight"))
		{
			System.out.println("The slime is defeated! You take some wounds.\nDo you want to rest?");
			String ChoiceRest = kb.next();
			if(ChoiceRest.equals("yes"))
			{
				hp1 = 10;
			}
			if(ChoiceRest.equals("no"))
			{
				hp1 = 6;
			}
			
			System.out.println("You encounter a minotaur! Do you fight, talk, or run?");
			String Choice3 = kb.next();
			if(Choice3.equals("fight"))
			{
				System.out.println("You slay the minotaur! You take even more wounds!\nDo you want to rest?");
				String ChoiceRest2 = kb.next();
				if(ChoiceRest2.equals("yes"))
				{
					hp2 = hp1 + 4;
				}
				if(ChoiceRest2.equals("no"))
				{
					hp2 = hp1 - 4;
				}
				
				System.out.println("You reach the Throne Room. Do you fight, talk, or run?");
				String Choice4 = kb.next();
				
				
				if(Choice4.equals("fight"))
				{
					
					System.out.println("You charge the king and his soldiers.");
					if(hp2>6)
					{
						System.out.println("You defeat the king and his men. You will be remembered throughout Adventurelandia forever.");
						System.out.println("\nVictory!\n");
						System.out.println("Play Again?");
						String ChoiceRestart = kb.next();
						if(ChoiceRestart.equals("yes"))
						{
							adventure();
						}
						if(ChoiceRestart.equals("no"))
						{
							System.out.println("Game Over");
						}
					
					}
					if(hp2<=6)
					{
						System.out.println("The king and his men overpower you because you were too tired.");
						System.out.println("\nDefeat!\n");
						adventure();
					}
					
				}
				if(Choice4.equals("talk"))
				{
					System.out.println("The king thanks you for clearing his castle of monsters.");
					System.out.println("You were paid for your service, and will remembered throughout Adventurelandia forever.");
					System.out.println("\nvictory!\n");
					System.out.println("Play Again?");
					String ChoiceRestart = kb.next();
					if(ChoiceRestart.equals("yes"))
					{
						adventure();
					}
					if(ChoiceRestart.equals("no"))
					{
						System.out.println("Game Over");
					}
				}
				if(Choice4.equals("run"))
				{
					System.out.println("You run away, maybe youu'll come back later.");
					adventure();
				}
				
			}
			if(Choice3.equals("talk"))
			{
				System.out.println("The minoaur crushes you while you are half way through your speech.");
				System.out.println("\nDefeat!\n");
				adventure();
			}
			if(Choice3.equals("run"))
			{
				System.out.println("You run away, maybe you'll come back later.");
				adventure();
			}
		
		}
		if(Choice1.equals("talk"))
		{
			System.out.print("Slimes can't talk, it defeats you while you yell at it.");
			System.out.print("\nDefeat!\n");
			adventure();
			
		}
		if(Choice1.equals("run"))
		{
			System.out.println("You run away, maybe you'll come back later.");
			adventure();
		}
	}
}