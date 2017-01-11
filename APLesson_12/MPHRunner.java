import java.util.Scanner;
public class MPHRunner
{
	static int D;
	static int H;
	static int M;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter distance:");
		D = kb.nextInt();
		
		System.out.println("Enter hours:");
		H = kb.nextInt();
		
		System.out.println("Enter minutes:");
		M = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(D, H, M);
		
		System.out.println(object.getD() + " miles in " + (object.getH() + (object.getM() /60)) + " hours = " + object.getMPH() + " mph");
		
		object.setValues(D, H, M);
		
		MilesPerHour object2 = new MilesPerHour(D, H, M);
		
		System.out.println(object2.getD() + " miles in " + (object2.getH() + (object2.getM()/60)) + " hours = " + object2.getMPH() + " mph");
		
		
	}
	
	
}