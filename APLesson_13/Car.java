public class Car extends Toy
{

	private String name;
	private int count;
	
	Car c = new Car();
	
	public Car()
	{
		
		super();
	}
	
	public Car(String n)
	{
		
		super();
	}
	
	public String getName()
	{
	
		return name;
	}
	
	public int getCount()
	{
		
		return count;
	}
	
	public void setName(String n)
	{
		
		name = n;
	}
	
	public void setCount(int c)
	{
		
		count = c;
	}
	
	public String getType()
	{
		
		return "Car";
	}
	
	public String toString()
	{
		
		return "Car";
	}
}