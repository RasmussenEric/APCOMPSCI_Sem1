import java.util.Scanner;

public class RudeAI
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hi, my name is RudeAI.");
		System.out.println("I'd like to ask you a few questions.");
		System.out.println("What is your name?");
		
		String name = keyboard.next();
		
		System.out.println("Hmm... At least " + name + " is original.");
		System.out.println("How old are you " + name + "?");
		
		int age = keyboard.nextInt();
		System.out.println(age + " seems like an awkward age. Anyways...");
		System.out.println("What do you do in your spare time?");
		
		String activity = keyboard.next();
		System.out.println("Really? I HATE to " + activity + ".");
		System.out.println("What is your favorite type of music");
		
		String music = keyboard.next();
		System.out.println("Honestly, I would rather be deaf than listen to " + music + ".");
		System.out.println("How many siblings do you have?");
		
		int siblings = keyboard.nextInt();
		System.out.println("I hope that your " + siblings + " siblings are smarter than you are.");
		System.out.println("What do you want to be when you grow up?");
		
		String job = keyboard.next();
		System.out.println("I'm not sure that you're qualified to be a " + job + ".");
		System.out.println("So " + name + ", you're " + age + "...");
		System.out.println("You like to " + activity + " and listen to " + music + "...");
		System.out.println("Good luck being a " + job + ".");
		System.out.println("I'm only joking " + name);
		
		
	}
}