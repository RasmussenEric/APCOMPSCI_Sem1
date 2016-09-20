import java.util.Scanner;

public class Recipt
{
	public static void main(String [] args)
	{
		Recipt form = new Recipt();
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Please enter item 1:");
		String item1 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		Double price1 = keyboard.nextDouble();
		
		
		keyboard.nextLine();
		System.out.println("Please enter item 2:");
		String item2 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		Double price2 = keyboard.nextDouble();
		
		
		keyboard.nextLine();
		System.out.println("Please enter item 3:");
		String item3 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		Double price3 = keyboard.nextDouble();
		
		Double total1 = (price1 + price2 + price3);
		Double total2 = (total1 * .08);
		Double total3 = (total1 + total2);
		
		String name1 = "*        Subtotal:";
		String name2 = "*             Tax:";
		String name3 = "*           Total:";
		
		System.out.println("\n<<<<<<<<<<<<___Receipt___>>>>>>>>>>>>");
		
		form.recipt("*  " + item1, price1);
		form.recipt("*     " + item2, price2);
		form.recipt("*             " + item3, price3);
		
		System.out.println("\n");
		
		form.recipt2(name1, total1);
		form.recipt2(name2, total2);
		form.recipt2(name3, total3);
		
		System.out.println("\n______________________________");
		System.out.println("* Thank you for your support *");
	}
	
	public void recipt(String item, double price)
	{
		
		System.out.printf("\n%18s  %4.2f", item + ".......", price);
		
	}	
	public void recipt2(String name, double total)
	{
		System.out.printf("\n%18s  %4.2f", name + ".......", total);
	}
	
}