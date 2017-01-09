import static java.lang.Math.*;
import java.util.Scanner;
public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
	//static int D;
	//static int H;
	//static int M;
	
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public MilesPerHour(int D, int H, int M)
	{
		distance = D;
		hours = H;
		minutes = M;
		mph = 0;
	}
	
	public void setValues(int D, int H, int M)
	{
		distance = D;
		hours = H;
		minutes = M;
		mph = 0;
	}
	
	public double getMPH()
	{
		return mph = Math.round(distance / (hours + (minutes / 60)));
	}
	
	public int getD()
	{
		return distance;
	}
	
	public int getH()
	{
		return hours;
	}
	
	public int getM()
	{
		return minutes;
	}
	

	
}