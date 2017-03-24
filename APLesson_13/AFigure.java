public class AFigure extends Toy
{

	private String name;
	private int count;
	
	//AFigure af = new AFigure();
	
	public AFigure()
	{
		super();
	}
	
	public AFigure(String n)
	{
		super(n);
	}
	
	public void setName(String n)
	{
		super.setName(n);
	}
	
	public void setCount(int c)
	{
		super.setCount(c);
	}
	
	public String getType()
	{
		return "Action Figure";
	}	
}