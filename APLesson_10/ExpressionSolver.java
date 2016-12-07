import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class ExpressionSolver
{
	static String input;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an equation:");
		input = kb.nextLine();
		System.out.println(doEquation());
		
	}
	public static ArrayList<String> doEquation()
	{
		ArrayList<String> exp = new ArrayList<>(Arrays.asList(input.split(" ")));
		
		int i = 0;
		while(i < exp.size())
		{
			if((exp.get(i).equals("*")) || (exp.get(i).equals("/")))
			{
				if(exp.get(i).equals("*"))
				{
					exp.set(i, "" + ((Integer.parseInt(exp.get(i-1))) * (Integer.parseInt(exp.get(i+1)))));
				}
				else
				{
					exp.set(i, "" + ((Integer.parseInt(exp.get(i-1))) / (Integer.parseInt(exp.get(i+1)))));
				}
				
				exp.remove(i-1);
				exp.remove(i);
				
				
			}
			
			i++;
			
		
			
		}
		i = 0;
		while(i < exp.size())
		{
			if(exp.get(i).equals("+") || exp.get(i).equals("-"))
			{
				if(exp.get(i).equals("+"))
				{
					exp.set(i, "" + ((Integer.parseInt(exp.get(i-1))) + (Integer.parseInt(exp.get(i+1)))));
				}
				else
				{
					exp.set(i, "" + ((Integer.parseInt(exp.get(i-1))) - (Integer.parseInt(exp.get(i+1)))));
				}
				
				exp.remove(i-1);
				exp.remove(i);
				
			}
			
			//exp.remove(i-1);
			//exp.remove(i);
			i++;
		}
		
		return exp;
	}
	
	
}