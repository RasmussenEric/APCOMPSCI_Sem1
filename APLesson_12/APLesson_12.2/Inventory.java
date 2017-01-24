import java.util.Scanner;
public class Inventory
{
	private String Manufacturer, Name, Category;
	private int UPC, Price;
	
	public Inventory()
	{
		Name = "";
		Manufacturer = "";
		Category = "";
		UPC = 0;
		Price = 0;
		
	}
	
	public Inventory(String N, String M, String C)
	{
		Name = N;
		Manufacturer = M;
		Category = C;
		UPC = (int)(Math.random() * 1000000000) + 1;
		
	}
	
	public Inventory(String N, String M, String C, int P)
	{
		Name = N;
		Manufacturer = M;
		Category = C;
		UPC = (int)(Math.random() * 1000000000) + 1;
		Price = P;
		
	}
	
	public void setInfo(String N, String M, String C, int P)
	{
		Name = N;
		Manufacturer = M;
		Category = C;
		UPC = (int)(Math.random() * 1000000000) + 1;
		Price = P;
		
	}
	
	public String toString()
	{
		return "Item Info... \nItem Name: " + Name + "\nManufacturer: " + Manufacturer + "\nCategory: " + Category + "\nUPC: " + UPC + "\nPrice: " + Price;
	}
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Do you want to enter name and price information?");
		String response = kb.nextLine();
		
		if(response.equals("n") || response.equals("no"))
		{
			Inventory item = new Inventory("GTX 1080", "Nvidia", "NA");
			System.out.println(item);
			System.out.println();
			
		}
		if(response.equals("y") || response.equals("yes"))
		{
			System.out.println("Enter Category: ");
			String cat = kb.nextLine();
			
			System.out.println("Enter Price: ");
			int pri = kb.nextInt();
			
			Inventory item2 = new Inventory("GTX 1080", "Nvidia", cat, pri);
			System.out.println(item2);
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
}