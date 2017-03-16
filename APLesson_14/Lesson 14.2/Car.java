public class Car implements Location
{
	
	public final int ID = (int)(Math.random() * 10000000) + 1;
	double[] location;
	
	public Car()
	{
		
		location = new double[2];
	}
	
	public void move(double x, double y)
	{
		
		location[0] = location[0] + x;
		location[1] = location[1] + y;
		
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