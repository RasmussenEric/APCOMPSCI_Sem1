import java.util.Scanner;
public class HumanDriver
{
	
	static String H;
	static String E;
	static String S;
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your hair color:");
		H = kb.nextLine();
		
		System.out.println("Enter your eye color:");
		E = kb.nextLine();
		
		System.out.println("Enter your skin color:");
		S = kb.nextLine();
		
		Human info = new Human(H, E, S);
		
		info.setHES(H, E, S);
		
		System.out.println("My Info:");
		System.out.println("Hair: " + info.getHair());
		System.out.println("Eyes: " + info.getEyes());
		System.out.println("Skin: " + info.getSkin());
		
		System.out.println("\nEnter your friend's hair color:");
		H = kb.nextLine();
		
		System.out.println("Enter your friend's eye color:");
		E = kb.nextLine();
		
		System.out.println("Enter your friend's skin color:");
		S = kb.nextLine();
		
		info.setHES(H, E, S);
		
		System.out.println("Friend's Info:");
		System.out.println("Hair: " + info.getHair());
		System.out.println("Eyes: " + info.getEyes());
		System.out.println("Skin: " + info.getSkin());
	}
	
	
	
}