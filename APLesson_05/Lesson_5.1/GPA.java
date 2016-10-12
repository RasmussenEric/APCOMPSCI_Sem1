import java.util.Scanner;
public class GPA
{
	static String grade1;
	static String grade2;
	static String grade3;
	static String grade4;
	static String grade5;
	static String grade6;
	static String grade7;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the letter grade for your first class:");
		grade1 = kb.next();
		
		System.out.println("Enter the grade for your second class:");
		grade2 = kb.next();
		
		System.out.println("Enter the grade for your third class:");
		grade3 = kb.next();
		
		System.out.println("Enter the grade for your fourth class:");
		grade4 = kb.next();
		
		System.out.println("Enter the grade for your fifth class:");
		grade5 = kb.next();
		
		System.out.println("Enter the grade for your sixth class:");
		grade6 = kb.next();
		
		System.out.println("Enter the grade for your seventh class:");
		grade7 = kb.next();
		
		double points = calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3) + calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) +calcPoints(grade7);
		
		System.out.println("You GPA is " + points/7);
	}
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		if(grade.equals("F"))
			return 0.0;
		
		return 0.0;
	}
	
	
}