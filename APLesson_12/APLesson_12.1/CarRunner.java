import java.util.Scanner;
public class CarRunner
{
	static String P;
	static String I;
	static String E;
	static String T;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your paint type:");
		P = kb.nextLine();
		
		System.out.println("Enter your interior type:");
		I = kb.nextLine();
		
		System.out.println("Enter your engine type:");
		E = kb.nextLine();
		
		System.out.println("Enter your tire type:");
		T = kb.nextLine();
		
		Car style = new Car(P, I, E, T);
		
		//prints blank
		
		//System.out.println("Your vehicle is ready.......");
		//System.out.println("Paint:    " + style.getPaint());
		//System.out.println("Interior: " + style.getInterior());
		//System.out.println("Engine:   " + style.getEngine());
		//System.out.println("Tires:    " + style.getTires());
		
		style.setCustom(P, I, E, T);
		
		System.out.println("Your vehicle is ready.......");
		System.out.println("Paint:    " + style.getPaint());
		System.out.println("Interior: " + style.getInterior());
		System.out.println("Engine:   " + style.getEngine());
		System.out.println("Tires:    " + style.getTires());
	}
	
	
}