public class Advance extends Ticket
{
	
	private int daysLeft;
	
	public Advance()
	{
		super();
		daysLeft = 0;
	}
	
	public Advance(int dl)
	{
		super();
		daysLeft = dl;
	}
	
	public int getPrice()
	{
		if(daysLeft >= 10)
		{
			return 30;
		}
		else
		{
			return 40;
		}
	}	
	
}