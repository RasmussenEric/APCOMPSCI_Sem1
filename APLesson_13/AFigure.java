public class AFigure extends Toy
{

	private String name;
	private int count;
	
	AFigure af = new AFigure();
	
	public AFigure()
	{
		
		super();
	}
	
	public AFigure(String n)
	{
		
		super(n);
	}
	
	public String getName()
	{
	
		return name;
	}
	
	public int getCount()
	{
		
		return count;
	}
	
	public void setName(String n)
	{
		
		name = n;
	}
	
	public void setCount(int c)
	{
		
		count = c;
	}
	
	public String getType()
	{
		
		return "Action Figure";
	}
	
	public String toString()
	{
		
		return "Action Figure";
	}
	
	
}