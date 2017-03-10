public class GMC extends Car
{
	//private int ID;
	private double coordx;
	private double coordy;
	
	public GMC()
	{
		
		//ID = 0;
		
		coordx = 0;
		coordy = 0;
	}
	
	public GMC(int x, int y)
	{
		
		//ID = (int)(Math.random() * 1000000) + 1;
		
		coordx = x;
		coordy = y;
		
	}
	
	public int getID()
	{
		
		return super.getID();
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