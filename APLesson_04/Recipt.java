import java.util.Scanner;

public class Recipt
{
	public static void main(String [] args)
	{
		Recipt form = new Recipt();
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.format("Please enter item 1:");
		String item1 = keyboard.nextLine();
		
		System.out.format("Please enter the price:");
		Double price1 = keyboard.nextDouble();
		
		
		keyboard.nextLine();
		System.out.format("Please enter item 2:");
		String item2 = keyboard.nextLine();
		
		System.out.format("Please enter the price:");
		Double price2 = keyboard.nextDouble();
		
		
		keyboard.nextLine();
		System.out.format("Please enter item 3:");
		String item3 = keyboard.nextLine();
		
		System.out.format("Please enter the price:");
		Double price3 = keyboard.nextDouble();
		
		Double total1 = (price1 + price2 + price3);
		Double total2 = (total1 * .07);
		Double total3 = (total1 + total2);
		
		String name1 = "subtotal";
		String name2 = "tax";
		String name3 = "total";
		
		form.recipt(item1, price1);
		form.recipt(item2, price2);
		form.recipt(item3, price3);
		
		form.recipt2(name1, total1);
		form.recipt2(name2, total2);
		form.recipt2(name3, total3);
	}
	
	public void recipt(String item, double price)
	{
		
		System.out.printf("\n%15s  %10.2f", item, price);
		
	}	
	public void recipt2(String name, double total)
	{
		System.out.printf("\n%15s  %10.2f", name, total);
	}
}