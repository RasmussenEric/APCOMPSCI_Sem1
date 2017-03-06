public class Toyota implements Location
{
	
	private double[] location;
	private double coordx;
	private double coordy;
	
	public Toyota()
	{
		coordx = 0;
		coordy = 0;
		
		location[0] = 0;
		location[1] = 0;
	}
	
	public Toyota(String sp)
	{
		String[] getsplit = sp.split(", ");
		coordx = Integer.parseInt(getsplit[0]);
		coordy = Integer.parseInt(getsplit[1]);
		
		location[0] = coordx;
		location[1] = coordy;
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