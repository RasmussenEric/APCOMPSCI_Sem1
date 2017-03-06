public class GMC implements Location
{
	
	private double coordx;
	private double coordy;
	
	public GMC()
	{
		
		double coordx = 0;
		double coordy = 0;
	}
	
	public GMC(int x, int y)
	{
		
		double coordx = x;
		double coordy = y;
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
		
		double[] location = new double[2];
		location[0] = coordx;
		location[1] = coordy;
		
		return location;
	}
}