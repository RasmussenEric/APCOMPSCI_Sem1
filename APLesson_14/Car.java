public class Car implements Location
{
	
	private int ID;
	private double[] location;
	
	public Car()
	{
		
		ID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void move(double x, double y)
	{
		
	
		
	}
	
	public int getID()
	{
		
		return ID;
	}
	
	public double[] getLoc()
	{
		
		return location;
	}
}