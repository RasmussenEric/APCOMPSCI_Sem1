public class Honda implements Location
{
	
	private double[] location;
	private double coordx;
	private double coordy;
	
	public Honda()
	{
		
		coordx = 0;
		coordy = 0;
		
		location[0] = 0;
		location[1] = 0;
	}
	
	public Honda(double[] ar)
	{
		
		location = ar;
		
		
		
		
	}
	
	public int getID()
	{
		
		return (int)(Math.random() * 1000000) + 1;
	}
	
	public void move(int x, int y)
	{
		
		coordx = coordx + x;
		coordy = coordy + y;
	}
	
	public double[] getLoc()
	{
	
		return location;
	}
	
}