import java.util.Random;
public class Dice
{
	public static void main(String[]args)
	{
		Random ran = new Random();
		
		int player = ran.nextInt(6) + 1;
		int computer = ran.nextInt(6) + 1;
		
		String winner = rollDice(player, computer);
		
		System.out.println("You rolled a " + player);
		System.out.println("Your opponent rolled a " + computer);
		System.out.println("The winner is " + winner + "!");
		

	}
	
	public static String rollDice(int player, int computer)
	{
		boolean win = (player >= computer);
		String outcome
		if (win)
		{
			
			
		}
		
		if (!win)
		{
		
		
		}
		
		return outcome;
	}

}
