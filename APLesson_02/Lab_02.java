public class Lab_02
{
	public static void main(String[]args)
	{
		int num1 = 2;
		int num2 = 4;
		
		System.out.println(num1 + " multiplied by " + num2 + " is " + num1 * num2 + "\n");
		
		String name;
		name = "Eric Rasmussen";
		String address;
		address = "13372 Wendover Terrace";
		String City;
		City = "San Diego";
		String zip;
		zip = "CA 92130";
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(City + ", " + zip + "\n");
		
		double w = 5;
		double l = 8;
		double h = 4;
		double sa = w*l + l*h + h*w;
		
		System.out.println("The surface area of your rectangular prism is " + 2*sa);
		
	}
}