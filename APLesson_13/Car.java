public class Car extends Toy
{

	private String name;
	private int count;
	
	//Car c = new Car();
	
	public Car()
	{
		
		super();
	}
	
	public Car(String n)
	{
		super(n);
	}
	
	public void setName(String n)
	{
		super.setName(n);
	}
	
	public void setCount(int c)
	{
		super.setCount(c);
	}
	
	public String getType()
	{
		return "Car";
	}
}