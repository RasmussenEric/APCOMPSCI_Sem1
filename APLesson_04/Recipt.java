import java.util.Scanner;

public class Recipt
{
	public static void main(String [] args)
	{
		Recipt form = new Recipt();
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Please enter item 1:");
		String name1 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price1 = keyboard.nextDouble();
		
		
		keyboard.nextLine();
		System.out.println("Please enter item 2:");
		String name2 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price2 = keyboard.nextDouble();
		
		
		keyboard.nextLine();
		System.out.println("Please enter item 3:");
		String name3 = keyboard.nextLine();
		
		System.out.println("Please enter the price:");
		double price3 = keyboard.nextDouble();
		
		double price4 = (price1 + price2 + price3);
		double price5 = (price4 * .08);
		double price6 = (price4 + price5);
		
		String name4 = "*        Subtotal:";
		String name5 = "*             Tax:";
		String name6 = "*           Total:";
		
		System.out.println("\n<<<<<<<<<<<<___Receipt___>>>>>>>>>>>>");
		
		form.recipt("*  " + name1, price1);
		form.recipt("*     " + name2, price2);
		form.recipt("*             " + name3, price3);
		
		System.out.println("\n");
		
		form.recipt(name4, price4);
		form.recipt(name5, price5);
		form.recipt(name6, price6);
		
		System.out.println("\n______________________________");
		System.out.println("* Thank you for your support *");
	}
	
	public void recipt(String name, double price)
	{
		System.out.printf("\n%18s  %4.2f", name + ".......",price);
		
	}	
}