import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an equation:");
		String input = kb.nextLine();
		System.out.println(doEquation(input));
		
	}
	public static int doEquation(String input);
	{
		ArrayList<String> exp = new ArrayList<>(Arrays.asList(input.split(" ")));
		
		int i = 0;
		while(i < exp.size())
		{
			if((exp.get(i).equals("*")) || (exp.get(i).equals("/")))
			{
				if(exp.get(i) == "*")
				{
					exp.set(i, (exp.parseInt(exp.get(i-1)) * exp.parseInt(exp.get(i+1))));
				}
				else
				{
					exp.set(i, (exp.parseInt(exp.get(i-1)) / exp.parseInt(exp.get(i+1))));
				}
				exp.remove(i-1);
				exp.remove(i);
			}
			
			i++;
			
		
			
		}
		while(i < exp.size())
		{
			if(exp.get(i).equals("+") || exp.get(i).equals("-"))
			{
				if(exp.get(i) == "+")
				{
					exp.set(i, exp.parseInt(exp.get(i-1)) + exp.parseInt(exp.get(i+1)));
				}
				else
				{
					exp.set(i, exp.parseInt(exp.get(i-1)) - exp.parseInt(exp.get(i+1)));
				}
			}
			
			i++;
		}
		
		return exp;
	}
	
	
}