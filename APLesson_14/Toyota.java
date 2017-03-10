public class Toyota extends Car
{
	
	//private int ID;
	private double[] location = new double[2];
	private double coordx;
	private double coordy;
	
	public Toyota()
	{
		
		//ID = 0;
		
		coordx = 0;
		coordy = 0;
		
		location[0] = 0;
		location[1] = 0;
	}
	
	public Toyota(String sp)
	{
		
		//ID = (int)(Math.random() * 1000000) + 1;
		
		String[] getsplit = sp.split(", ");
		coordx = Double.parseDouble(getsplit[0]);
		coordy = Double.parseDouble(getsplit[1]);
		
		location[0] = coordx;
		location[1] = coordy;
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