import java.util.Scanner;
public class Discount
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Discount form = new Discount();
		
		System.out.println("Enter the price of your first item:");
		double item1 = kb.nextDouble();
		
		System.out.println("Enter the price of your second item:");
		double item2 = kb.nextDouble();
		
		System.out.println("Enter the price of your third item:");
		double item3 = kb.nextDouble();
		
		System.out.println("Enter the price of your fourth item:");
		double item4 = kb.nextDouble();
		
		double sub = item1 + item2 + item3 + item4;
		double tax = sub * .08;
		double discount = discount(sub);
		double total = (sub + tax) - discount;
		
		double item5 = sub;
		double item6 = tax;
		double item7 = discount;
		double item8 = total;
		
		String name1 = "Item one:";
		String name2 = "Item two:";
		String name3 = "Item three:";
		String name4 = "Item four:";
		
		String name5 = "Subtotal:";
		String name6 = "Tax:";
		String name7 = "Discount:";
		String name8 = "Total:";
		
		System.out.println("<<<<<<<<<<<Recipt>>>>>>>>>>>");
		
		form.format(name1, item1);
		form.format(name2, item2);
		form.format(name3, item3);
		form.format(name4, item4);
		
		System.out.println("\n");
		
		form.format(name5, item5);
		form.format(name6, item6);
		form.format(name7, item7);
		form.format(name8, item8);
		
		System.out.println("\n__________________________");
		System.out.println("Thank you for your support");
	}
	
	public static double discount(double sub)
	{
		double discount = 1;
		if(sub>=2000)
		{
			discount = sub * .15;
		}
		
		if(sub<2000)
		{
			discount = 0;
		}
		return discount;
	}
	
	public static void format(String name, double item)
	{
		System.out.printf("\n%12s %10.2f", name, item);
	}
}